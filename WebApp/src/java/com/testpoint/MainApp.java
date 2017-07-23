
package com.testpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Vandens mc Maddens
 */
@Controller
@RequestMapping("/")
public class MainApp {
    
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public ModelAndView doGetAdd(){
        return new ModelAndView("MainApp/add");
    }
    
    public void defaltMethod(){
        
        //ApplicationContext context  = new ClassPathXmlApplicationContext("Beans.xml");
        ApplicationContext context  = new FileSystemXmlApplicationContext("D:/1. Projects/2. Aplikasi/19. Partner-Agent//simulator/src/java/Beans.xml");
        HelloWorld obj  = (HelloWorld) context.getBean("helloWorld");
                obj.getMessages();
    }
    
    public void singletonScope(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld_Singleton");
        objA.setMessage("I'm object A");
        objA.getMessages();
        
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld_Singleton");
        objB.getMessages();
        //Your message : I'm object A
        //Your message : I'm object A
    }
    
    public void prototypeScope(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld_prototype");
        objA.setMessage("I'm object A");
        objA.getMessages();
        
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld_prototype");
        objB.getMessages();
        //will produce
        //Your message : I'm object A
        //Your message : null
    }
    
    public void destroyBean(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        HelloWorld obj  = (HelloWorld) context.getBean("helloWorld_destroy");
        obj.getMessages();
        context.registerShutdownHook();
        /*
        Bean is going through init.
        Your message : Hello World!
        Bean will destroy now
        */
    }
    
    public void initializationBean(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        HelloWorld obj  = (HelloWorld) context.getBean("helloWorld_init");
        obj.getMessages();
        context.registerShutdownHook();
        /*
        BeforeInitialization :  helloWorld_init
        Bean is going through init.
        AfterInitialization : helloWorld_init
        Your message : Hello World!
        Bean will destroy now
        */
    }
    
    
    public void messageIndia(){
        
        ApplicationContext context  = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA  = (HelloWorld) context.getBean("helloWorld_parents");
                   objA.getMessage1();
                   objA.getMessage2();
        
        HelloIndia objB  = (HelloIndia) context.getBean("helloIndia_child");
                   objB.getMessage1();
                   objB.getMessage2();
                   objB.getMessage3();
        /*
            World message1 : hello World
            World Message2 : Hello second world
            India Message 1 : Hello India
            India Message 2 : Hello second world
            India Message 3 : NameState India
        */
    }
    
    public void spellCheck(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor  tx = (TextEditor) context.getBean("textEditor");
        tx.spellCheck();
    }
    
    public static void main(String[] arg){
        MainApp MA = new MainApp();
        MA.defaltMethod();
        MA.singletonScope();
        MA.prototypeScope();
        //MA.destroyBean();
        //MA.initializationBean();
        MA.messageIndia();
        MA.spellCheck();
    }
}
