/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.EventHandle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Vandens mc Maddens
 */
public class Main {
    
    public static void HW_EventHandle(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventHandler.xml");
     
        //let us raise a start event
        context.start();
        
        HelloWorld_EventHandle obj  = (HelloWorld_EventHandle) context.getBean("HelloWorld_EventHandle");
        obj.getMessage();
        
        //let us raise a stop event
        context.stop();
    }
    
    public static void CustomEventHandler(){
        ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext("EventHandler.xml");
        
        CustomEventPublisher CVP = (CustomEventPublisher) context.getBean("customEventPublisher");
        CVP.publish();
        CVP.publish();
    }
    
    public static void main(String[] args){
        //HW_EventHandle();
        CustomEventHandler();
    }
    
}
