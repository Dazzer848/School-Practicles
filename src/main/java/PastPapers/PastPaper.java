package PastPapers;

import it.*;
import javax.swing.*;
import java.awt.*;
// Learn how to do while loops or for loops so that the position is printed everytime. And make it look neat!

public class PastPaper{
   public static void main (String args[]){
      Gogga bug = new Gogga();
      // This is broken!
      for (int XPos = 0 ;XPos < 5; XPos++) {
         System.out.println(XPos);
         }
      bug.setPosition (1, 5);
      bug.move();
      System.out.println("X: " + bug.getXPos() + " Y: " + bug.getYPos());
      bug.move();
      
      bug.turnRight();
      
      bug.move();
      
      bug.move();
      System.out.println(bug.getXPos());
      bug.turnRight();
      System.out.println(bug.getXPos());
      bug.move();
      System.out.println(bug.getXPos());
      bug.move();
      System.out.println(bug.getXPos());
      bug.turnLeft();
      System.out.println(bug.getXPos());
      bug.move();
      System.out.println(bug.getXPos());
      bug.move();
      System.out.println(bug.getXPos());
      bug.turnLeft();
      System.out.println(bug.getXPos());
      bug.move();
      System.out.println(bug.getXPos());
      
      bug.move();
      System.out.println(bug.getXPos());
      
      bug.turnRight();
      System.out.println(bug.getXPos());
      
      bug.move();
      System.out.println(bug.getXPos());
      
      bug.move();
      System.out.println(bug.getXPos());
      
      bug.turnRight();
      System.out.println(bug.getXPos());
      
      bug.move();
      System.out.println(bug.getXPos());
      
      bug.move();
      System.out.println(bug.getXPos());
      
      bug.turnLeft();
      System.out.println(bug.getXPos());
      
      bug.move();
      System.out.println(bug.getXPos());
      
      bug.move();
      System.out.println(bug.getXPos());
      
      
      
      
      
   }
}