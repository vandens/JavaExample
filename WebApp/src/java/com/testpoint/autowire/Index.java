package com.testpoint.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Vandens mc Maddens
 */
public class Index {

    public static void SpellCheck(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiring.xml");
        TextEditor tx = (TextEditor) context.getBean("textEditor");
        tx.spellCheck();
    }
    
    public static void main(String[] args){
        SpellCheck();
    }
}
