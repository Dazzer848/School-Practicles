/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author darrenl
 */
public class ClientUI {
    public static void main(String[] args) {
        Client c = new Client("Darren Jayden Larkens","Dazzer@gmail.com","Gamer123MUG",1,301);
        ClientController d = new ClientController();
        System.out.println(d.toString());
        (d.search("Pieters")).toString();
    }
}
