package com.java24hours;

class NewRoot{
    public static void main(String[] args){
        int number =0;
        if (args.length > 0){
            number = Integer.parseInt(args[0]);
        }
        System.out.println("The square root of "
                + number
                + " is "
                + Math.sqrt(number)
        );
    }
}