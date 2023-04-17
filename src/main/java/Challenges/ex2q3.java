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
public class ex2q3 {
    public static void main(String[] args) {
        String nums1 = JOptionPane.showInputDialog("Please input your first number");
        String nums2 = JOptionPane.showInputDialog("Please enter your second number");
        
        int num1 = Integer.parseInt(nums1);
        int num2 = Integer.parseInt(nums2);
        
        
        if (num1 > num2){
            System.out.println("Your first number is greater than your second\n" + num1 + " > " + num2); 
        }
        else {
            System.out.println("Your second number is greater than your first\n" + num2 + " > " + num1);
        }
        
        
        if (num1 == num2){
            System.out.println("The numbers are equal" + num1 + " = " + num2);
            
        }
    }
    
}
