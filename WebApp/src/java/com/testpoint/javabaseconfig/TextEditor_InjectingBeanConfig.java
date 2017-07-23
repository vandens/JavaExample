/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.javabaseconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Vandens mc Maddens
 */
@Configuration
public class TextEditor_InjectingBeanConfig {
    
    @Bean
    public TextEditor_InjectingBean TextEditor_InjectingBeanConfig(){
        return new TextEditor_InjectingBean(spellChecker());
    }
    @Bean
    public SpellChecker_InjectingBean spellChecker(){
        return new SpellChecker_InjectingBean();
    }
}
