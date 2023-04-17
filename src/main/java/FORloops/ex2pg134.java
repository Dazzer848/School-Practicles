/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FORloops;
import it.*;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author darrenl
 */
public class ex2pg134 {
    public static void main(String[] args) {
        String pricey = JOptionPane.showInputDialog("Please enter the price you paid, with decimals.: ");
        double price = Double.parseDouble(pricey);
        
        
        if (price >= 100.00){
        // First avoid integer division where possible EG: price * 10/100 is not good and it only works as price is a double!
        // Shorter methods can be EG: discount = price * 0.9 This gets rid of the 10 percent and means we dont have to do all the other things.
        
            double discount = price * 10/100;
            double dinalprice = price - discount;
            double cinalprice = Math.round(dinalprice * 100);
            double finalprice = cinalprice / 100;
            System.out.println("Your discounted price is: R" + finalprice);
        }
        
        // FIX THIS!!!!!!!!!!.
        else if (price < 100.00){
            System.out.println(" You dont get the discount your price is: R" + price);
        }
         
        
        
        
        
            
            
        
            
        
        
        
    }
    
}
