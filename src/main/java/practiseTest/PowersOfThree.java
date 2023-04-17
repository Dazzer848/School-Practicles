/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiseTest;

/**
 *
 * @author darrenl
 */
public class PowersOfThree {
    public static void main(String[] args) {
        int sum = 0;
        for (double i = 1; i < 6; i = i + 1){
            int power = (int)Math.pow(3, i);
            System.out.println(power + " ");
            sum = sum + power;
        }
    }
    
}
