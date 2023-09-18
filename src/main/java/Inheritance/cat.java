/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author darrenl
 */
public class cat extends Animal{
    private boolean isScracthed;
    private String topEnemy;
    private int evilRating;

    public cat(int numLegs, double weight, double height, double distanceTravelled, boolean inIsScratched, String inEnemy, int inEvilRating) {
        super(numLegs, weight, height, distanceTravelled);
        
        this.isScracthed = inIsScratched;
        this.topEnemy = inEnemy;
        this.evilRating = inEvilRating;
        
    }
    
    public void dealDamage(){
        System.out.println(topEnemy + "\nTook serious damage, infact the cat slapped him so hard his thigh shatterd, his toe disintergrated and he ceased existance\n");
        System.out.println("---------------- BUT WAIT! -------------------------\n\n" + topEnemy +" swipes back and slaps one of the legs off of your cat");
        numLegs--;
    }
    
}
