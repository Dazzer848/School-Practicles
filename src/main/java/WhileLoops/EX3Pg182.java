/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;
import javax.swing.*;
/**
 *
 * @author darrenl
 */
public class EX3Pg182 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        
        while (sum > -99){
            String inputs = JOptionPane.showInputDialog("Please enter number");
            int INTinputs = Integer.parseInt(inputs);
            sum = sum + INTinputs;
            count += 1;
            System.out.println("" + sum);
        }
            
    }
    
    public static void MRB(){
        String inputs = JOptionPane.showInputDialog("Please enter number");
        int INTinputs = Integer.parseInt(inputs); //SELECT INITIALISE  
        
        //SECTION 1 - run once before (initialising of stuff)
        int sum = 0;
        
        while (sum == -99){ //TEST (condition)
            //SECTION 2 - repeated calculations - do multiple times
            sum = sum + INTinputs;
            
            
            
            
            inputs = JOptionPane.showInputDialog("Please enter number");
            INTinputs = Integer.parseInt(inputs); //CHANGE (increment)
        }
        
        //SECTION 3 - post-processing (stuff to do once after)
        System.out.println("" + sum);
        
    }
    
}
