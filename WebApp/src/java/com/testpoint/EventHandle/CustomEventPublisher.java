/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testpoint.EventHandle;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 *
 * @author Vandens mc Maddens
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware{
    
    private ApplicationEventPublisher publisher;
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher  = publisher;
    }
    
    public void publish(){
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }
    
}
