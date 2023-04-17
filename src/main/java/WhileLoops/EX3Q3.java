/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;

/**
 *
 * @author darrenl
 */
public class EX3Q3 {
    public static void main(String[] args) {
        
        //SECTION 1 - INITIALISE
        int price = 200;
        int days = 0;
        
        while (price > 100){ //Test (condition)
            
            // SECTION 2 - REPEATED CALCULATIONS
            days += 1;
            price = price - 8;
            
            
        }
        
        //SECTION 3 - POST PROCESSING
        System.out.println("New price is: R" + price + "\n It took " + days + " days");
    }
    
}
