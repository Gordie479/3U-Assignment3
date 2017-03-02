/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author simmg9723
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        RobotSE link = new RobotSE(hyrule, 3, 3, Direction.SOUTH);

        new Wall(hyrule, 1, 1, Direction.NORTH);
        new Wall(hyrule, 1, 2, Direction.NORTH);
        new Wall(hyrule, 1, 2, Direction.EAST);
        new Wall(hyrule, 2, 2, Direction.EAST);
        new Wall(hyrule, 2, 2, Direction.SOUTH);
        new Wall(hyrule, 2, 1, Direction.SOUTH);
        new Wall(hyrule, 2, 1, Direction.WEST);
        new Wall(hyrule, 1, 1, Direction.WEST);
        new Wall(hyrule, 1, 4, Direction.NORTH);
        new Wall(hyrule, 1, 5, Direction.NORTH);
        new Wall(hyrule, 1, 5, Direction.EAST);
        new Wall(hyrule, 2, 5, Direction.EAST);
        new Wall(hyrule, 2, 5, Direction.SOUTH);
        new Wall(hyrule, 2, 4, Direction.SOUTH);
        new Wall(hyrule, 2, 4, Direction.WEST);
        new Wall(hyrule, 1, 4, Direction.WEST);
        new Wall(hyrule, 4, 4, Direction.NORTH);
        new Wall(hyrule, 4, 5, Direction.NORTH);
        new Wall(hyrule, 4, 5, Direction.EAST);
        new Wall(hyrule, 5, 5, Direction.EAST);
        new Wall(hyrule, 5, 5, Direction.SOUTH);
        new Wall(hyrule, 5, 4, Direction.SOUTH);
        new Wall(hyrule, 5, 4, Direction.WEST);
        new Wall(hyrule, 4, 4, Direction.WEST);
        new Wall(hyrule, 4, 1, Direction.NORTH);
        new Wall(hyrule, 4, 2, Direction.NORTH);
        new Wall(hyrule, 4, 2, Direction.EAST);
        new Wall(hyrule, 5, 2, Direction.EAST);
        new Wall(hyrule, 5, 2, Direction.SOUTH);
        new Wall(hyrule, 5, 1, Direction.SOUTH);
        new Wall(hyrule, 5, 1, Direction.WEST);
        new Wall(hyrule, 4, 1, Direction.WEST);

        for (int i = 0; i < 8; i++) {
            //repeats three sides every second time
            if (i % 2 == 0) {
                link.move();
                link.move();
                link.move();
                link.turnLeft();
                link.move();
                link.move();
                link.move();
                link.turnLeft();
                link.move();
                link.move();
                link.move();
            }
            //repeats last side every second time
            if (i % 2 == 1) {
                link.turnLeft();
                link.move();
                link.move();
                link.move();
            }
        }
    }
}
