/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Challenges;
import javax.swing.*;
/**
 *
 * @author darrenl
 */
public class OptionsThing {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Name please");
        int choice = Integer.parseInt(JOptionPane.showInputDialog(" YOUR OPTIONS \n Option 1: Student Code \n Option 2: Name backwards \n Option 3 : First and last letter of your name"));
        
        if (choice == 1){
            String result = studentCode(name);
            System.out.println(result);
            
            
        }
        if (choice == 2){
            String result = backwardsPrinter(name);
            System.out.println(result);
            
            
        }
        if (choice == 3){
            String result = FirstnLast(name);
            System.out.println(result);
            
            
        }
        
        
        
    }
    
    public static String studentCode(String name){
        
        name = name.charAt(0) + "" + name.charAt(1) + "" + name.charAt(2);
        name = name.toUpperCase();
        
        
        int randomNum = (int) (Math.random()* 999-100 + 1) + 100;
        
        name = name + randomNum;
        
        return name;
    }
    
    public static String backwardsPrinter(String name){
        String BackwardsName = "";
        for (int i = name.length() - 1; i >=0; i--){
            BackwardsName = BackwardsName + name.charAt(i);   
        }
        return BackwardsName;
        
        
    }
    
    public static String FirstnLast(String name){
        name = name.charAt(0) +  "" + name.charAt(name.length() - 1) + "";
        name = name.toLowerCase();
        
        return name;
    }
        
    
    
    
}
