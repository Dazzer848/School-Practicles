/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class BinaryArraySearch {
    public static int main(String[] args) {
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
    
    
    
        public static int[] BubbleArraySorter(int[] numbersArray){
           int numberclimber = 1;
        
        for(int i = 0; i < numbersArray.length; i++){
           for(int f = numbersArray.length - 1; f > i; f--){
               int storage = 0;
               int storage2 = 0;
               
               System.out.println("Before" + numberclimber + ": " + Arrays.toString(numbersArray));
               if(numbersArray[i] > numbersArray[f]){
                   storage =  numbersArray[f];
                   storage2 = numbersArray[i];
                   
                   numbersArray[i] = storage;
                   numbersArray[f] = storage2;
                   System.out.println("After" + numberclimber + ": " + Arrays.toString(numbersArray));
               }
              
           }
           numberclimber += 1;
            
        }
        return numbersArray;
    }
    
}
