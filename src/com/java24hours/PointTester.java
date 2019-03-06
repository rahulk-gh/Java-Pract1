
package com.java24hours;

import java.awt.*;
//why do we have  to import this again???

/**
 *This is to test out 
 * @author rahulk-gh
 */
public class PointTester {
    public static void main(String[] args){
        Point location1 = new Point (11,22);
        Point3D location2 = new Point3D (7,3,43);
        
        System.out.println("The 2D point is at ("+ location1.x + "," +
                location1.y+ ")");
        System.out.println("We moved it to (22,20)");
        location1.move(22, 20);
        System.out.println("The 2D point is now at ("+ location1.x + "," +
                location1.y+ ")");
        System.out.println("We moved it by -10 on both axes");
        location1.translate(-10,-10);
        System.out.println("The 2D point ended up at ("+ location1.x + "," +
                location1.y+ ")\n");
        //testing reading x & y, how to move and translate it etc
        
        //testing if we can still work the subclass and its methods
        System.out.println("The 3D point is at ("+ location2.x + "," +
                location2.y+ ","+location2.z +")");
        System.out.println("We moved it to (10, 11, 12)");
        location2.move(10, 11, 12);
        System.out.println("We moved it by 20 all axes");
        location2.translate(20,20,20);
        System.out.println("The 3D point ended up at ("+ location2.x + "," +
                location2.y+ ","+location2.z +")");
    }
}
