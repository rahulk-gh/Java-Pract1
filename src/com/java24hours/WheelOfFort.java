package com.java24hours;

class WheelOfFort{
    public static void main(String[] args){
        String[] phrase = {
            "say hello to my little friend",
            "clever girl",
            "i want my mtv",
            "teen titans go",
            "it's a wonderful life",
            "play it again, sam",
            "taste the rainbow",
            "you can save so much on your car insurance",
            "every good boy does fine"
        };
        int[] alphabet = new int[26];
        //below loop goes through the phrases and focuses on a single string 
        for (int i = 0; i < phrase.length; i++ ){
            String current = phrase[i];
            char[] letters = current.toCharArray();
            //below loop takes each character and counts in with char values
            for (int j =0; j< letters.length; j++ ){
                char currChar = letters[j];
                if((currChar >='a')& (currChar<='z')){
                    alphabet[currChar -'a']++;
                }
            }
        }
        //very interesting counting based on number values attached to the 
        //char values of a to 
        for(char count = 'a'; count <='z'; count++){
            System.out.print(count + ": "+ 
                   alphabet[count-'a'] + " " );
            System.out.println();
    }
}}