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
public class ex2q4 {
    public static void main(String[] args) {
        String ages = JOptionPane.showInputDialog("Please input your age");
        int age = Integer.parseInt(ages);
        
        
        if (age > 18 && age < 75){
          System.out.println("Age OK. Have you got a drivers licence?");  
        }
        
        else {
            System.out.println("You are not allowed to drive!");
        }
    }
    
}
