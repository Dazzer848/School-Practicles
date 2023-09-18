/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author darrenl
 */
public class Animal {
    
    // Protected is the same as private, however the chidlren classes can now edit this field!
    // It means that this field is only directly accessible to this class and its sub classes
    // HASH indicated protected. # Means protected
    protected int numLegs;
    private double weight;
    private double height;
    private double distanceTravelled;

    public Animal(int numLegs, double weight, double height, double distanceTravelled) {
        this.numLegs = numLegs;
        this.weight = weight;
        this.height = height;
        this.distanceTravelled = distanceTravelled;
    }
    
    public void runABit(){
        distanceTravelled += 1;
    }
    
    public void makeNoise(){
        System.out.println("**Insert** Generic Grunt hmfkdg");
    }
    
    
}
