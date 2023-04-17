package DataTypes;
import javax.swing. *;
public class Char{
   public static void main (String args[]){
      char D = 68;
      char a = 97;
      char r = 114;
      char e = 101;
      char n = 110;
      System.out.println(D);
      System.out.println(""+ D + a + r + r + e + n);
      
      
      /////////////////////////////////// Activity 1 //////////////////////////////////////////////
      System.out.println("Item \t  Item Code  \t  Quatntity ");
      System.out.println("T-shirt \t 537 \t \t \t  350 ");
      System.out.println("Dress \t 7231 \t \t  480 ");
      System.out.println("Earrings\t 7732 \t \t  90 ");
      System.out.println(" ");
      System.out.println(" ");
      
      
      
      
      ////////////////////////////////// Q2 /////////////////////////////////////////////////////////
      String name;
      String surname;
      String telnum;
      String yearOfBirth;
      String Height;
      
      name = JOptionPane.showInputDialog ("Your name? ");
      surname = JOptionPane.showInputDialog ("Surname? ");
      telnum = JOptionPane.showInputDialog ("Phone number? ");
      yearOfBirth = JOptionPane.showInputDialog ("When were you born? ");
      Height = JOptionPane.showInputDialog (" How tall are you (with 1 dec. pl.) ");
      
      JOptionPane.showMessageDialog (null, "NAME: " + name + " " + surname + "\nYEAR OF BIRTH: " + yearOfBirth + "\nHEIGHT(m): " + Height + "\nPhone number: " + telnum , "PERSONAL DETAILS" , JOptionPane.PLAIN_MESSAGE);
      
      
      
      
  }
}