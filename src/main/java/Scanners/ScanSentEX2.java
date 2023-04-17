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
public class ScanSentEX2 {
    public static void main(String[] args) {
        String Sentance = JOptionPane.showInputDialog("Enter your long sentence thing");
        Scanner sc = new Scanner(Sentance);
        int wordNum = 0;
        int word3Num = 0;
        
        while (sc.hasNext()){
            wordNum = wordNum + 1;
            String word3 = sc.next();
            int word3Length = word3.length();
            if (word3Length == 3){
                word3Num = word3Num + 1;
                
                
                
            }
        }
        System.out.println("In your sentence there were: " + wordNum + " Words");
        System.out.println("There were: " + word3Num + " words with 3 letters");
    }
    
}
