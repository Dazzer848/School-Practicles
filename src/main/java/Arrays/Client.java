/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author darrenl
 */
public class Client {

    private String fullname;
    private String email;
    private String password;
    private int ClientTier;
    private int currentUsage;
    private static final int BRONZE_TIER = 0;
    private static final int SILVER_TIER = 1;
    private static final int GOLD_TIER = 2;

    public Client(String fn, String e, String p, int cT, int cU) {
        this.fullname = fn;
        this.email = e;
        this.password = p;
        this.ClientTier = cT;
        this.currentUsage = cU;
    }

    public String getSurname() {
        String surname = "";
        Scanner nameSC = new Scanner(fullname);
        while (nameSC.hasNext()) {
            surname = nameSC.next();
        }

        return surname;
    }

    public double calculateCurrentBill() {
        double bill = 0.0;
        switch (ClientTier) {
            case 0:
                bill = 100 + (0.80 * currentUsage);
                break;
            case 1:

                if (currentUsage > 300) {

                    int mbUsedAfterFREE = currentUsage - 300;
                    bill = 180 + (mbUsedAfterFREE * 0.75);
                } else {
                    bill = 180.0;
                }
                break;
            case 2:

                if (currentUsage > 1000) {
                    int mbUsedAfterFREE = currentUsage - 1000;
                    bill = 350 + (mbUsedAfterFREE * 0.68);
                } else {
                    bill = 350.0;
                }
                break;
            default:
                System.out.println("ERROR ERROR YOUR BILL IS TO POWERFUL");

        }
        return bill;
    }
    
    public boolean isSecure(){
        boolean isSecure = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNum = false;
        
        for(int i = 0; i < password.length(); i++){
            char toCheck = password.charAt(i);
            
            if(Character.isUpperCase(toCheck)){
                hasUpperCase = true;
                
            }
            else if(Character.isDigit(toCheck)){
                hasNum = true;
                
            }
            else{
                hasLowerCase = true;
            }
        }
        if(hasLowerCase == true && hasUpperCase == true && hasNum == true && password.length() >= 8){
            isSecure = true;
            return isSecure;
        }
        return isSecure;
    }
    
    public String toString(){
        String accountTier = "";
        switch(this.ClientTier){
            case Client.BRONZE_TIER:
                accountTier = "BRONZE";
                break;
            case Client.SILVER_TIER:
                accountTier ="SILVER";
                break;
            case Client.GOLD_TIER:
                accountTier = "GOLD";
                break;
            default:
                System.out.println("It appears you may not have an account");
                
        }
        
        double bill = calculateCurrentBill();
        boolean isSecure = isSecure();
        String output = "USER: " + fullname +"\nACCOUNT TIER: " + accountTier + "\nCURRENT ACCOUNTP: " + currentUsage + "@" + bill + "\nSECURE: " + isSecure;
        
        return output;
    }
    
}
