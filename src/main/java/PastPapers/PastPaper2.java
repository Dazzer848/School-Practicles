package PastPapers;

import javax.swing.*;
import java.awt.*;
// Idea add the JOptionPane showMessageDialog at some point?

public class PastPaper2{
   public static void main (String args[]){
      String numCoke, numBar, numWat;
      double PriceCoke, PriceBar, PriceWat;
      
      PriceCoke = 13.90;
      PriceBar = 12.00;
      PriceWat = 9.50;
      System.out.println(" Hello welcome to admin machine! ");
      numCoke = JOptionPane.showInputDialog(" How many Cokes did you sell? ");
      numBar = JOptionPane.showInputDialog(" How many Bar One's do you sell? ");
      numWat = JOptionPane.showInputDialog(" How many Waters do you sell? ");
      
      double Coke = Double.parseDouble(numCoke);
      Coke = Coke * PriceCoke;
      System.out.println(" You sold: R" + Coke);
      
      double Water = Double.parseDouble(numWat);
      Water = Water * PriceWat;
      System.out.println(" You sold water: R" + Water);
      
      double Barone = Double.parseDouble(numBar);
      Barone = Barone * PriceBar;
      System.out.println(" You sold Barones: R" + Barone);
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}