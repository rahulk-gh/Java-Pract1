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
public class ModemTester {
    public static void main(String[] args){
        CableModem surfboard = new CableModem();
        DslModem gateway = new DslModem();
        surfboard.setSpeed(500000);
        gateway.setSpeed(400000);
        System.out.println("TRying the cablemodem:");
        surfboard.displaySpeed();
        surfboard.connect();
        System.out.println("TRying the DSLmodem:");
        gateway.displaySpeed();
        gateway.connect();
    }
}
