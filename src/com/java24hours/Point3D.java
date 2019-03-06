            
package com.java24hours;

import java.awt.*;
/**
 **The purpose here to extend an already existing class Point in the java.awt
*package (abstract window toolkit)
*. No main classes

 * @author Rahulk-gh
 * 
 */
public class Point3D extends Point{
    //point already contains x and y. It contains move() and translate()
    
    public int z;
    
    public Point3D(int x, int y, int z){
        super(x,y);//sets constructor that inherited from the super class
        this.z = z;//sets object variable z equal to z value sent as an argument
        //, they are two different z's
    }
    
    public void move(int x, int y, int z){
        this.z =z;
        super.move(x, y);
    }
    
    public void translate(int x, int y, int z){
        this.z += z;
        super.translate(x,y);
    }
}
