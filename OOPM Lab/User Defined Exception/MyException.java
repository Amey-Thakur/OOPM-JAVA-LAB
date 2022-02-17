import java.util.Scanner;

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
  
// A Class that uses above MyException 
public class Main 
{ 
 public static void main(String args[]) throws MyException
    { 
Scanner sc=new Scanner(System.in);
System.out.println("Please enter an odd number:");
int i=sc.nextInt();

if(i%2==0)
{
            throw new MyException("user defined exception has been thrown"); 
}        

else
{
System.out.println("Thank you for entering  the odd number");
} 
 
   } 
} 

