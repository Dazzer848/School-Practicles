/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;

/**
 *
 * @author darrenl
 */
public class PersonController {
    private int size;
    private Person[] personArray;
    
    public PersonController(){
        try {
            
            Scanner fileSC = new Scanner(new File("SchoolData\\Names.txt"));
            this.personArray = new Person[100];
            size = 0;
            
            while(fileSC.hasNext()){
                Scanner lineSC = new Scanner(fileSC.next()).useDelimiter("#");
                
                String name = lineSC.next();
                int age = lineSC.nextInt();
                int id = lineSC.nextInt();
                String date = lineSC.next();
                
                //Need to learn how to do this. Just need to know how to use the Object when it comes to working with conversions
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
               
                
                Person p = new Person(name,age,id,LocalDate.parse(date, inputFormatter));
                personArray[size] = p;
                size++;
            } 
        } catch (FileNotFoundException ex) {
            System.out.println("An Error occured in the finding of the file");
        }
        
        
    }
    
    public void toString(String name){
        for(int i = 0; i < size; i++){
            if(personArray[i].getName().equals(name)){
                Person p = personArray[i];
                System.out.println(p.toString());
                    break;
                }
            else{
                System.out.println("Person not found sorry :))");
                
            }
        }
        
    }
    
}
