/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.EventHandle;

import org.springframework.context.ApplicationListener;

/**
 *
 * @author Vandens mc Maddens
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent>{

    @Override
    public void onApplicationEvent(CustomEvent e) {
        System.out.println(e.toString());
    }
    
    
    
}
