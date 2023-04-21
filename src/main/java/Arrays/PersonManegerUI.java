/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class PersonManegerUI {
    public static void main(String[] args) {
        
        PersonManeger person = new PersonManeger("name", "surname", 12);
        
        String personName = person.getName();
        
        //Presenting the user with a choice
        int choice = Integer.parseInt(JOptionPane.showInputDialog("----------------- welcome " + personName +  " --------------------\n1: List people alphabetically\n2: List people by age\n3: List all people"));
        
       
        //Actions based on choice ( practising all aspects such as switch case )
        if(choice == 1){
            
        }
        
        switch(choice){
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("A error of unimaginable preportions has occured, there is simply no help for you sorry....");
        }
    }
    
    
}
