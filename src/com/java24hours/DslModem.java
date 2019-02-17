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
public class DslModem extends Modem{
    String method = "DSL phone connection";
    
    public void connect(){
        System.out.println("connecting to the internet...");
        System.out.println("Using a "+ method);
    }
}
