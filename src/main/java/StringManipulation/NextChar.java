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
public class NextChar {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter a word").toLowerCase();
        int length = input.length();
        String output = "";
        
        for(int i =0; i < length;i++){
            char nextChar = input.charAt(i);
            int charNum = (int) nextChar;
            charNum = charNum + 1;
            
            // This is 123 as we have already added 1 to the int. Z = 122 therefor it will get added to 123 so we can then ensure its a Z
            if(charNum == 123){
                charNum = 97;
            }
            char toAddChar = (char) charNum;
            output = output + toAddChar;
            
        }
        System.out.println(output);
    }
    
}
