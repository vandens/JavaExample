/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.annobaseconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Vandens mc Maddens
 */
public class Profile_Qualifier {
    
    @Autowired
    @Qualifier("student_qualifier2")
    private Student_Qualifier student;
    
    public Profile_Qualifier(){
        System.out.println("Inside profile constructor.");
    }
    public void printAge(){
        System.out.println("Age : "+student.getAge());
    }
    public void printName(){
        System.out.println("Name : "+student.getName());
    }
}
