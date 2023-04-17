/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static Arrays.BinaryArraySearch.BubbleArraySorter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class ImprovedArray {
    public static void main(String[] args) {
        int[] numbersArray = {3,1,3,9,2,5};
        
        for(int pointer1 = 0; pointer1 < numbersArray.length; pointer1++){
            
            int smallestNumberIndex = pointer1;
                
            for(int pointer2 = pointer1 + 1; pointer2 < numbersArray.length; pointer2++){
                if(numbersArray[pointer2] < numbersArray[smallestNumberIndex]){
                    smallestNumberIndex = pointer2;
                }
            }
            
            if(smallestNumberIndex != pointer1){
                int temp = numbersArray[pointer1];
                
                numbersArray[pointer1] = numbersArray[smallestNumberIndex];
                numbersArray[smallestNumberIndex] = temp;
            }
        }
        System.out.println("" + Arrays.toString(numbersArray));
        
    }
    
    
        public static int BinarySort(String[] args) {
        int[] array = {1,57,216,236,73,72,333,2,3,52,3};
        BubbleArraySorter(array);
        int mid = 0, start = 0, pos = -1, end = array.length - 1;
        boolean found = false;
        String response = "";
        
        int lookfor = Integer.parseInt(JOptionPane.showInputDialog("PLeaseNumber"));
        while(start <= end && found == false){
            mid = (start + end) /2;
            if(lookfor > array[mid]){
                start = mid + 1;
                return mid;
            }
            else if(lookfor < array[mid]){
                end = mid - 1;
            }
            else{
                found = true;
                pos = mid;
                System.out.println("Found number at postion: " + pos);
            }
            
        }
        return pos;
    }
    
}
