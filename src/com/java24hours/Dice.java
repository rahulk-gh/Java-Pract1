package com.java24hours;

import java.util.*;

class Dice{
    public static void main (String[] args){
        Random myGenerator = new Random();
        int value = myGenerator.nextInt();//this is a method from the Random class
        System.out.println("the random number is " + value);
    }
}