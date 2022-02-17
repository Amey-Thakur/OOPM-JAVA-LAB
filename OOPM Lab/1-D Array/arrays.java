import java.util.Scanner;
class arrays
{

public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);


//syntax for the creation of an array
int [] studentmarks=new int[10];


System.out.println("Please enter the marks for 10 students::");

for(int i=0;i<10;i++)
studentmarks[i]=sc.nextInt();

System.out.println("The marks stored in the array for 10 students are::");

for(int i=0;i<10;i++)
{
System.out.println(studentmarks[i]);
}
}
}




