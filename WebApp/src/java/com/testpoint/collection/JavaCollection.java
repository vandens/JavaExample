package com.testpoint.collection;

import java.util.*;

/**
 *
 * @author Vandens mc Maddens
 */
public class JavaCollection {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProp;
    
    // a setter method to set List
    public void setAddressList(List param){
        this.addressList = param;
    }
    //prints adn returns all the elements of the list
    public List getAddressList(){
        System.out.println("List Elements : "+addressList);
        return addressList;
    }
    
    // a setter method to set Set
    public void setAddressSet(Set addressSet){
        this.addressSet     = addressSet;
    }
    
    // prints and returns all the elements of the set
    public Set getAddressSet(){
        System.out.println("Set Elements : "+addressSet);
        return addressSet;
    }
    
    // a setter method to set Map
    public void setAddressMap(Map addressMap){
        this.addressMap     = addressMap;
    }
    
    // prints and returns all the elements of the Map
    public Map getAddressMap(){
        System.out.println("Map elements : "+addressMap);
        return addressMap;
    }
    
    // a setter method to set Property
    public void setAddressProp(Properties addressProp){
        this.addressProp = addressProp;
    }
    // prints and return all the elements of the property
    public Properties getAddressProp(){
        System.out.println("Property Elements : "+addressProp);
        return addressProp;
    }
}
