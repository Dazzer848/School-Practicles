/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonManeger;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class PersonUI {
    public static void main(String[] args) throws FileNotFoundException {
        int enterredId = Integer.parseInt(JOptionPane.showInputDialog("Please enter an ID"));
        
        System.out.println("######################### WELCOME TO THE PEOPLE MACHINE ################################");
        System.out.println("name: " + PersonManeger.getName(enterredId));
        System.out.println("email: " + PersonManeger.getEmail(enterredId));
        System.out.println("Average BMI: " + PersonManeger.getAvergaeBMI());
        System.out.println("Average weight: " + PersonManeger.getAvergaeWeight());
        System.out.println("Average height: " + PersonManeger.getAvergaeHeight());
    }
    
}
