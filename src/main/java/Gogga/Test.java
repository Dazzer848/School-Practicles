package Gogga;
import it.*;
public class Test{
   public static void main (String args[]){
   Gogga bug = new Gogga();
   java.awt.Color Blue;
   
//Letter D
   bug.setPosition(1, 5);
   for (int i = 1; i > 4; i++ );
    bug.move();
    bug.turnLeft();
   
   bug.move();
   bug.move();
   
//letter A
   bug.setPosition(2, 5);
   bug.move();
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   bug.move();
   bug.move();
   bug.setPosition(4, 3);
   bug.turnRight();
   bug.move();
   bug.move();
   
//letter R
   bug.setPosition(5, 5);
   bug.turnRight();
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   
//letter R
   bug.setPosition(7, 5);
   bug.turnLeft();
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   
      }
}