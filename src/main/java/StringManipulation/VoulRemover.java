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
public class VoulRemover {
    public static void main(String[] args) {
        String inputtedSting = JOptionPane.showInputDialog("Please enter text :)").toLowerCase();
        int length = inputtedSting.length();
        String output = "";
        
        for(int i = 0; i < length;i++){
            char nextChar = inputtedSting.charAt(i);
            
            if(!(nextChar == 'a' || nextChar == 'e' || nextChar == 'i' || nextChar == 'o' || nextChar == 'u')){
                output += nextChar;
            }
        // (A + B)'= A'.B'
            
        
    }
        System.out.println(output);
    }
    
    
}
