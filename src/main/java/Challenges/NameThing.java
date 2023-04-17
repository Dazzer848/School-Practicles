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
public class NameThing {
    public static void main(String[] args) {
        int count = 0;
        int average_lenght = 0; 
        int total = 0;
        String name = JOptionPane.showInputDialog(" Name please ");
        String mostAlp = name;
        
        while (!(name.equals("xxx"))){
            int compare = mostAlp.compareToIgnoreCase(name);
            
            if (compare > 0){
                
                mostAlp = name;
                
            }
            
            int currentLength = name.length();
            total += currentLength;
            count++;
            
            
            name = JOptionPane.showInputDialog("Enter name");
            
        }
        
        average_lenght = total/count;
        System.out.println("-------------------------- FINAL ROUNDUP -------------------- \nAverage Length: " + average_lenght + "\nMost Alphabetical: " + mostAlp);
    }
    
}
