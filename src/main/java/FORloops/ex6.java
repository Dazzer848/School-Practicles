// Not done. Add if statements etc. page 101.

package FORloops;
import javax.swing.*;
public class ex6{
   public static void main (String args[]){
      
      int total = 0;
      int totalpos = 0;
      String num = JOptionPane.showInputDialog(" How many numbers would you like to add ");
      int numNums = (int)Integer.parseInt(num);
      
      for (int i = 1; i <= numNums; i += 1){
         String innum = JOptionPane.showInputDialog(" Please input a number ");
         int num2 = (int)Integer.parseInt(innum);
         total += num2; 
               
          
            
         
      }
      int average = total/numNums;
      System.out.println(total);
      System.out.println(average);
      
      
      
   }
}