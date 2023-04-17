/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;
import javax.swing.*;
/**
 *
 * @author darrenl
 */
public class EX5Q3Pg186 {
    public static void main(String[] args) {
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("please inout height"));
        double tallest = 0;
        double shortest = height;
        String nameShort = null, nameTall = null;
        
        while (height > 0){
           
            
            if (tallest < height){
                tallest = height;
                nameTall = JOptionPane.showInputDialog("What is your name tall man ?");
                
            }
            if (shortest > height){
                shortest = height;
                nameShort = JOptionPane.showInputDialog("What is your name tiny man?");
            }
                
            
            height = Double.parseDouble(JOptionPane.showInputDialog("please inout height"));
        }
        
        System.out.println("The tallest person is: " + tallest + "\n their name is: " + nameTall + "\n the smallest person is: " + shortest + "\n Thier name is: " + nameShort);
    }
    
}
