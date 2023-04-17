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
public class EX3Q2 {
    public static void main(String[] args) {
        
        // SECTION 1 run once (initialise)
        double price = 0;
        double totalPrice = 0;
        int productnum = 0;
        
        
        System.out.println("------------------------Dazzers Supermarket ---------------------");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please input price"));
        
        while (price > 0){ // TEST (condition)
            
            // SECTION 2 - REPEATED CALCULATIONS
            
            price = Double.parseDouble(JOptionPane.showInputDialog("Please input price"));
            productnum += 1;
            totalPrice += price;
            System.out.println(productnum + ": R" + price);
        }
        
        // SECTION 3 - Post - processing
        System.out.println("You owe in total: R" + totalPrice);
        
    }
    
}
