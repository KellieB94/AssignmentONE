/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1;
//PART ONE - READING FROM A FILE(comment)

//Libraries listed to generate the customer file(comment)
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

//public class CA1 {

    //https://github.com/KellieB94/AssignmentONE.git - GitHub Repo
    
        //public static void main(String[] args) {
       
        //assignment of File Path to define the file(comment)
        //String custFile = "C:\\Users\\ismis\\customers.txt";
        
        //initialization of BufferedReader to load customer file(comment)
        //try (BufferedReader buf = new BufferedReader(new FileReader(custFile))){
        //assignment of try, while and catch(comment)
            //String list;
         //while ((list = buf.readLine()) != null) {
             //System.out.println(list);
         //}
        //} catch (IOException k) {
          //k.printStackTrace();
        //}
    //}
    
//}

//PART 2 - FIXING CUSTOMER ERROR INPUT(comment)

//Library to import Scanner
//import java.util.Scanner;

       //public class CA1 {
           
           //public static void main(String[] args) {
               
                //importing the scanner class(comment)
                //Scanner scanner = new Scanner(System.in);
        
                //asking customer for Name where the first name can be JUST LETTERS(comment)
                //System.out.print("Name & Surname (First Name must be LETTERS ONLY): ");
                //String Name = scanner.nextLine();
        
                //asking customer for Purchase Value(comment)
                //System.out.print("Purchase Value: ");
                //double purVal = scanner.nextDouble();
        
                //asking customer for Class of Purchase(comment)
                //System.out.print("Class of Purchase: ");
                //int Class = scanner.nextInt();
        
                //asking customer for Year of Last Purchase(comment)
                //System.out.print("Year of Last Purchase: ");
                //int lasPur = scanner.nextInt();
        
                //closing the scanner(comment) 
                //scanner.close();
  
           /*testing to make sure Customer doesn't input invalid Class of Purchase
            *Class of Purchase must be between 1 & 3(comment)
            */
           //if ( Class <= 0){
              //System.out.println("Invalid class number, class must be between 1 & 3 ");
           
           //}
           //if ( Class >= 4) {
               //System.out.println("Invalid class number, class must be between 1 & 3");
           //}
    //}
  //}

//PART THREE - CALCULATING DISCOUNT TO ASSIGN FINAL VALUE OF VALID CUSTOMERS(Comment)
        
        //public class CA1 {

         //public static void main(String[] args) {
        
        //Input of Purchase Value and Discount Rate to calculate Result(comment)
        //ClassDiscount discount = new ClassDiscount(1523.00, 3);
        //Assigning Original Purchase Value(comment)
        //System.out.println("Original Purchase Value: " + discount.getpurVal());
        //Assigning Discount Rate(comment)
        //System.out.println("Discount Rate: " + discount.getclaDis() + "%");
        //Assigning Discounted Price(comment)
        //System.out.println("Final Purchase Value: " + discount.finVal());
    //}
   
        //}

//PART FOUR - WRITING A NEW TEXT FILE WITH VALID CUSTOMER DISCOUNT(Comment)
//FORMAT - NAME AND FINAL VALUE

//Libraries to Write the text File(comment)
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CA1 { 
         
        //initialization of BufferedWriter to create new Customer File(comment)
        public static void CustomersToFile(List<CuSTomers> customers, String filename) {
        //assignment of try, for and catch(comment)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (CuSTomers customer : customers) {
                writer.write(customer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //initialization of Array List 
        List<CuSTomers> customers = List.of(
            new CuSTomers ("Patrick Moss", 79.20),//Name and Final Value(comment)
            new CuSTomers ("Barry Smart", 2780.00),//Name and Final Value(comment)
            new CuSTomers ("Declan Walsh", 189.00),//Name and Final Value(comment)
            new CuSTomers ("Sam Weiss", 455.01),//Name and Final Value(comment)
            new CuSTomers ("Peter Nolan", 159.80),//Name and Final Value(comment)
            new CuSTomers ("Katie White", 78.00),//Name and Final Value(comment)
            new CuSTomers ("Cristiani Eccher", 1477.31)//Name and Final Value(comment)
        );
         //assignment of new Customer file Path(comment)
        CustomersToFile(customers, "customerdiscount.txt");
    }
}




