/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author simmg9723
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        RobotSE link = new RobotSE(hyrule, 0, 0, Direction.EAST);

        //walls go here
        new Wall(hyrule, 0, 4, Direction.EAST);

        //(things) go here
        new Thing(hyrule, 0, 5);
        //new Thing(hyrule, 0, 3);

        while (true) {
            link.move();
            if (!link.frontIsClear() || link.canPickThing()) {
                break;
            }
        }
    }
}
