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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        RobotSE link = new RobotSE(hyrule, 1, 1, Direction.EAST);

        new Wall(hyrule, 1, 1, Direction.NORTH);
        new Wall(hyrule, 1, 2, Direction.NORTH);
        new Wall(hyrule, 1, 3, Direction.NORTH);
        new Wall(hyrule, 1, 4, Direction.NORTH);
        new Wall(hyrule, 1, 4, Direction.EAST);
        new Wall(hyrule, 2, 4, Direction.EAST);
        new Wall(hyrule, 3, 4, Direction.EAST);
        new Wall(hyrule, 3, 4, Direction.SOUTH);
        new Wall(hyrule, 3, 3, Direction.SOUTH);
        new Wall(hyrule, 3, 2, Direction.SOUTH);
        new Wall(hyrule, 3, 1, Direction.SOUTH);
        new Wall(hyrule, 3, 1, Direction.WEST);
        new Wall(hyrule, 2, 1, Direction.WEST);
        new Wall(hyrule, 1, 1, Direction.WEST);

        new Thing(hyrule, 1, 2);
        new Thing(hyrule, 2, 2);
        new Thing(hyrule, 2, 3);
        new Thing(hyrule, 2, 4);
        new Thing(hyrule, 3, 1);
        new Thing(hyrule, 3, 4);

        //new counter
        for (int i = 0;;) {
            //when the front is clear
            while (link.frontIsClear()) {
                if (link.canPickThing()) {
                    link.pickAllThings();
                }
                link.move();
                //if link hits a wall
                if (!link.frontIsClear()) {
                    //repeats following code every 2nd time
                    if (i % 2 == 0) {
                        //turns link around to the right
                        if (link.canPickThing()) {
                            link.pickAllThings();
                        }
                        link.turnRight();
                        if (link.frontIsClear()) {
                            link.move();
                        //if link can't go farther south he goes back to start
                        } else if (!link.frontIsClear()) {
                            link.turnAround();
                            while (link.getStreet() > 1) {
                                link.move();
                            }
                            link.turnLeft();
                            while (link.getAvenue() > 1) {
                                link.move();
                            }
                            break;
                        }
                        //finishes turning around to the right
                        if (link.canPickThing()) {
                            link.pickAllThings();
                        }
                        link.turnRight();
                        link.move();
                        i++;

                        //repeats following code every 2nd time
                    } else if (i % 2 == 1) {
                        if (link.canPickThing()) {
                            link.pickAllThings();
                        }
                        //starts turning link around to the left
                        link.turnLeft();
                        if (link.frontIsClear()) {
                            link.move();
                            //if link can't go farther south he goes back to start
                        } else if (!link.frontIsClear()) {
                            link.turnAround();
                            while (link.getStreet() > 1) {
                                link.move();
                            }
                            link.turnLeft();
                            while (link.getAvenue() > 1) {
                                link.move();
                            }
                            break;
                        }
                        //finishes turning around to the left
                        if (link.canPickThing()) {
                            link.pickAllThings();
                        }
                        link.turnLeft();
                        link.move();
                        i++;
                    }
                }
            }
        }
    }
}
