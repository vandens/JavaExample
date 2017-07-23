/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.annobaseconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Vandens mc Maddens
 */
public class TextEditor_Setter {
    private SpellChecker spellChecker;
    
    @Autowired
    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker  = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
    
}
