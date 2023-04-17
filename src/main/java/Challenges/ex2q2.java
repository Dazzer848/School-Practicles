/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Challenges;
import javax.swing.*;
import it.*;
import java.awt.*;

/**
 *
 * @author darrenl
 */
public class ex2q2 {
    public static void main(String[] args) {
        String nums = JOptionPane.showInputDialog("Please input a number");
        double num = Double.parseDouble(nums);
        
        if (num >= 0){
            System.out.println("Results\n" + num + " > 0\nThe number is Positive");
        }
        else {
            System.out.println("Results\n" + num + " < 0\nThe number is Negative");
        }
        
        
        
        if (num%2 ==0){
            System.out.println("\n" + num + " divided by 2 = 0\n The number is even.");
            
        }
        else {
            System.out.println("\n" + num + " divided by 2 = remainder\n Your number is odd");
        }
        
        
        
        
        if (num%7 ==0){
            System.out.println("\nYour number divided by 7 = " + (num/7) + "/nYour number is a multiple than 7");
        }
        else {
            System.out.println("\nYour number divided by 7= " + ((double)num/7) + "\nYour number is not a multiple of 7");
        }
            
        
        
    }
    
}
