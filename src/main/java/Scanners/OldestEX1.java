/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class OldestEX1 {
    public static void main(String[] args) throws FileNotFoundException {
        
        File names = new File("SchoolData\\Names.txt");
        Scanner sc = new Scanner(names);
        
        String name = sc.next();
        int age = sc.nextInt();
        
        String Bigname = name;
        int Bigage = age;
        
        while (sc.hasNext()){
            name = sc.next();
            age = sc.nextInt();
            
            if (age > Bigage){
                Bigname = name;
                Bigage = age;
            }
                
        }
        
        System.out.println("-------------Oldest Boy--------");
        System.out.println("Name: " + Bigname);
        System.out.println("Age: " + Bigage);
        
    }
    
}
