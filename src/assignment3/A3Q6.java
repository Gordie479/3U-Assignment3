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

        //goes to first pile of (things)
        link.move();
        while (link.canPickThing()) {
            link.turnLeft();
            link.pickAllThings();
            //if there is one (thing) in the pile
            if (link.countThingsInBackpack() == 1) {
                link.putAllThings();
            //if there are two (things) in the pile
            } else if (link.countThingsInBackpack() == 2) {
                link.putThing();
                link.move();
                link.putThing();
                link.turnAround();
                link.move();
            //if there are three (things) in the pile
            } else if (link.countThingsInBackpack() == 3) {
                link.putThing();
                link.move();
                link.putThing();
                link.move();
                link.putThing();
                link.turnAround();
                link.move();
                link.move();
            //if there are four (things) in the pile
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
            //if there are five (things) in the pile
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
            //goes on to next pile
            link.turnLeft();
            link.move();
        }
    }
}