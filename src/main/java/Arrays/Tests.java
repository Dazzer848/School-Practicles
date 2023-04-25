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
public class Tests {
    int[] array;
    int size;

    public Tests(int[] array, int size) {
        this.array = array;
        this.size = size;
    }
    
    public void insert(int value){
        
        int index = size;
        for(int i = 0; i < size; i++){
            if(array[i] > value){
                index = i;
                break;
            }
        }
        
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        
            array[size] = value;
            size++;
        
    }
    
    //DELETE ISNT WORKING!
    public void delete(int value){
        int index = size;
        for (int i = 0; i < size; i++) {
            if(array[i] == value){
                index = i;
                break;
            }
            
        }
        
        // What it is doing is saying " Move 8 to where 6 was" But then the next check it sees 8 again and so the process repeats which is why we constantly see 8
        for(int i = index; i < size; i++){
            array[i] = array[i + 1];
        }
        
        size--;
        
        
        System.out.println(Arrays.toString(array));
    }
    
    
    
}
