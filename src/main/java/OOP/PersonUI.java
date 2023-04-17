/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class PersonUI {
    public static void main(String[] args) throws IOException {
        Person darren = new Person();
        
        darren.age = 10;
        darren.name = "Darren";
        darren.surname  = "Larkens";
        darren.id = 15;
        
        System.out.println(darren.generateEmail());
        
        darren.crying();
        
        
    }
    
        
    
    
}
    

