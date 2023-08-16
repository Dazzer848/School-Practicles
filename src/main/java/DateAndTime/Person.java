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

/**
 *
 * @author darrenl
 */
public class Person{
    private int age;
    private String name;
    private int id;
    private LocalDate date;
    
    /// MUST CHANGE TO THAT
    
    public Person(String name, int age, int id, LocalDate date) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.date = date;
            
            // Has both primative and non primative fields????
        }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd:MMMM:yyyy");
        
        return "-----------------------" + name.toUpperCase() +"----------------------------" + "\nAge: "+ age + "\nID: " + id + "\nDate Of Birth: " + date.format(outputFormatter);
    }
    
    
    }

