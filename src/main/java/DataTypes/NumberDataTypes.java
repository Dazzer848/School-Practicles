package DataTypes;
import javax.swing.JOptionPane;

public class NumberDataTypes{
   public static void main (String args[]){
      String input1 = JOptionPane.showInputDialog (" Enter number please. ");
      String input2 = JOptionPane.showInputDialog (" Enter number pls. ");
      
      int num1 = Integer.parseInt (input1);
      double num2 = Double.parseDouble (input2);      
      System.out.println(num1);
      System.out.println(num2);
      System.out.println("The sum of the numbers is " + (num1 + num2));
   }
}
