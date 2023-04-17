/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class ReverseAWord {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please put in a word");
        String output = "";
        
        int wordLenght = input.length() - 1;
       
        
        for (int i = wordLenght; i >= 0; i--){
            char nextChar = input.charAt(i);
            output += nextChar;
        }
        
        System.out.println(output);
        
    }
    
}
