/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.javabaseconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Vandens mc Maddens
 */
@Configuration
public class LifeCycleCallBacksConfig {
    
    //@Bean(initMethod="init", destroyMethod="cleanup") //without scope
    @Bean
    @Scope("prototype")
    public LifeCycleCallBacks lccb(){
        return new LifeCycleCallBacks();
    }
}
