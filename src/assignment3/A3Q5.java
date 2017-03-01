/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author simmg9723
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        RobotSE link = new RobotSE(hyrule, 1, 1, Direction.EAST);

        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);

        link.pickThing();
        link.move();
        link.putThing();
        for( int i = 0; i < 9; i++) {
            link.turnAround();
            link.move();
            link.turnAround();
            link.pickThing();
            link.move();
            link.putThing();
        }
    }
}