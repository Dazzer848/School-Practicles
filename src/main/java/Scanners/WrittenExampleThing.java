/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author darrenl
 */
public class WrittenExampleThing {
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("things\\UserNames.txt");
        
        Scanner userSC = new Scanner(data);
        
        
        userSC.useDelimiter("#");
        
        
        System.out.println("------------------Password Reader -------------------");
        
        while(userSC.hasNext()){
            String toPrint = userSC.next();
            System.out.print(toPrint + " ");
            
        }
        
        
    }
    
    
}
