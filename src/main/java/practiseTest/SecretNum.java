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
public class SecretNum {
    public static void main(String[] args) {
        
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please inout a number"));
        
        
        if (num % 2 ==0 &&  num % 7==0){
            
            System.out.println("Listen try again or get lost");
        }
        
        else{
            System.out.println("Welcome in kind sir");
        }
        

        
        
        
        
    }
    
    
}
