/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Switch;
import javax.swing.*;
/**
 *
 * @author darrenl
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int jokenum = Integer.parseInt(JOptionPane.showInputDialog("Please input a number for jokes"));
        
        switch(jokenum){
            case 1:
                System.out.println("HAHA so funny");
                break;
            case 2:
                System.out.println(" Wow cool");
                break;
            case 3:
                System.out.println(" Somet6imes ");
                break;
            case 4: 
                System.out.println(" Jokes on you");
                break;
            default:
                System.out.println(" Stop breaking me");
        }
    }
    
    
}
