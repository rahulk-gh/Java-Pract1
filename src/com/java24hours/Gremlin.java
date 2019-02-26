/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

/**
 *
 * @author Rahulk-gh
 */
public class Gremlin {
    static int gremlinCount =0; // this is a class variable
    
    public Gremlin(){
        gremlinCount++;
    }//this is unique - everytime a new gremlin object is created, the count
    //goes up. 
    
    static int getGremlinCount(){
        return gremlinCount;
    }
}
