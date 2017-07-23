/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.EventHandle;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 *
 * @author Vandens mc Maddens
 */
public class CStop_EventHandler implements ApplicationListener<ContextStoppedEvent>{

    @Override
    public void onApplicationEvent(ContextStoppedEvent e) {
        System.out.println("ContextStoppedEvent Received.");
    }
    
    
}
