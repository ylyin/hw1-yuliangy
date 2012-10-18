
package edu.cmu.uima.hw1;

import java.io.File;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

/**
 * A simple collection reader that reads a single file in the filesystem. It can be
 * configured with the following parameters:
 * <ul>
 * <li><code>InputFile</code> - path of the input file</li>
 * </ul>
 * 
 * 
 */
public class FileSystemCollectionReader extends CollectionReader_ImplBase {
  
  /**
   * Name of configuration parameter that must be set to the path of the input file.
   */
  public static final String PARAM_INPUTFILE = "InputFile";
  
  
  /**
   * Reference for input file.
   */
  private File inputs[];
  
  /**
   * Current index in the input array.
   */
  private int curIndex;

  /**
   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
   */
  public void initialize() throws ResourceInitializationException {
    File inputFile = new File(((String) getConfigParameterValue(PARAM_INPUTFILE)).trim());
    
    inputs = new File[1];
    inputs[0] = inputFile;
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#hasNext()
   */
  public boolean hasNext() {
    return curIndex < inputs.length;
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    // open input stream to file
    File file = (File) inputs[curIndex++];
    String text = FileUtils.file2String(file, "UTF-8");
    // put document in CAS
    jcas.setDocumentText(text);
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
   */
  public void close() throws IOException {
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
   */
  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(curIndex, inputs.length, Progress.ENTITIES) };
  }

  /**
   * Gets the total number of documents that will be returned by this collection reader. This is not
   * part of the general collection reader interface.
   * 
   * @return the number of documents in the collection
   */
  public int getNumberOfDocuments() {
    return inputs.length;
  }

}
