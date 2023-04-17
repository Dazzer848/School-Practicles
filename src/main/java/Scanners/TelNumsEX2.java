/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import static java.lang.Thread.State.RUNNABLE;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class TelNumsEX2 {
    public static void main(String[] args) throws InterruptedException {
        String phoneNum = JOptionPane.showInputDialog("Please enter your number");
        
        
        Scanner sc = new Scanner(phoneNum);
        sc.useDelimiter("-");
        
        String prefix = sc.next();
        String suffix = sc.next();
        
        if(prefix.equals("45")){
            prefix = "876";
        }
        if(prefix.equals("47")){
            prefix = "877";
        }
        
        
        System.out.println("Your phone number is " + prefix + "-" + suffix);
        while(sc.hasNext()){
            //Needs Priority
            String Printing = sc.next();
            System.out.print("" + Printing);
            Thread.sleep(1000);
        }
        
    }
    
}
