// Java program to demonstrate working of Scanner in Java 

import java.util.Scanner; 
  
class exp_scanner 
{ 
    public static void main(String args[]) 
    { 

        // Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in); 
  
        String s = in.nextLine(); //if you want to accept a string from the user
        System.out.println("You entered a string "+s); 
  
        int a = in.nextInt(); //if you want to accept an integer
        System.out.println("You entered an integer "+a); 
  
        float b = in.nextFloat(); //if you want to accept float
        System.out.println("You entered a float "+b); 
    } 
} 


