package com.java24hours;

import java.util.*;
/**
 *
 * @author rahulk-gh
 */
public class StringLister {
    String[] names = {"toto", "bunty", "bubly", "beth", "Molly", "Laura",
        "Hayden", "Kristina"};
    
    //constructor
    public StringLister(String[] moreNames){
        ArrayList<String> list = new ArrayList<String> ();
        //we dont know the total number of names that we may pass through
        //args, so array list works better than array. 
        for (int i = 0; i< names.length; i++){
            list.add(names[i]);
        }
        //morenames is from args
        for(int i = 0; i< moreNames.length; i++){
            list.add(moreNames[i]);
        }
        Collections.sort(list);
        for(String name : list){
            System.out.println(name);
        }
    }
    //main method
    public static void main(String[] args){
        StringLister lister = new StringLister(args);
    }//not sure why lister is showing up as unused. Maybe bad coding practice
    //and this was just a demo
    //another constructor without args? review constructors
}