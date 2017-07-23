package com.testpoint.javabaseconfig;

/**
 *
 * @author Vandens mc Maddens
 */
class TextEditor_InjectingBean {
    
    private SpellChecker_InjectingBean spellChecker;
    
    public TextEditor_InjectingBean(SpellChecker_InjectingBean spellChecker){
        System.out.println("Inside TextEditor injectionbean constructor.");
        this.spellChecker   = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
