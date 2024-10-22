/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1;
//PART ONE - READING FROM A FILE

//Libraries listed to generate the customer file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CA1 {

    //https://github.com/KellieB94/AssignmentONE.git - GitHub Repo
    
        public static void main(String[] args) {
       
        //assignment of File Path to define the file
        String custFile = "C:\\Users\\ismis\\customers.txt";
        
        //initialization of BufferedReader to load customer file
        try (BufferedReader buf = new BufferedReader(new FileReader(custFile))){
            String list;
         while ((list = buf.readLine()) != null) {
             System.out.println(list);
         }
        } catch (IOException k) {
          k.printStackTrace();
        }
    }
    
}

