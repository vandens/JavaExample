/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.javabaseconfig;

/**
 *
 * @author Vandens mc Maddens
 */
public class LifeCycleCallBacks {
    
    public void init(){
        System.out.println("Init processed!");
    }
    
    public void cleanup(){
        System.out.println("Destruction logic");
    }
}
