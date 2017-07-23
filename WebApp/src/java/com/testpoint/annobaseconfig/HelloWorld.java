package com.testpoint.annobaseconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author Vandens mc Maddens
 */
public class HelloWorld {
    
    private String message;
    public void setMessage(String val){
        this.message    = val;
    }
    public String getMessage(){
        System.out.println("Your message : "+message);
        return message;
    }
    
    @PostConstruct
    public void init(){
        System.out.println("Bean is going throuh init.");
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
    
}

