/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputationalThinking;
import javax.swing.*;

/**
 *
 * @author darrenl
 */
public class FlowChart2 {
    public static void main(String[] args) {
        int tempc = Integer.parseInt(JOptionPane.showInputDialog("Please enter a temp in Celcius."));
        
        double f = (tempc * 9.0 / 5) + 32;
        System.out.println(" The temp in F is: " + f + "F");
    }
    
}
