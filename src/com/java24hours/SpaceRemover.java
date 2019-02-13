package com.java24hours;

class SpaceRemover{
    public static void main(String[] args){
        String mostFamous= "king kong is the king of the forest";
        char[] mfl= mostFamous.toCharArray();//both work
//        char mfl[]= mostFamous.toCharArray();
        for(int cnt =0; cnt < mfl.length; cnt++){
            char current = mfl[cnt];
            if (current == ' '){
                System.out.print(',');
                continue;
            }
            System.out.print(current);
        }
        System.out.println();
        System.out.println(mfl.length);
        System.out.println(mfl);
        
    }
}