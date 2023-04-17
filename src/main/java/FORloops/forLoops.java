package FORloops;
import java.awt.*;
import it.*;
public class forLoops{  
   public static void main (String args[]){
      
      int x = 0;
      Gogga bug = new Gogga();
      bug.setTrailWidth(x);
      
       
      
      for ( int i = 1; i > 0; i++)
      {
      x = x + 5;
      System.out.println(i);
      System.out.println(i);
      System.out.println(i/2);
      System.out.println(" EAT THIS CPU. ");
      System.out.println(Math.pow(i, 3));
      bug.setColor(Color.blue);
      bug.move();
      bug.turnLeft();
      bug.setColor(Color.yellow);
      bug.move();
      bug.turnLeft();
      bug.setColor(Color.red);
      bug.move();
      bug.turnLeft();
      bug.setColor(Color.green);
      bug.move();
      bug.turnLeft();
      bug.setTrailWidth(x);
      }
      
      
      
      
      
   }
}