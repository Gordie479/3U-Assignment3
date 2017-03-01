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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        RobotSE link = new RobotSE(hyrule, 0, 2, Direction.WEST);

        new Wall(hyrule, 1, 1, Direction.NORTH);
        new Wall(hyrule, 1, 1, Direction.WEST);
        new Wall(hyrule, 2, 1, Direction.WEST);
        new Wall(hyrule, 2, 1, Direction.SOUTH);
        new Wall(hyrule, 2, 2, Direction.SOUTH);
        new Wall(hyrule, 2, 2, Direction.EAST);
        new Wall(hyrule, 1, 2, Direction.EAST);
        new Wall(hyrule, 1, 2, Direction.NORTH);

        for (int i = 0; i < 8; i++) {
            link.move();
            link.move();
            link.turnLeft();
            link.move();
        }
    }
}
