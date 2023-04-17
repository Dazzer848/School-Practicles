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

/// I HAVE CODED IT TO COMPARE THE LAST CHARACTER MAKE SURE TO CHANGE!!!!!
public class usernameGneratorPractise {
    public static void main(String[] args) {
        int score = 0;
        String input = JOptionPane.showInputDialog("Please input a word");
        boolean isTrue = true;
        int wordlenght = input.length() - 1;

        char lastChar = input.charAt(wordlenght);
        input = JOptionPane.showInputDialog("Please enter another word");
        wordlenght = input.length() - 1;
        
        while(isTrue = true){
            if(lastChar == input.charAt(wordlenght)){
                lastChar = input.charAt(wordlenght);
                input = JOptionPane.showInputDialog("Please enter another word");
                wordlenght = input.length() -1;
                score += 1;
                
            }
            else{
                isTrue = false;
                break;
            }
        }
        
        System.out.println("Your score is: " + score);
       
        
        
        
        
        
    }
    
}
