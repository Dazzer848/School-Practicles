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
public class Ex5Pg186Q2 {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Please enter names");
        int lenght = name.length();
        int count =0 , total = 0;
        
        while (!(name.equals("*"))){
            count += 1;
            total += lenght;
            
            name = JOptionPane.showInputDialog("Please enter names");
            
        }
        
        System.out.println("The average length is: " + (total/count));
            
    }
    
}
