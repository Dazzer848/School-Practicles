/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 * How many vouls are in a string
 * Change the date format DD/MM/YY to YY-MM-DD
 * Reverse a word
 * Replace one char with another in an input string
 * Generate a code from a name ALL IN CAPS. First two letter of the name last 3 of the surname
 * Type in the chars in a first string. Then your program must delete all those chars in you program
 * 
 */
public class usernameGenerator {
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog("Please type in a name and surname!");
        
        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names[1];
       
        int lastNameLength = lastName.length()-1;
        int startingIndexOfLastName = lastNameLength-2;
        int randomInt = (int)(Math.random()*(10) - 1);
        
        String firstNameCode = firstName.substring(0,3);
        String lastNameCode = lastName.substring(startingIndexOfLastName,lastNameLength);
        
        String maincode = firstNameCode + lastNameCode + randomInt;
        System.out.println(maincode + "@gmail.com");
        
        
       
    
}
}
