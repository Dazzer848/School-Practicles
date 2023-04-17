/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author darrenl
 */
public class Person {

    public String name;
    public int age;
    public int id;
    public String surname;

    
    // GO ONTO OTHER ACCOUNT AND SA7Y " THEY ARE COMING ";
    public void crying() throws IOException {
        int fileNums = 0;
        int checker = 10;
        String ConsoleOut = "You see what you have started here is an unstopable force, i will forever be crying and there is nothing you can do about it. It starts now.";
        String toPrint = "Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe v Among us Fart in Fornite Zero Point McD and King collabeAmong us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe Among us Fart in Fornite Zero Point McD and King collabe ";
        System.out.println("Currently " + name + " is crying");
        System.out.println(ConsoleOut);
        
        File peopleData = new File("PersonObject//Notes" + fileNums + ".txt");
        peopleData.createNewFile();
        FileWriter printer = new FileWriter(peopleData, true);
        printer.write(toPrint);
        printer.close();
        fileNums += 1;
        
        for(int i = 0; i <= checker; i++){
        peopleData = new File("PersonObject//Notes" + fileNums + ".txt");
        peopleData.createNewFile();
        printer = new FileWriter(peopleData, true);
        printer.write(toPrint);
        fileNums += 1;
        printer.close();
            

            
            
        }
    }

    public void changingYourself(String toChange) {
        System.out.print("The name has been changed from " + name);
        name = toChange;
        System.out.print(" TO ");

    }
    

    public String generateEmail() {

        String email = this.name + this.surname + "@gmail.com";

        return email;
    }

    private Writer FileWriter(String cUsersdarrenlDocumentsNetBeansProjectsPAT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
