/*
Simple game for testing multiple interacting methods in a class
Change up to ask for user input
author rahulk-gh
*/
package com.java24hours;

import java.awt.*;//for point class
import java.util.*;//for arraylist class

public class Battlepoint{
    ArrayList<Point> targets = new ArrayList<Point>();
    
    //Setter method
    public Battlepoint(){
        //create initial targets
        createTargets();
        //display the current game map
        showMap();
        //shooting at three points inside the 9x9 grid starting 1
        shoot(3,2);
        shoot(9,2);
        shoot(7,4);
        showMap();
    }
    
    private void showMap(){
        System.out.println("\n   1  2  3  4  5  6  7  8  9");
        for (int column = 1; column <10; column++){
            //outer loop does column and inner does rows
            for(int row = 1; row< 10; row++){
                if (row ==1){
                    System.out.print(column + " ");
                }
                System.out.print(" ");
                Point cell = new Point(row, column);
                if (targets.indexOf(cell)> -1){
                    //a target is in this position
                    System.out.print("X");
                } else {
                    //no target
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private void createTargets(){
        Point p1 = new Point(8,4);
        targets.add(p1);
        Point p2 = new Point(1,1);
        targets.add(p2);
        Point p3 = new Point(9,2);
        targets.add(p3);
    }
    
    private void shoot(int x, int y){
        Point shot = new Point(x,y);
        System.out.print("firing at ("+ x + ","+ y + ")..." );
        if (targets.indexOf(shot)> -1){
            System.out.println("you sank my battlepoint!");
            //delete the destroyed target
            targets.remove(shot);
        } else {
            System.out.println("miss.");
        }
    }
    
    public static void main(String[] args) {
        new Battlepoint();
    }
}