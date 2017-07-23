package com.testpoint.annobaseconfig;

import javax.annotation.Resource;

/**
 * 
 * @author Vandens mc Maddens
 */
public class TextEditor_Resources {
    private SpellChecker spellChecker;
    
    @Resource(name="spellChecker")
    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker   = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}

/*
ga ada di mainApp, just description :
If no 'name' is specified explicitly, the default name is derived from the field name or setter
method. In case of a field, it takes the field name; in case of a setter method, it takes the
bean property name
*/