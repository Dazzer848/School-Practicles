package DataTypes;
import javax.swing.*;
import java.io.*;
public class CharArrays{
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
   public static void main(String[] args) throws InterruptedException {
      //
      String message = " Creating NETFLIX subscription.... ";
      String message2 = " Created.... ";
      String message3 = " Getting HD package..... ";
      String message4 = " Hacking into bank account.... ";
      String message5 = " Firewall DoWn... ";
      String message6 = " TaKiNg FuNdS OuT.... ";
      String message7 = " I hAvE It AlL ItS MinE AlL MiNe.... ";
      String message8 = " Terminating program..... ";
      String message9 = " ERROR LOG 90765... ";
      String daz = " 090 7845 9090 ";
      String error = " 404 ";
      
      int delay = 200;
      //
      char[] chars = message.toCharArray();
      char[] chars2 = message2.toCharArray();
      char[] chars3 = message3.toCharArray();
      char[] chars4 = message4.toCharArray();
      char[] chars5 = message5.toCharArray();
      char[] chars6 = message6.toCharArray();
      char[] chars7 = message7.toCharArray();
      char[] chars8 = message8.toCharArray();
      char[] chars9 = message9.toCharArray();
      int num1;
      String num2;
      String phonenum;
      String name;
      String month;
      num1 = Integer.parseInt (JOptionPane.showInputDialog (" What Year were you born? "));
      num2 = (JOptionPane.showInputDialog (" How tall are you? "));
      phonenum = (JOptionPane.showInputDialog (" What is your phone number? "));
      name = (JOptionPane.showInputDialog (" What is your name? "));
      month = (JOptionPane.showInputDialog (" What day and month were you born? "));
      
      System.out.println(" PERSONAL DETAILS ");
      System.out.println();
      System.out.println(" Name: " + (name));
      System.out.println(" Date of birth: " + (month) + " " + (num1));
      System.out.println(" You are: " + (2022 - num1));
      System.out.println(" Phone number is: " + (phonenum));
      System.out.println(" Height: " + (num2) + "M");
      System.out.println(" Thanks for your details! ");
      System.out.println(" ");
      System.out.println(" ");
      
      
      for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);//message.charAt(i);
            Thread.sleep(delay);
      }
      System.out.println(" ");
            
      for (int l = 0; l < chars2.length; l++) {
            System.out.print(chars2[l]);
            Thread.sleep(delay);
      }
      System.out.println(" ");
      
      for (int k = 0; k < chars3.length; k++) {
            System.out.print(chars3[k]);
            Thread.sleep(delay);
            
      }
      System.out.println(" ");
      
      for (int h = 0; h < chars4.length; h++) {
            System.out.print(chars4[h]);
            Thread.sleep(delay);
      }
      System.out.println(" ");
      
      for (int g = 0; g < chars5.length; g++) {
            System.out.print(chars5[g]);
            Thread.sleep(delay);
      }
      System.out.println(" ");
      
      for (int f = 0; f < chars6.length; f++) {
            System.out.print(chars6[f]);
            Thread.sleep(delay);
      }
      System.out.println(" ");
      
      for (int d = 0; d < chars7.length; d++) {
            System.out.print(chars7[d]);
            Thread.sleep(delay);
      }
      System.out.println(" ");
      
      for (int s = 0; s < chars8.length; s++) {
            System.out.print(chars8[s]);
            Thread.sleep(delay);
      }
      System.out.println(" ");
      
      for (int a = 0; a < chars9.length; a++) {
            System.out.print(chars9[a]);
            Thread.sleep(delay);
      }
      System.out.println(" ");
      
      JOptionPane.showMessageDialog (null, " ERROR RECORDED: " + error + " " + "\n FaTaL ErRoR" + "\nContact NUMBER: " + daz , "ERROR LOG 90765" , JOptionPane.ERROR_MESSAGE);
      
      
      
      
      
      
      }
}
          