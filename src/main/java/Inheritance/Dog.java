/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author darrenl
 */
public class Dog extends Animal{
    private String name;
    private int bonesEaten;
    
    public Dog(int numLegs, double weight, double height, double distanceTravelled, String nameIn, int inBonesEaten) {
        // SUPER MUST ALWAYS BE THE FIRST LINE IN THE DOG CONSTRUCTOR ( ALWAYS THE TOP )
        // Animal is the Super class, Dog is the sub class
        // Animal is the parent class and Dog is the child class ( same as saying super and sub )
        super(numLegs, weight, height, distanceTravelled);
        
        
        //  We dont add this to the super becaues the Dog is the only animal with these properties
        // therefor we dont pass it up
        this.name = nameIn;
        this.bonesEaten = inBonesEaten;
    }
    
    public void changeName(String insertName){
        this.name = insertName;
    }
    
    public void addBones(){
        this.bonesEaten += 1;
    }
    
    // You must ensure the method is exactly the same MUST HAVE THE SAME METHOD SINGATURE ( same parameters and so forth )! 
    //Override means to change the super ( Parent ) classes method for this method
    
    // Fancy word ( Dynamic Binding ) = if it has more than one method with the same name ( overloading ) how does it know which one to chose
    // It choses the method that is lowest in the Inheritance tree
    
    // Method overloading is where we have methods with the same name but different signature
    // Overriding is with the exact same signature
    
    // Overriding is a replacement of the method ( instead of that do this )
    // Overloading extends the functionaltiy of the method ( increases the usefulness of an Action )
    
    @Override
     public void makeNoise(){
         System.out.println("WOOF WOOF!");
     }
}
    

