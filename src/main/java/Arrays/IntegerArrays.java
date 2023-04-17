/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author darrenl
 * Find the length
 * Average
 * contains highest/ biggest
 *if contains 5 
 */
public class IntegerArrays {
    public static void main(String[] args) {
        int[] numbers = {1,5,7,8,9,20,35,54};
        
        
    }
    
    public static double findAverage(int[] numbers){
        double average = 0.0;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            
        }
        average = (double)sum/numbers.length;
        return average;
    }
    
    public static int findLenght(int[] numbers){
        int lenght = numbers.length;
        
        return lenght;
    }
    
    public static boolean check5(int[] numbers){
        boolean doesContain5 = false;
        
        for(int i = 0; i < numbers.length; i++){
            int toCheck = numbers[i];
            if(toCheck == 5){
                doesContain5 = true;
            }
            else{
                doesContain5 = false;
            }
        }
        
        return doesContain5;
    }
    
    public static int getHighest(int[] numbers){
        int highest = 0;
        
        for(int i = 0; i < numbers.length; i++){
            int temporayNum = numbers[i];
            if(temporayNum > highest){
                highest = temporayNum;
            }
        }
        return highest;
    }
    
    
    }
    

