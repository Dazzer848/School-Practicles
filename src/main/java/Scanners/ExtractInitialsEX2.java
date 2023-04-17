/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class ExtractInitialsEX2 {
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog("Please enter your full name");
        
        Scanner sc = new Scanner(fullName);
        
        String name = "";
        String surname = "";
        while(sc.hasNext()){
            String curretnName = sc.next();
            
            if (sc.hasNext()){
                name = name + curretnName.charAt(0);
                
            }else{
                surname = curretnName;
                
            }
            
           
            
            //is this the last name?
            //true - add whole name to name
            //false - only add charAt 0
            
        }
        System.out.println("Your full name plus initials is: " + name + " " + surname);
        
        
    }
    
}
