package com.testpoint.javabaseconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Vandens mc Maddens
 */
@Configuration
public class HelloWorldConfig {
    
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
    /*
    The above code will be equivalent to the following XML configuration:
    <beans>
        <bean id="helloWorld" class="com.tutorialspoint.HelloWorld" />
    </beans>
    */
    
}
