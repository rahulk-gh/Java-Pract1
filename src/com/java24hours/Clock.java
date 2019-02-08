package com.java24hours;

import java.time.*;
import java.time.temporal.*;

class Clock {
    public static void main(String[] args){
        //getting current time and date
        LocalDateTime now1 = LocalDateTime.now();
        int hour = now1.get(ChronoField.HOUR_OF_DAY);
        int minute = now1.get(ChronoField.MINUTE_OF_HOUR);
        int month = now1.get(ChronoField.MONTH_OF_YEAR);
        int day = now1.get(ChronoField.DAY_OF_MONTH);
        int year = now1.get(ChronoField.YEAR);
        
        //display greeting
        if(hour <12){
            System.out.println("Good Morning\n");
        } else if(hour<17){
            System.out.println("Good afternoon\n");         
        } else {
            System.out.println("Good evening\n");
        }
        
        //begin time by showing minutes
        System.out.print("It's ");
        if (minute != 0){
            System.out.print(minute + " " );
            System.out.print((minute !=1) ? "minutes": "minute");
            System.out.print(" past");
        }
        //displaying the hour
        System.out.print(" ");
        System.out.print((hour>12) ? (hour -12) : hour);
        System.out.print(" o'clock on ");
        
        //display time of month
        switch(month){
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
        }
        
        //Display the date and Year
        System.out.println(" "+ day+ ", " + year + "." );
    }
}