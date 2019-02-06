package com.java24hours;

import java.time.*;
import java.time.temporal.*;

class Clock {
    public static void main(String[] args){
        //getting current time and date
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        //display greeting
        if(hour <12){
            System.out.println("Good Morning\n");
        } else if(hour<17){
            System.out.println("Good afternoon\n");         
        } else {
            System.out.println("Good evening\n");
        }
        
        //begin time by showing minutes
        System.out.println("It's ");
    }
}