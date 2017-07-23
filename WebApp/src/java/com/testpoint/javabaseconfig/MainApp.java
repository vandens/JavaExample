package com.testpoint.javabaseconfig;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Vandens mc Maddens
 */
public class MainApp {
    
    public static void helloWorldConfig(){
        ApplicationContext context  = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        
        HelloWorld  helloWorld  = context.getBean(HelloWorld.class);
        
        helloWorld.setMessage("Hello Dunia!");
        helloWorld.getMessage();
    } 
    
    public static void injectingBean(){
        ApplicationContext context  = new AnnotationConfigApplicationContext (TextEditor_InjectingBeanConfig.class);
        TextEditor_InjectingBean tx    = context.getBean(TextEditor_InjectingBean.class);
        tx.spellCheck();
    }
    
    public static void lifeCycleBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleCallBacksConfig.class);
        LifeCycleCallBacks LCCB = context.getBean(LifeCycleCallBacks.class);
        LCCB.cleanup();
    }
    
    
    public static void main(String[] args){
        //BasicConfigurator.configure();
        //helloWorldConfig();
        //injectingBean();
        lifeCycleBean();
    }
    
}
