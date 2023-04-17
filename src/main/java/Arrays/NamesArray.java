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
public class NamesArray {
    private int size = 0;
    private int[] ratings;
    private String[] names;
    public void nameSort(){
        int numberclimber = 1;

        for (int i = 0; i < size; i++) {
            for (int f = size - 1; f > i; f--) {
                String storage = "";
                String storage2 = "";
                
                
                //NOTE I AM WRITING TEMPORY STRINGS AS I DO0NT KNOW HOW TO DO IT IN THE FOR LOOP HEADER;
                String temporyNames1 = Arrays.toString(names[i]);
                String temportNames2 = Arrays.toString(names[f]);
                
                if(temportNames1 > temporyNames2){
                    storage = ratings[f];
                    storage2 = ratings[i];

                    ratings[i] = storage;
                    ratings[f] = storage2;

                }

            }
            numberclimber += 1;

        }
    }
    }
    
}
