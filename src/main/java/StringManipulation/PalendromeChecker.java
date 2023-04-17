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
public class PalendromeChecker {
    public static void main(String[] args) {
        String inputtedword = JOptionPane.showInputDialog("Please input a word");
        String checking = "";
        String output = "";
        
        int wordLenght = inputtedword.length() - 1;
        
        for(int i = wordLenght; i >= 0; i--){
            char nextChar = inputtedword.charAt(i);
            
            checking += nextChar;
        }
        
        if(checking.equals(inputtedword)){
            System.out.println("Its a palendrome");
        }
        else{
            System.out.println("Not palendrome");
        }
    }
    
}
