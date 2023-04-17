/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author darrenl
 */
public class AllArray {

    public static void main(String[] args) {
        int[] arrayToSort = {1, 32, 4, 154, 51325, 132, 1243, 124, 1, 3, 5612, 4, 1, 32, 5, 1, 3, 65, 6, 8, 3, 3, 6, 21, 8, 8, 10, 4, 3, 2, 5123};

        int Selection = Integer.parseInt(JOptionPane.showInputDialog("Please input a number to sort your array\n1: Linear sort\n2:Bubble Sort\n3: Binary sort"));

    }

    public static int[] BubbleSort(int[] array) {

        for (int pointer1 = array.length - 1; pointer1 <= array.length; pointer1--) {
            boolean changed = false;
            for (int pointer2 = 0; pointer2 < pointer1; pointer2++) {
                int pointer3 = pointer2 + 1;

                int numberPointer2 = array[pointer2];
                int numberPointer3 = array[pointer3];

                if (numberPointer3 < numberPointer2) {
                    array[pointer2] = numberPointer3;
                    array[pointer3] = numberPointer2;
                    changed = true;
                }

                if (pointer2 == array.length - 3 && pointer3 == array.length - 2 && changed == true) {
                    if (changed = true) {
                        break;
                    }
                }
            }

        }
        System.out.println("" + Arrays.toString(array));
        return array;

    }

    public static int BinarySorter(int[] array) {
        BubbleSort(array);
        int mid = 0, start = 0, pos = -1, end = array.length - 1;
        boolean found = false;
        String response = "";

        int lookfor = Integer.parseInt(JOptionPane.showInputDialog("PLeaseNumber"));
        while (start <= end && found == false) {
            mid = (start + end) / 2;
            if (lookfor > array[mid]) {
                start = mid + 1;
                return mid;
            } else if (lookfor < array[mid]) {
                end = mid - 1;
            } else {
                found = true;
                pos = mid;
                System.out.println("Found number at postion: " + pos);
            }

        }
        return pos;
    }

    public static int[] LinearSort(String[] args) {
        int[] array = {1, 4, 6, 9, 12, 69, 420, 308};
        int toSearch = Integer.parseInt(JOptionPane.showInputDialog("Please num"));
        boolean same = false;
        String response = "";

        for (int i = 0; i < array.length - 1; i++) {
            if (toSearch == array[i]) {
                same = true;
                response = "FOUND";
                break;
            } else {
                same = false;
                response = "NOT FOUND";
            }

        }

        System.out.println("This found?: " + response);
    }

}
