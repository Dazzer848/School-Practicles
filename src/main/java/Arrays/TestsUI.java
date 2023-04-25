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
public class TestsUI {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,8,10,0,0,0,0,0,0};
        Tests t = new Tests(array, 6);
        
        
        //deleting isnt working
        t.delete(5);
    }
    
}
