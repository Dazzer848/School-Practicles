/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class EX5Q4pg186 {
    public static void main(String[] args) {
        
        int rainfell = Integer.parseInt(JOptionPane.showInputDialog("How much rain fell?"));
        int days = 0;
        int maximium = rainfell;
        int total = 0;
        
        int heighestday = 0;
        
        
        while (rainfell > 0){
            
            if (maximium >= rainfell){
                heighestday = days;
                maximium = maximium;
            }
            total += rainfell;
            days += 1;
            rainfell = Integer.parseInt(JOptionPane.showInputDialog("How much rain fell?"));
            
        }
        
        System.out.println("------------------ Rain Machine ------------------------ \nThe total rain that fell is: " + total +"\n the day that had the most rainfall: " + heighestday + "\n and it had: " + maximium);
    }
    
}
