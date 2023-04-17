/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class DateChanger {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please inpout date. PLEASE ENSURE TO ADD A // IN YOUR DATE!");
        String output = "";
        
        String[] dates = input.split("//");
        
        System.out.println(dates[2] + "-" + dates[1] + "-" + dates[0]);
        
    }
    
}
