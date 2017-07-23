/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.EventHandle;

/**
 *
 * @author Vandens mc Maddens
 */
public class HelloWorld_EventHandle {
    
    private String message;
    
    public void setMessage(String msg){
        this.message = msg;
    }
    
    public void getMessage(){
        System.out.println("Your message : "+message);
    }
}
