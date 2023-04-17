/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputationalThinking;
import it.*;
import javax.swing.*;

/**
 *
 * @author darrenl
 */
public class Definitions {
    public static void main(String[] args) {
        String Decomp, Pattern, Abstraction, Algorithms;
        
        String Decomposition = "Dividing a complex problem or system into smaller, more manageable parts.";
        String name = JOptionPane.showInputDialog("Please enter name.");
        String greet = JOptionPane.showInputDialog(" Greetings " + name + " What would you like to learn?");
        System.out.println(" Please choose option below \n Option 1: Learning definitions. \n Option 2: Inputting definitions. ");
        
        String Whattolearn = JOptionPane.showInputDialog("Please choose a number now");
        int i = Integer.parseInt(Whattolearn);
        System.out.println(" ");
        
        for (int g = i; g >= 1; g--);
            System.out.println(" What is the definition of decomposition? ");
            Decomp = JOptionPane.showInputDialog("Input definition.");
            JOptionPane.showMessageDialog (null, "Your input: " + Decomp + "\n \nThe right def: " + Decomposition + "\n \nIs it correct?" );
            
            
        
        
        
        
    }
    
}
        
            
        
        
        
        
        
        

