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

// NEED TO ADD IN SPECIAL CHARACTER CHECKER ASWELL AS CHECKING IF ALL THE FLAGS ARE TRUE! HAVE A GOOD DAY DAZZ!

public class PasswordChecker {
    public static void main(String[] args) {
        String completePass = "";
        boolean hasDigit = false, hasUpper = false, hasLowwer = false, hasSpecial = false;
        
        String inputtedPassword = JOptionPane.showInputDialog("Please input your password");
        
        int inputtedPasswordLenght = inputtedPassword.length();
        int indexingOfPassword = inputtedPasswordLenght - 1;
        
        
        for(int i = 0; i <= indexingOfPassword; i++){
            char characterToCheck = inputtedPassword.charAt(i);
            
            if(Character.isUpperCase(characterToCheck)){
                hasUpper = true;
                
                
            }
            
            else if(Character.isLowerCase(characterToCheck)){
                hasLowwer = true;
            }
            
            else if(Character.isDigit(characterToCheck)){
                hasDigit = true;
            }
            
            else{
                hasSpecial = true;
                
            }
        }
        
        if(hasDigit == true && hasLowwer == true && hasSpecial == true && hasUpper == true && inputtedPasswordLenght >= 8){
            System.out.println("Password is perfect!");
        }
        else{
            System.out.println("No stop");
        }
    }
    
}
