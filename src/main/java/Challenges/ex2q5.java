/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Challenges;
import javax.swing.*;
import it.*;
import java.awt.*;

/**
 *
 * @author darrenl
 */
public class ex2q5 {
    public static void main(String[] args) {
        
        String words1 = JOptionPane.showInputDialog("Please input first word");
        String words2 = JOptionPane.showInputDialog("Please enter second word");
        
        int word1len = words1.length();
        int word2len = words2.length();
        
        if (word1len > word2len){
            System.out.println("Word 1 is longer\n" + words1 + "\n" + words2);
        }
        else {
            System.out.println("Word 2 is longer\n" + words2 + "\n" + words1);
        }
    }
}
