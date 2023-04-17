package DataTypes;
import javax.swing. *;
public class ExTwo{
   public static void main (String args[]){
      String word1;
      String word2;
      String word3;
      int total;
      
      word1 = JOptionPane.showInputDialog (" Whats is your first word? ");
      word2 = JOptionPane.showInputDialog (" What is your second word? "); 
      word3 = JOptionPane.showInputDialog (" What is your third word? ");
      

      System.out.println(" ");
      System.out.println("Your second word is: " + word2 + " \nand it has " + word2.length() + " characters in it. ");
      System.out.println(" ");
      System.out.println("Your third word is: " + word3 + " \nand it has " + word3.length() + " characters in it. ");
      System.out.println(" ");
      total = (word1.length() + word2.length() + word3.length());
      System.out.println("The total amount of characters is: " + total);
      System.out.println(" ");
      
      ///////////////////////////////////////////////////////////////// Q2 //////////////////////////////////////////////////////////////////////
      String code;
      code = JOptionPane.showInputDialog("Please enter a code ");
      System.out.println("Your code is: " + code + "\nDigits: " + code.length());
           
   }
}
      