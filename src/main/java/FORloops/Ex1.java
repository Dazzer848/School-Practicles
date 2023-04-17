/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FORloops;

import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class Ex1 {
    public static void main(String[] args) {
        String name, loop;
        name = JOptionPane.showInputDialog("Please enter your name");
        loop = JOptionPane.showInputDialog("How many times would you like your name printed?");
        int loops = Integer.parseInt(loop);
        for( int i = 1; i <= loops ; i++);
            System.out.println(name);
            System.out.println(" ");
    }
    
}
