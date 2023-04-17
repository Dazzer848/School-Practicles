package PastPapers;

import javax.swing.*;
import java.awt.*;


public class PastPaper3{
   public static void main(String args[]){
      String inputWord;
      int wordlength, chari;
      
      
      System.out.println("Hello!");
      inputWord = JOptionPane.showInputDialog(" Please input a word.");
      wordlength = inputWord.length();
      chari = wordlength/2;
      System.out.println("Middle is " + inputWord.charAt(chari));
      
      
      
      
      
      
      
      
      
   }
}