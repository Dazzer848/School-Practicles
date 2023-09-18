/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author darrenl
 */
public class AnimalUI {
    public static void main(String[] args) {
        Dog brutus = new Dog(3, 26.3, 400.1, 1000.1, "Brutus", 20);
        brutus.runABit();
        brutus.addBones();
        brutus.makeNoise();
        
        Animal animal = new Animal(4,18.4,19.2,400.1);
        animal.runABit();
        animal.makeNoise();
        
        cat throngler = new cat(4, 20.1, 5.1, 180.2, true, "Gary, The Human who eats my cat food", 10);
        throngler.dealDamage();
        throngler.makeNoise();
        
                }
    
}
