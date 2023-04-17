package PastPapers;
import it.*;
import javax.swing.*;
import java.awt.*;

public class GoggaTest{
   public static void main(String args[]){
      Gogga bug = new Gogga();
      bug.setDirection(Gogga.LEFT);
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      int x = bug.getXPos();
      System.out.println(x);
      bug.setPosition(5, 2);
      bug.setColor(Color.blue);
      
      
      
      
      
      
      
   }
}