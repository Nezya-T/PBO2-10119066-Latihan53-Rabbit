/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan53.rabbit;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Nim      : 10119066
 * Kelas    : IF2
 */
public class PBO210119066Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter" , false, "grass", 4 , "grey");
        
        System.out.println("Hello, his name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNo0fLegs() + " Legs ");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
    
}
