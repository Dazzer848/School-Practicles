/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author darrenl
 */
public class DeletingAdding {
    static int size = 0;
    public static void main(String[] args) {
        int[] theArray = {1,2,4,536,2143,132,2,5,62,5,3,6,2,6,7,9,9,9,3,4};
        size = theArray.length;
        theArray = Removing(theArray, 12);
        System.out.println("" + Arrays.toString(theArray));
        
    }
    public static int[] Removing(int[] input, int indextoAdd){
        for(int i = indextoAdd; i < size - 1; i++){
            input[i] = input[i+1];
            System.out.println("" + Arrays.toString(input));
        }
        size++;
        return input;
    }
    public static int[] searchInt(int[] input){
        input = BubbleArraySorter(input);
        return input;
        
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
