/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonManeger;
import PersonManeger.Person.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author darrenl
 */
public class PersonManeger {
    
    public static String getName(int id) throws FileNotFoundException{
        File peopleData = new File("PersonObject\\PeopleDataBase.txt");
        Scanner fileSC = new Scanner(peopleData);
        
        while(fileSC.hasNext()){
            String line = fileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");
            
            int idScan = Integer.parseInt(lineSC.next());
            String nameScan = lineSC.next();
            String surnameScan = lineSC.next();
            double weightScan = Double.parseDouble(lineSC.next());
            double heighScan = Double.parseDouble(lineSC.next());

            
            Person p = new Person(nameScan, surnameScan, heighScan, weightScan, idScan);
            
          
            
            if(p.getID() == id){
                return p.getFirstName() + " " +  p.getSurname();
            }
        }
        return "Person is not in dataBase";
    }
    
    public static String getEmail(int id) throws FileNotFoundException{
        File peopleData = new File("PersonObject\\PeopleDataBase.txt");
        Scanner fileSC = new Scanner(peopleData);
        
        while(fileSC.hasNext()){
            String line = fileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");
            
            int idScan = Integer.parseInt(lineSC.next());
            String nameScan = lineSC.next();
            String surnameScan = lineSC.next();
            double weightScan = Double.parseDouble(lineSC.next());
            double heighScan = Double.parseDouble(lineSC.next());

            
            Person p = new Person(nameScan, surnameScan, heighScan, weightScan, idScan);
            
            if(p.getID() == idScan){
                String email = p.getFirstName() + p.getSurname() + "@gmail.com";
                return email;
            }
        
    }
    return "Person not in data base";
    
    }
    
    
    public static double getAvergaeHeight() throws FileNotFoundException{
        
        double totalHeight = 0.0;
        int numOfpeople = 0;
        
        File peopleData = new File("PersonObject\\PeopleDataBase.txt");
        Scanner fileSC = new Scanner(peopleData);
        
        while(fileSC.hasNext()){
            String line = fileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");
            
            int idScan = Integer.parseInt(lineSC.next());
            String nameScan = lineSC.next();
            String surnameScan = lineSC.next();
            double weightScan = Double.parseDouble(lineSC.next());
            double heighScan = Double.parseDouble(lineSC.next());

            totalHeight += heighScan;
            numOfpeople += 1;
            
            Person p = new Person(nameScan, surnameScan, heighScan, weightScan, idScan);
    }
    
        return totalHeight / numOfpeople;
    }
    
    public static double getAvergaeWeight() throws FileNotFoundException{
                
        double totalWeight = 0.0;
        int numOfpeople = 0;
        
        File peopleData = new File("PersonObject\\PeopleDataBase.txt");
        Scanner fileSC = new Scanner(peopleData);
        
        while(fileSC.hasNext()){
            String line = fileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");
            
            int idScan = Integer.parseInt(lineSC.next());
            String nameScan = lineSC.next();
            String surnameScan = lineSC.next();
            double weightScan = Double.parseDouble(lineSC.next());
            double heighScan = Double.parseDouble(lineSC.next());

            
            
            Person p = new Person(nameScan, surnameScan, heighScan, weightScan, idScan);
            
            totalWeight += p.getWeight();
            numOfpeople += 1;
    }
    
        return totalWeight / numOfpeople;
        
    }
    
    public static double getAvergaeBMI() throws FileNotFoundException{
                
        double totalBMI = 0.0;
        int numPeople = 0;
        
        File peopleData = new File("PersonObject\\PeopleDataBase.txt");
        Scanner fileSC = new Scanner(peopleData);
        
        while(fileSC.hasNext()){
            String line = fileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");
            
            int idScan = Integer.parseInt(lineSC.next());
            String nameScan = lineSC.next();
            String surnameScan = lineSC.next();
            double weightScan = Double.parseDouble(lineSC.next());
            double heighScan = Double.parseDouble(lineSC.next());

            
            
            Person p = new Person(nameScan, surnameScan, heighScan, weightScan, idScan);
            
           
            totalBMI += p.getBMI();
            numPeople += 1;
    }
        
        return totalBMI / numPeople;
    
    
    
}
    
    public static void addPerson(String name, String surname, double height, double weight) throws FileNotFoundException, IOException{
        File peopleData = new File("PersonObject\\PeopleDataBase.txt");
        Scanner fileSC = new Scanner(peopleData);
        peopleData.createNewFile();
        
    }
}
