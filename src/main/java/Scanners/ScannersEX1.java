/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class ScannersEX1 {
    public static void main(String[] args) {
        String AllDetails = JOptionPane.showInputDialog("Hello!\nPlease enter your name\nID number\nIf you smoke or not (True\\False)\nYour height in Meters.");
        
        Scanner sc = new Scanner(AllDetails);
        
        String name = sc.next();
        String IDnum = sc.next();
        String smoke = sc.next();
        double height = sc.nextDouble();
        
        System.out.println("----------------- Your details -----------------");
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("ID number: " + IDnum);
        System.out.println("Do you smoke: " + smoke);
        System.out.println("Your height: " + height);
    }
    
}
