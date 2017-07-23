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
public class TextEditor_byConstructor {
    private SpellChecker spellChecker;
    
    @Autowired
    public TextEditor_byConstructor(SpellChecker spellChecker){
        System.out.println("Inside texteditor constructor.");
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
