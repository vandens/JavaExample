/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.annobaseconfig;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Vandens mc Maddens
 */
public class MainApp {
    
    public static void AnnoBaseRequired(){
        ApplicationContext  context     = new ClassPathXmlApplicationContext("annobaseconfig.xml");
        
        Student_Setter student     = (Student_Setter) context.getBean("annobaserequired");
        
        System.out.println("Name        : "+student.getName());
        System.out.println("Age         : "+student.getAge());
    }
    
    public static void AnnoBaseAutowiredSetter(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("annobaseconfig.xml");
        TextEditor_Setter tx = (TextEditor_Setter) context.getBean("AnnoBaseAutowiredSetter");
        tx.spellCheck();
    }
    
    public static void AnnoBaseAutowiredConstructor(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("annobaseconfig.xml");
        TextEditor_byConstructor tx = (TextEditor_byConstructor) context.getBean("AnnoBaseAutowiredConstructor");
        tx.spellCheck();        
    }
    
    public static void AnnoBaseAutowiredQualifier(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("annobaseconfig.xml");
        Profile_Qualifier profile = (Profile_Qualifier) context.getBean("AnnoBaseAutowiredQualifier");
        profile.printAge();
        profile.printName();
    }
    
    public static void AnnoBasePostConstructnPreDestroy(){
        AbstractApplicationContext  context     = new ClassPathXmlApplicationContext("annobaseconfig.xml");
        HelloWorld  obj = (HelloWorld) context.getBean("PostConstructnPreDestroy");
        obj.getMessage();
        context.registerShutdownHook();
    }
    
    public static void main(String[] args){
        //BasicConfigurator.configure();
        //AnnoBaseRequired();
        //AnnoBaseAutowiredSetter();
        //AnnoBaseAutowiredConstructor();
        //AnnoBaseAutowiredQualifier();
        AnnoBasePostConstructnPreDestroy();
    }
    
}
