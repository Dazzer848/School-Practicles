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
public class Ex5Pg186Q1 {
    public static void main(String[] args) {
        
        
        char input = JOptionPane.showInputDialog("Please input a character").charAt(0);
        int count = 0;
        String complete = "";
        
        while (input != '*'){
            count += 1;
            complete = complete + input + ",";
            
            input = JOptionPane.showInputDialog("Please input a character").charAt(0);
            
    
        }
        
        System.out.println("You entered:" + count + "\n and you entered this: " + complete);
        
        
    }
    
}
