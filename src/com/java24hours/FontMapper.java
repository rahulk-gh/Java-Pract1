/*
testing hashmaps
 */
package com.java24hours;

import java.awt.*;
import java.util.*;
/**
 *
 * @author rahulk-gh
 */
public class FontMapper {
    public FontMapper(){
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times new roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        HashMap<String, Font> myfonts = new HashMap<>();
        myfonts.put("smallprint", courier);
        myfonts.put("body", times);
        myfonts.put("headline", verdana);
        for (Map.Entry<String, Font> member :myfonts.entrySet()){
            String key = member.getKey();
            Font value = member.getValue();
            System.out.println(key+ ": "+ value.getSize()+ "-pt "
            + value.getFontName());
        }
    }
    
    public static void main(String[] args){
        new FontMapper(); //here we didnt attach it to a variable name
    }
}
