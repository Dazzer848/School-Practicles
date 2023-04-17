/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;
// ADD TOTAL WIN THING, otherwise it all works.
/**
 *
 * @author darrenl
 */
public class bossSim {

    public static int TotalWin = 0;
    public static String results = "";
    public static String result = "";
    
    public static void main(String[] args) {
        for (int level = 1; level < 11; level++) {
            String results = null;
            
            int tAttackDamage = 0;
            
            int levelMultiplier = generateRandomNumber(1, 4);

            int bossHealth = getBossHealth(level, levelMultiplier);
            
            getTotalWin(bossHealth, tAttackDamage);
            
           
            
           
            
            
            System.out.println("");
            System.out.println("------------ LEVEL:" + level + "---------------");
            for (int attack = 1; attack < 5; attack++) {
              
                System.out.print("Attack: " + attack);
                int attackDamage = getAttackDamage(bossHealth);
                tAttackDamage += attackDamage;
                
                results = getWin(bossHealth, tAttackDamage);
                
                
            }
            System.out.println("");
            System.out.println("Total Attack Damage: " + tAttackDamage);
            System.out.println("Boss Health: " + bossHealth);
            System.out.println("");
            System.out.println("Result: " + results);
            System.out.println("");
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Wins: " + TotalWin);

    }

    public static int getBossHealth(int level, int multi) {
        return 50 + level * 10 * multi;
    }

    //Including LOW excluding High
    public static int generateRandomNumber(int low, int high) {

        return (int) (Math.random() * (high - low) + low);
    }

    public static int getAttackDamage(int bossHealth) {
        String attacks;
        int numGenerated = generateRandomNumber(1, 6);
        int attackDamage = 0;
        if (numGenerated == 1) {
            attackDamage = 0;
            attacks = "MISS";
            System.out.println("\t Attack Type: "+ attacks + "\t Attack damage:" + attackDamage);

        } else if (numGenerated == 2 || numGenerated == 3 || numGenerated == 4) {
            attackDamage = numGenerated * 15;
            attacks = "NORMAL";
            System.out.println("\t Attack Type: "+ attacks + "\t Attack damage:" + attackDamage);

        } else {
            attackDamage = bossHealth / 2;
            attacks = "CRITICAL";
            System.out.println("\t Attack Type: "+ attacks + "\t Attack damage:" + attackDamage);
        }
        return attackDamage;
    }
    
    public static String getWin(int bossHealth, int tAttackDamage) {
        if (bossHealth > tAttackDamage) {
            results = "LOSE";
            
        }
        
        else if (bossHealth < tAttackDamage) {
            results = "WIN";
            
            
        }
        
        else if (bossHealth == tAttackDamage) {
            results = "DRAW";
            
        }
        return results;
    }
    public static void getTotalWin(int bossHealth, int tAttackDamage) {
        if (results == "WIN") {
           TotalWin = TotalWin + 1;
            
        }
    }
}
