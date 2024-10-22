/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1; 

public class ClassDiscount {
    
    private double purVal;
    private double claDis;
    
    
    //constructor 
    public ClassDiscount (double purVal, double claDis){
        this.purVal = purVal;
        this.claDis = claDis;
    }
    
    //getter for Purchase Value
    public double getpurVal(){
        return purVal;
    }
    
    //setter for Purchase Value
    public void setpurVal(double purVal){
        this.purVal = purVal;
}
    
    //getter for Discount Rate
    public double getclaDis(){
        return claDis;
    }
    
    //setter for Discount Rate
    public void setclaDis(double claDis){
        this.claDis = claDis;
    }
    
    //method to calculate the Final Value after applied Discount
    public double finVal(){
        return purVal - (purVal * claDis / 100);
    }
    
}
       
