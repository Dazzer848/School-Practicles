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
public class ArraySorter {

    public static void main(String[] args) {
        int[] numbers = {2, 9, 5, 6, 7};
        int[] toPrint = sortArray(numbers);
        
        System.out.println("" + Arrays.toString(toPrint));
    }

    public static int[] sortArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
           
            // IF IT WAS F = 1 IT DIDNT WORK!!!!! Well it did except for the first numbers
            for (int f = i + 1; f < numbers.length; f++) {
               
                if (numbers[i] > numbers[f]) {
                    int number1 = numbers[i];
                    int toChange = numbers[f];
                    numbers[i] = toChange;
                    numbers[f] = number1;
                   

                }
            }

        }
        return numbers;
    }
}
