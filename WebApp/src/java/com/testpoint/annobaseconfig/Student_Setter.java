package com.testpoint.annobaseconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;



public class Student_Setter {
    
    private Integer age;
    private String name;
    
    @Required
    //@Autowired(required=false)
    public void setAge(Integer age){
        this.age    = age;
    }
    public Integer getAge(){
        return age;
    }
    
    @Required
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}
