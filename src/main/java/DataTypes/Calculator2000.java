package DataTypes;

import javax.swing. *;
public class Calculator2000{
   public static void main (String args[]){
      String input;
      double num2, num3, num4;
      input = JOptionPane.showInputDialog (" Please type in a number with more than 2 decimal" );
      double num = Double.parseDouble(input);
      num2 = num * 100;
      num3 = Math.round(num2);
      num4 = num3 / 100;
      System.out.println(num4);
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
}