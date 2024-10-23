/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1;

//Library Initialization
import java.io.Serializable;

public class CuSTomers implements Serializable{
    
    //customer data - attributes from my Customers class
    private String name;
    private double finVal;
    
    //return data - methods to get return data
    public CuSTomers(String name, double finVal){
        this.name = name;
        this.finVal = finVal;
        
    }
    @Override 
     //method to return data to written file in ARRAY STRING 
     public String toString(){
         return "Customer{Name='" + name + "', Final Value='" + finVal + "'}";
                 
     }
    
} 
  
