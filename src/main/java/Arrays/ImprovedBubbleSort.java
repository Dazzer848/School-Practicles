/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author darrenl
 */
public class ImprovedBubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,2,9};
        
        
        for(int pointer1 = array.length  - 1; pointer1 <= array.length; pointer1--){
            boolean changed = false;
            for(int pointer2 = 0; pointer2 < pointer1; pointer2++){
                int pointer3 = pointer2 + 1;
                
                int numberPointer2 = array[pointer2];
                int numberPointer3 = array[pointer3];
                
                if(numberPointer3 < numberPointer2){
                    array[pointer2] = numberPointer3;
                    array[pointer3] = numberPointer2;
                    changed = true;
                }
                
                if(pointer2 == array.length-3 && pointer3 == array.length-2 && changed == true){
                    if(changed = true){
                        break;
                    }
                }
            }
            
        }
        System.out.println("" +Arrays.toString(array));
    }
    
}
