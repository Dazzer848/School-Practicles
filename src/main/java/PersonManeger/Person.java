/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonManeger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author darrenl
 */
public class Person {
    private String name;
    private String surname;
    private double height;
    private double weight;
    private int id;

    public Person(String inName, String inSurname, double inHeight, double inWeight, int inId) {
        name = inName;
        surname = inSurname;
        height = inHeight;
        weight = inWeight;
        id = inId;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getID(){
        return id;
    }
    
    
    
    public String getFirstName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getEmail(){
        return name + "." + surname + "@gmail.com";
        
    }
    public double getBMI(){
        double inch = height * 2.20462262;
        double pound = weight / 2.54;
        double BMI = 703 * (pound / Math.pow(inch, 2));
        
        return BMI;
    
    }
            
    public String toString(){
        return "Person( name = " + name + "\nsurname = " + surname + "\nweight = " + weight + "\n height = " + height + ")";
    }
    
    
}
