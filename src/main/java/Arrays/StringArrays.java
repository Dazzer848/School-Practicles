/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author darrenl
 */
public class StringArrays {
    public static void main(String[] args) {
        String[] names = {"Mike, Greg, boy, Seb, Abban, Dazzer"};
        
        
    }
    
    public static String getMostAlphabetical(String[] names){
        String mostAplhabetical = names[0];
        
        
        for(int i = 1; i < names.length; i++){
            String toCheck = names[i];
            if(toCheck.compareTo(mostAplhabetical) > 0){
                mostAplhabetical = toCheck;
                
            }
            
        }
        return mostAplhabetical;
    }
    
    public static int getAverageLenght(String[] name){
        int average = 0;
        int sum = 0;
        
        for(int i = 0; i < name.length; i++){
            sum += name[i].length();
        }
        average = sum/name.length;
        return average;
    }
    
}
