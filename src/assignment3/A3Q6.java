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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        RobotSE link = new RobotSE(hyrule, 0, 1, Direction.SOUTH);

        hyrule.showThingCounts(true);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 1, 1);
        new Thing(hyrule, 2, 1);
        new Thing(hyrule, 2, 1);
        new Thing(hyrule, 3, 1);
        new Thing(hyrule, 3, 1);
        new Thing(hyrule, 3, 1);
        new Thing(hyrule, 3, 1);
        new Thing(hyrule, 3, 1);
        new Thing(hyrule, 4, 1);
        new Thing(hyrule, 4, 1);
        new Thing(hyrule, 4, 1);
        new Thing(hyrule, 4, 1);

        link.move();
        while (link.canPickThing()) {
            link.turnLeft();
            link.pickAllThings();
            if (link.countThingsInBackpack() == 1) {
                link.putAllThings();
            } else if (link.countThingsInBackpack() == 2) {
                link.putThing();
                link.move();
                link.putThing();
                link.turnAround();
                link.move();
            } else if (link.countThingsInBackpack() == 3) {
                link.putThing();
                link.move();
                link.putThing();
                link.move();
                link.putThing();
                link.turnAround();
                link.move();
                link.move();
            } else if (link.countThingsInBackpack() == 4) {
                link.putThing();
                link.move();
                link.putThing();
                link.move();
                link.putThing();
                link.move();
                link.putThing();
                link.turnAround();
                link.move();
                link.move();
                link.move();
            } else if (link.countThingsInBackpack() == 5) {
                link.putThing();
                link.move();
                link.putThing();
                link.move();
                link.putThing();
                link.move();
                link.putThing();
                link.move();
                link.putThing();
                link.turnAround();
                link.move();
                link.move();
                link.move();
                link.move();
            }
            link.turnLeft();
            link.move();
        }
    }
}