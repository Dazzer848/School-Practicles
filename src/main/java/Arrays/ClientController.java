/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darrenl
 */
public class ClientController {

    private Client[] clients;
    private int size = 0;
    private static final String FILE_NAME = "things//Clients.txt";

    public ClientController() {
        try {
            clients = new Client[100];
            Scanner fileSC = new Scanner(new File(FILE_NAME));

            while (fileSC.hasNextLine()) {
                Scanner lineSC = new Scanner(fileSC.nextLine()).useDelimiter("#");

                String name = lineSC.next();
                String email = lineSC.next();
                String password = lineSC.next();
                String c = lineSC.next();
                int clientTier = c.equals("bronze") ? 0 : c.equals("silver") ? 1 : 2;
                int usage = lineSC.nextInt();
                clients[size] = new Client(name, email, password, clientTier, usage);
                size += 1;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("LISTEN MATE INPUT THE RIGHT FILE OR ELSE I WILL BE AT YOUR DOOR");;
        }
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += clients[i].toString() + "\n\n\n\n";
        }
        return output;
    }

    public void arraySorter() {
        for (int i = size - 1; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (clients[j + 1].getSurname().compareTo(clients[j].getSurname()) > 0) {
                    Client temp = clients[j + 1];
                    clients[j + 1] = clients[j];
                    clients[j] = temp;
                    sorted = true;
                }
            }
            if (sorted == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(clients));
    }

    public Client search(String surname) {
        int start = 0; int mid = 0; int end = clients.length - 1; Client clientObjec = null;
        boolean found = false;
        
        while(start <= end && found == false){
            mid = (start + end) / 2;
            if(clients[mid].getSurname().compareTo(surname) > 0){
                end = mid - 1;
            }
            else if(clients[mid].getSurname().compareTo(surname) < 0){
                start = mid + 1;
            }
            else{
                found = true;
                return clients[mid];
            }
        }
        return null;

    }
}
