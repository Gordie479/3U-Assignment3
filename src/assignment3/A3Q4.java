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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City hyrule = new City();
        
        RobotSE link = new RobotSE(hyrule, 2, 2, Direction.SOUTH);
        
        new Wall(hyrule, 1, 1, Direction.NORTH);
        new Wall(hyrule, 1, 2, Direction.NORTH);
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
        
        //moves to find box edge
        while (link.frontIsClear()){
            link.move();
        }
        //scans walls to find exit
        while (!link.frontIsClear()){
            link.turnLeft();
            if (link.frontIsClear()){
                link.move();
                link.turnRight();
            }
        }
        link.move();
    }
}
