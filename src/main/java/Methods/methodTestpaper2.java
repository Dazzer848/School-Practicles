/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author darrenl
 */
public class methodTestpaper2 {

    // Declaring ALL GLOBAL variables
    public static int totalEggs = 25;
    public static int currentDayPower = 0;
    public static int highestPower = 0;
    public static int highestDay = 0;

    // MAIN METHOD
    public static void main(String[] args) {

        for (int day = 1; day <= 7; day++) {
            System.out.println("---------------------------- Day " + day + " ---------------------");

            getoneDay();
            
            
            System.out.println("");
            
            if(totalEggs == 0){
                break;
            }
            
            if (highestPower < currentDayPower){
                highestPower = currentDayPower;
                highestDay = day;
            }
        }
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("Highest Power was on " + highestDay);
        System.out.println("The highest power was: " + highestPower);

    }

    // Method 1
    public static void getoneDay() {
        int high = 8;
        int low = 2;

        int numEggs = (int) (Math.random() * (high - low) + low);

        if (numEggs > totalEggs) {
            numEggs = totalEggs;
        }

        System.out.println("Total Eggs: " + totalEggs);
        System.out.println("Eggs for today: " + numEggs);
        System.out.println("");

        totalEggs = totalEggs - numEggs;

      
        
        currentDayPower = 0;
        
        for (int i = 1; i <= numEggs; i++) {
            int eggType = (int) (Math.random() * (4 - 1) + 1);
            
            int eggPower = 0;
            String eggName = "";
            
            if (eggType == 1) {
                eggName = "ELF";
                eggPower = 430;
            }
            else if (eggType == 2) {
                eggName = "Vampire";
                eggPower = 320;
            }
            else if (eggType == 3) {
                eggName = "Zombie";
                eggPower = 175;
            }
            
            System.out.println("Egg: " + i + " | Type: " + eggName + " | Power: " + eggPower);
            currentDayPower = currentDayPower + eggPower;

        }
        System.out.println("");
        System.out.println("Total power for the day: " + currentDayPower);

    }

}
