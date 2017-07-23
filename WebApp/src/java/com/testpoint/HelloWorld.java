/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint;

/**
 *
 * @author Vandens mc Maddens
 */
public class HelloWorld {
    private String halo;
    private String message1;
    private String message2;
    
    //init method
    public void init(){
        System.out.println("Bean is going through init.");
    }
    
    public void setMessage(String halo){
        this.halo = halo;
    }
    
    public void getMessages(){
        System.out.println("Your message : "+halo);
    }
    
    
    public void setMessage1(String param){
        this.message1 = param;
    }
    
    public void getMessage1(){
        System.out.println("World message1 : "+message1);
    }
    
    public void setMessage2(String param){
        this.message2 = param;
    }
    
    public void getMessage2(){
        System.out.println("World Message2 : "+message2);
    }
        
    //destroy method
    public void destroy(){
        System.out.println("Bean will destroy now");
    }
   
}
