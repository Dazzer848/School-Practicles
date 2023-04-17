/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiseTest;
import javax.swing.*;
/**
 *
 * @author darrenl
 */
public class HCF {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter num"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enetr second num"));
        
        int highestFactor = 1;
        
        for (int i = 1; i <= num1; i++){
            
            if (num1 % i == 0 && num2 % i == 0){
                highestFactor = i;
            }
            
        }
        System.out.println("The highest factor is:" + highestFactor);
        
        
    }
    
}
