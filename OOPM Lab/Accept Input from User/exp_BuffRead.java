
// Java program to demonstrate use of BufferedReader class to accept input from user

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class exp_BuffRead  
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Creating object of Buffered Reader class
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
         
        System.out.println("Please enter a value :");
        // Reading data using readLine 
        String s = br.readLine(); 
       
        // Converting the value in variable s to integer  
        int i= Interger.parseInt(s);

        // Printing the accepted value 
   System.out.println("The value entered by the user is "+i);         
    } 
} 

