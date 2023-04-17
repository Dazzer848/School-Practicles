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
public class LinearArraySorter {
    public static void main(String[] args) {
        int[] array ={1,4,6,9,12,69,420,308};
        int toSearch = Integer.parseInt(JOptionPane.showInputDialog("Please num"));
        boolean same = false;
        String response = "";
        
        for(int i = 0; i < array.length - 1; i++){
            if(toSearch == array[i]){
                same = true;
                response = "FOUND";
                break;
            }
            else{
                same = false;
                response = "NOT FOUND";
            }
            
        }
        
        System.out.println("This found?: " + response);
    }
    
}
