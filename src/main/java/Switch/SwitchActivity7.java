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
public class SwitchActivity7 {
    public static void main(String[] args) {
        char ch;
        
        ch = JOptionPane.showInputDialog(" Please choose response \n 1 = sing \n 2 = cry \n 3 = laugh. \n x = leave").charAt(0);
        
        switch(ch){
            case '1':
                System.out.println(" LA LA LA ");
            break;
            
            case '2':
                System.out.println(" WAAAA WAAA i am SAD!");
            break;
            
            case '3':
                System.out.println(" HAHAHAHAHHAHAHAHAHAH ");
            break;
            
            case 'x':
                System.out.println(" Okay bye then");
            break;
            
            default:
                System.out.println(" If you wanna break me just smash the computer instead ");
        }
    }
    
}
