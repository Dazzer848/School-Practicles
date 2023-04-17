/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static Arrays.DeletingAdding.size;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author darrenl
 */
public class Ratings {

    private int[] ratings;
    private int size;

    public Ratings() throws FileNotFoundException {
        ratings = new int[100];
        size = 0;
        Scanner fileSC = new Scanner(new File("things\\clientratings.txt"));

        while (fileSC.hasNext()) {
            int toAdd = Integer.parseInt(fileSC.nextLine());
            ratings[size] = toAdd;
            size++;
        }
        System.out.println("" + Arrays.toString(ratings));
    }

    public void delete(int index) {
        for (int i = index; i < size - 1; i++) {
            ratings[i] = ratings[i + 1];
        }
        size--;
    }

    public void sort() {
        int numberclimber = 1;

        for (int i = 0; i < size; i++) {
            for (int f = size - 1; f > i; f--) {
                int storage = 0;
                int storage2 = 0;

                System.out.println("Before" + numberclimber + ": " + Arrays.toString(ratings));
                if (ratings[i] > ratings[f]) {
                    storage = ratings[f];
                    storage2 = ratings[i];

                    ratings[i] = storage;
                    ratings[f] = storage2;
                    System.out.println("After" + numberclimber + ": " + Arrays.toString(ratings));
                }

            }
            numberclimber += 1;

        }
    }

    public void add(int toAdd) {
        int index = size;
        //find index to add
        for (int i = 0; i < size - 1; i++) {
            if (ratings[i] > toAdd) {
                index = i;
                break;
            }
        }
        
        //shift right
        for (int i = size; i > index; i--) {
            ratings[i] = ratings[i-1];
        }
        ratings[index] = toAdd;
        System.out.println(Arrays.toString(ratings));
        
        //add value and increase size

    }


}
