/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1;
//PART ONE - READING FROM A FILE

//Libraries listed to generate the customer file
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

//public class CA1 {

    //https://github.com/KellieB94/AssignmentONE.git - GitHub Repo
    
        //public static void main(String[] args) {
       
        //assignment of File Path to define the file
        //String custFile = "C:\\Users\\ismis\\customers.txt";
        
        //initialization of BufferedReader to load customer file
        //try (BufferedReader buf = new BufferedReader(new FileReader(custFile))){
            //String list;
         //while ((list = buf.readLine()) != null) {
             //System.out.println(list);
         //}
        //} catch (IOException k) {
          //k.printStackTrace();
        //}
    //}
    
//}

//PART 2 - FIXING CUSTOMER ERROR INPUT

//Library to import Scanner
//import java.util.Scanner;

       //public class CA1 {
           
           //public static void main(String[] args) {
               
                //importing the scanner class
                //Scanner scanner = new Scanner(System.in);
        
                //asking customer for Name
                //System.out.print("Name & Surname (First Name must be LETTERS ONLY): ");
                //String Name = scanner.nextLine();
        
                //asking customer for Purchase Value
                //System.out.print("Purchase Value: ");
                //double purVal = scanner.nextDouble();
        
                //asking customer for Class of Purchase 
                //System.out.print("Class of Purchase: ");
                //int Class = scanner.nextInt();
        
                //asking customer for Year of Last Purchase
                //System.out.print("Year of Last Purchase: ");
                //int lasPur = scanner.nextInt();
        
                //closing the scanner 
                //scanner.close();
  
           /*testing to make sure Customer doesn't input invalid Class of Purchase
            *Class of Purchase must be between 1 & 3
            */
           //if ( Class <= 0){
              //System.out.println("Invalid class number, class must be between 1 & 3 ");
           
           //}
           //if ( Class >= 4) {
               //System.out.println("Invalid class number, class must be between 1 & 3");
           //}
    //}
  //}

//PART THREE - CALCULATING DISCOUNT TO ASSIGN FINAL VALUE OF VALID CUSTOMERS
        
        public class CA1 {

         public static void main(String[] args) {
        
        //Input of Purchase Value and Discount Rate to calculate Result
        ClassDiscount discount = new ClassDiscount(1523.00, 3);
        //Assigning Purchase Value 
        System.out.println("Original Purchase Value: " + discount.getpurVal());
        //Assigning Discount Rate
        System.out.println("Discount Rate: " + discount.getclaDis() + "%");
        //Assigning Discounted Price
        System.out.println("Final Purchase Value: " + discount.finVal());
    }
   
        }

