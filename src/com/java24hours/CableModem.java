/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

/**
 *
 * @author rahulk-gh
 */
public class CableModem extends Modem {
    String method = "cable connections";
    
    public void connect(){
        System.out.println("Connecting to the internet...");
        System.out.println("Using a "+ method);
        
    }
}
        
