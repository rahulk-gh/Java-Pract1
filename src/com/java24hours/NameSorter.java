package com.java24hours;

import java.util.*;
//here we are using sort but it deals with capitals and small letters
//differently. So we have to correct the case first. The following code 
//doesnt do that

class NameSorter{
    public static void main(String[] args){
        String names[] = {"glimmer", "mary", "Raul", "clive", "teresa", 
            "folly", "Anna"};
        System.out.println("the original order is ");
        for (int i= 0; i< names.length; i++){
            System.out.println(i+ ":"+ names[i]);
        }
        
        System.out.println();
        Arrays.sort(names);//seems to actually sort the passed array, not return another sorted array
        for (int i= 0; i< names.length; i++){
            System.out.println(i+ ":"+ names[i]);
        }
        System.out.println();
    }
}