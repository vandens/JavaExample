/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.EventHandle;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 *
 * @author Vandens mc Maddens
 */
public class CStart_EventHandler implements ApplicationListener<ContextStartedEvent>{

    @Override
    public void onApplicationEvent(ContextStartedEvent e) {
        System.out.println("ContextStartedEvent Received.");
    }
    
    
}
