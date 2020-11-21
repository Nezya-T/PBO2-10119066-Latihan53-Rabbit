/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan53.rabbit;

/**
 *
 * @author Neyza-T
 */
public class Animal {
    
    protected boolean vegetarian;
    protected String eats;
    protected int no0fLegs;
    
    public Animal(boolean vegetarian , String food,int legs){
        this.vegetarian = vegetarian;
        eats = food;
        no0fLegs = legs;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
    public String getEats(){
        return eats;
    }
    public int getNo0fLegs(){
        return no0fLegs;
    }
    
}
