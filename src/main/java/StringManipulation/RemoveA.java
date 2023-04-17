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
public class RemoveA {
    public static void main(String[] args) {
        String inputtedWord = JOptionPane.showInputDialog("Please Put in a word");
        String output = "";
        int wordLenght = inputtedWord.length() - 1;

       
        
        for (int i = 0; i <= wordLenght; i++){
            char nextChar = inputtedWord.charAt(i);
            
            if(nextChar == 'a' || nextChar == 'A'){
                nextChar = '*';
            }
            output += nextChar;
            
            
        }
        System.out.println(output);
    }
    
}
