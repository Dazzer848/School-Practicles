/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;

/**
 *
 * @author darrenl
 */
public class EX3Q5 {
    public static void main(String[] args) {
        
        // SECTION 1 - Initilise
        
        int numDice = 0;
        int count = 0;
        numDice = (int)(Math.random() * (100-0) + 0);
        
        
        while (numDice > 0) {
            
            //SECTION - 2 repeated calculations
            System.out.print(numDice + ",");
            count += 1;
            numDice = (int)(Math.random() * (100-0) + 0);
            
        }
        
        // SECTION 3 - POST PROCESSING
        System.out.print("THE END");
        System.out.println("");
        System.out.println("");
        System.out.println("Nums generated: " + count);
    }
    
}
