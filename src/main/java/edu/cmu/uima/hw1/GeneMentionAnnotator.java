package edu.cmu.uima.hw1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceAccessException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;

/**
 * 
 * @author Yuliang Yin
 * 
 * A simple annotator tries to identify gene tags from a document by using LingPipe package.
 * Specifically, it uses the 'ne-en-bio-genetag.HmmChunker' model and confidence chunker to
 * do the job.
 *
 */
public class GeneMentionAnnotator extends JCasAnnotator_ImplBase {

  /**
   * The maximum number of chunks that the chunker will return in order of confidence.
   */
  private static final int MAX_N_BEST_CHUNKS = 8;
  
  /**
   * The confidence threshold to help us decide whether we should consider a chunk as
   * a true gene tag.
   */
  private static final double CONFIDENCE_THRESHOLD = 0.5;

  /**
   * A confidence chunker that provided by LingPipe
   */
  private ConfidenceChunker chunker;

  /**
   * Process a JCas which contains the text content of a document that is going to be
   * recognized. After identifying gene tags, insert them to the JCas in form of
   * GeneMention type.
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // Get document text
    String docText = aJCas.getDocumentText();

    // Create chunker
    if (chunker == null)
      try {
        chunker = (ConfidenceChunker) AbstractExternalizable.readObject(new File(getContext()
                .getResourceFilePath("HmmChunker")));
      } catch (IOException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (ResourceAccessException e) {
        e.printStackTrace();
      }

    // Create scanner for text
    Scanner scanner = new Scanner(docText);
    int pos = 0;

    while (scanner.hasNextLine()) {
      // Get each line
      String line = scanner.nextLine();

      // Index of first white space
      int firstSpace = line.indexOf(" ");
      // Extract sentence identifier
      String identifier = line.substring(0, firstSpace);
      String sentence = line.substring(firstSpace + 1);
      char[] cs = sentence.toCharArray();

      // Extract gene mentions
      Iterator<Chunk> it = chunker.nBestChunks(cs, 0, cs.length, MAX_N_BEST_CHUNKS);

      while (it.hasNext()) {
        Chunk chunk = it.next();

        // Get begin and end
        int begin = chunk.start();
        int end = chunk.end();
        // Get confidence
        double conf = Math.pow(2.0, chunk.score());

        // Ignore confidence less than 0.5
        if (conf < CONFIDENCE_THRESHOLD)
          continue;

        // Create an annotation
        GeneMention annotation = new GeneMention(aJCas);
        annotation.setBegin(pos + firstSpace + 1 + begin);
        annotation.setEnd(pos + firstSpace + 1 + end);
        annotation.setPhrase(sentence.substring(begin, end));
        annotation.setStartOffset(sentence.substring(0, begin).replace(" ", "").length());
        annotation.setEndOffset(sentence.substring(0, end).replace(" ", "").length() - 1);
        annotation.setSentenceIdentifier(identifier);
        annotation.addToIndexes();
      }

      pos += (line.length() + 1);
    }
  }

}
