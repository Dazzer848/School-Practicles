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
public class StarChallenge {
    public static void main(String[] args) {
        
        
        int numtimes = Integer.parseInt(JOptionPane.showInputDialog("How many times star??"));
        
        for (int i = 1; i <= numtimes; i++){
            System.out.println(oneLine(i));
        }
        
        for (int i = numtimes-1; i >= 1; i--){
            System.out.println(oneLine(i));
        }
    }
    
    public static String oneLine(int n){
        String out = "";
        for (int i = 0; i < n; i++) {
            out += "*";
        }
        return out;
    }
    
}
