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
public class BubbleSorter {
    public static void main(String[] args) {
        int[] numbersArray = {1,231,4,6,234,67,234,64,3,68,9,234,214,14,4,5,155,135,31,51,531,53,651,365,216,1,4613,71,6,14,6,13476,14,6,14,61,46,1461,461,87,346,461,46,14,146,6,146,6,157,258,3986,56,98,57,9825,268,42,586,25,82,2587,24587,298,457,862458,98,2,6582,865,98,25,72,5,1,5,49,3,656,98,2,21,57,2,57,82,57,328,254,7,2575,1,57,2,43,7,2,546,28,25,8,2364,8,3279,235,7,245687,26,826,826,8246};
        int[] sortedArray = BubbleArraySorter(numbersArray);
        System.out.println("" +  Arrays.toString(sortedArray));
        
        
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
