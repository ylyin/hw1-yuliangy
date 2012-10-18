

/* First created by JCasGen Sat Oct 06 20:59:44 EDT 2012 */
package edu.cmu.uima.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 17 16:43:34 EDT 2012
 * XML source: /Users/admin/Softwares/eclipse-java/workspace/hw1-yuliangy/src/main/resources/descriptors/ner/NERTypeSystem.xml
 * @generated */
public class GeneMention extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneMention.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneMention(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: SentenceIdentifier

  /** getter for SentenceIdentifier - gets The sentence identifier of the sentence that the gene mention belongs to.
   * @generated */
  public String getSentenceIdentifier() {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_SentenceIdentifier == null)
      jcasType.jcas.throwFeatMissing("SentenceIdentifier", "edu.cmu.uima.hw1.GeneMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneMention_Type)jcasType).casFeatCode_SentenceIdentifier);}
    
  /** setter for SentenceIdentifier - sets The sentence identifier of the sentence that the gene mention belongs to. 
   * @generated */
  public void setSentenceIdentifier(String v) {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_SentenceIdentifier == null)
      jcasType.jcas.throwFeatMissing("SentenceIdentifier", "edu.cmu.uima.hw1.GeneMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneMention_Type)jcasType).casFeatCode_SentenceIdentifier, v);}    
   
    
  //*--------------*
  //* Feature: Phrase

  /** getter for Phrase - gets 
   * @generated */
  public String getPhrase() {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_Phrase == null)
      jcasType.jcas.throwFeatMissing("Phrase", "edu.cmu.uima.hw1.GeneMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneMention_Type)jcasType).casFeatCode_Phrase);}
    
  /** setter for Phrase - sets  
   * @generated */
  public void setPhrase(String v) {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_Phrase == null)
      jcasType.jcas.throwFeatMissing("Phrase", "edu.cmu.uima.hw1.GeneMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneMention_Type)jcasType).casFeatCode_Phrase, v);}    
   
    
  //*--------------*
  //* Feature: StartOffset

  /** getter for StartOffset - gets 
   * @generated */
  public int getStartOffset() {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_StartOffset == null)
      jcasType.jcas.throwFeatMissing("StartOffset", "edu.cmu.uima.hw1.GeneMention");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneMention_Type)jcasType).casFeatCode_StartOffset);}
    
  /** setter for StartOffset - sets  
   * @generated */
  public void setStartOffset(int v) {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_StartOffset == null)
      jcasType.jcas.throwFeatMissing("StartOffset", "edu.cmu.uima.hw1.GeneMention");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneMention_Type)jcasType).casFeatCode_StartOffset, v);}    
   
    
  //*--------------*
  //* Feature: EndOffset

  /** getter for EndOffset - gets 
   * @generated */
  public int getEndOffset() {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_EndOffset == null)
      jcasType.jcas.throwFeatMissing("EndOffset", "edu.cmu.uima.hw1.GeneMention");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneMention_Type)jcasType).casFeatCode_EndOffset);}
    
  /** setter for EndOffset - sets  
   * @generated */
  public void setEndOffset(int v) {
    if (GeneMention_Type.featOkTst && ((GeneMention_Type)jcasType).casFeat_EndOffset == null)
      jcasType.jcas.throwFeatMissing("EndOffset", "edu.cmu.uima.hw1.GeneMention");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneMention_Type)jcasType).casFeatCode_EndOffset, v);}    
  }

    