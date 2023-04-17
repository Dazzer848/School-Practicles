/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Switch;
import javax.swing.*;

/**
 *
 * @author darrenl
 */
public class SwitchEx3 {
    public static void main(String[] args) {
        char input;
        
        input = JOptionPane.showInputDialog(" Please enter your choice of language \n English: A \n Afrikaans: B \n Zulu: C \n Sotho: D \n Leave: X ").charAt(0);
        
        switch(input){
            case 'a':
            case 'A':
                System.out.println(" Hello! ");
            break;
            
            case 'B':
            case 'b':
                System.out.println(" Gooimiddag! ");
            break;
            
            case 'c':
            case 'C':
                System.out.println("Sawubona");
            break;
            
            case 'd':
            case 'D':
                System.out.println("Lumela");
                
            break;
            
            default:
                System.out.println(" i know you think its funny to try and break me");

        }
        
    }
    
}
