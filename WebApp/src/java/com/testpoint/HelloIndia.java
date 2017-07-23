package com.testpoint;

/**
 *
 * @author Vandens mc Maddens
 */
public class HelloIndia {

    private String message1;
    private String message2;
    private String message3;
    
    public void setMessage1(String val){
        this.message1   = val;
    }
    public void setMessage2(String val){
        this.message2   = val;
    }
    public void setMessage3(String val){
        this.message3   = val;
    }
    
    public void getMessage1(){
        System.out.println("India Message 1 : "+message1);
    }
    public void getMessage2(){
        System.out.println("India Message 2 : "+message2);
    }
    public void getMessage3(){
        System.out.println("India Message 3 : "+message3);
    }
}
