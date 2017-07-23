package com.testpoint.collection;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Vandens mc Maddens
 */
public class Index {
    static Logger log = Logger.getLogger(Index.class.getName());
    public static void javaCollection(){        
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBean.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
        
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();        
    }
    
    public void injectBeanCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBean.xml");
        JavaCollection jc = (JavaCollection) context.getBean("injectCollectionBean");
        List address1 = new ArrayList();
        address1.add("Jakarta");
        address1.add("Bandung");
        address1.add("Semarang");
        jc.setAddressList(address1);
        
        for(Object l : jc.getAddressList()){
            System.out.println(l);
            log.info("List : "+l.toString());
        }
    }
    
    public static void main(String[] args){
        BasicConfigurator.configure();
        Index x = new Index();
        x.injectBeanCollection();
    }
    
}
