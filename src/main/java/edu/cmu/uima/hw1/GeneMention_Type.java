
/* First created by JCasGen Sat Oct 06 20:59:44 EDT 2012 */
package edu.cmu.uima.hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Oct 17 16:43:34 EDT 2012
 * @generated */
public class GeneMention_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneMention_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneMention_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneMention(addr, GeneMention_Type.this);
  			   GeneMention_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneMention(addr, GeneMention_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneMention.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.uima.hw1.GeneMention");



  /** @generated */
  final Feature casFeat_SentenceIdentifier;
  /** @generated */
  final int     casFeatCode_SentenceIdentifier;
  /** @generated */ 
  public String getSentenceIdentifier(int addr) {
        if (featOkTst && casFeat_SentenceIdentifier == null)
      jcas.throwFeatMissing("SentenceIdentifier", "edu.cmu.uima.hw1.GeneMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceIdentifier);
  }
  /** @generated */    
  public void setSentenceIdentifier(int addr, String v) {
        if (featOkTst && casFeat_SentenceIdentifier == null)
      jcas.throwFeatMissing("SentenceIdentifier", "edu.cmu.uima.hw1.GeneMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceIdentifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Phrase;
  /** @generated */
  final int     casFeatCode_Phrase;
  /** @generated */ 
  public String getPhrase(int addr) {
        if (featOkTst && casFeat_Phrase == null)
      jcas.throwFeatMissing("Phrase", "edu.cmu.uima.hw1.GeneMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Phrase);
  }
  /** @generated */    
  public void setPhrase(int addr, String v) {
        if (featOkTst && casFeat_Phrase == null)
      jcas.throwFeatMissing("Phrase", "edu.cmu.uima.hw1.GeneMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_Phrase, v);}
    
  
 
  /** @generated */
  final Feature casFeat_StartOffset;
  /** @generated */
  final int     casFeatCode_StartOffset;
  /** @generated */ 
  public int getStartOffset(int addr) {
        if (featOkTst && casFeat_StartOffset == null)
      jcas.throwFeatMissing("StartOffset", "edu.cmu.uima.hw1.GeneMention");
    return ll_cas.ll_getIntValue(addr, casFeatCode_StartOffset);
  }
  /** @generated */    
  public void setStartOffset(int addr, int v) {
        if (featOkTst && casFeat_StartOffset == null)
      jcas.throwFeatMissing("StartOffset", "edu.cmu.uima.hw1.GeneMention");
    ll_cas.ll_setIntValue(addr, casFeatCode_StartOffset, v);}
    
  
 
  /** @generated */
  final Feature casFeat_EndOffset;
  /** @generated */
  final int     casFeatCode_EndOffset;
  /** @generated */ 
  public int getEndOffset(int addr) {
        if (featOkTst && casFeat_EndOffset == null)
      jcas.throwFeatMissing("EndOffset", "edu.cmu.uima.hw1.GeneMention");
    return ll_cas.ll_getIntValue(addr, casFeatCode_EndOffset);
  }
  /** @generated */    
  public void setEndOffset(int addr, int v) {
        if (featOkTst && casFeat_EndOffset == null)
      jcas.throwFeatMissing("EndOffset", "edu.cmu.uima.hw1.GeneMention");
    ll_cas.ll_setIntValue(addr, casFeatCode_EndOffset, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceIdentifier = jcas.getRequiredFeatureDE(casType, "SentenceIdentifier", "uima.cas.String", featOkTst);
    casFeatCode_SentenceIdentifier  = (null == casFeat_SentenceIdentifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceIdentifier).getCode();

 
    casFeat_Phrase = jcas.getRequiredFeatureDE(casType, "Phrase", "uima.cas.String", featOkTst);
    casFeatCode_Phrase  = (null == casFeat_Phrase) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Phrase).getCode();

 
    casFeat_StartOffset = jcas.getRequiredFeatureDE(casType, "StartOffset", "uima.cas.Integer", featOkTst);
    casFeatCode_StartOffset  = (null == casFeat_StartOffset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StartOffset).getCode();

 
    casFeat_EndOffset = jcas.getRequiredFeatureDE(casType, "EndOffset", "uima.cas.Integer", featOkTst);
    casFeatCode_EndOffset  = (null == casFeat_EndOffset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_EndOffset).getCode();

  }
}



    