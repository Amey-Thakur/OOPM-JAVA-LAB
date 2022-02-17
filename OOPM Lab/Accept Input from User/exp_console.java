// Java Program to demonstrate Console  
  
import java.io.*; 
class exp_console  
{ 
    public static void main(String args[])  
    { 
        String str; 
          
        //Creating object of the console class
	Console con = System.console(); 
          
        // Read a string and then display it. 
        str = con.readLine("Enter your name: "); 
        System.out.println("Your name is "+str); 
                

        //to read password and then display it 
        System.out.println("Enter the password: "); 
        char[] ch=con.readPassword(); 
  
        //converting char array into string 
        String pass = String.valueOf(ch); 
        System.out.println("Password is: " + pass); 
    } 
} 

