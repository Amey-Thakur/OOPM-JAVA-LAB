import java.util.Scanner;
class methods
{
public static void main(String [] args)
{

Scanner sc=new Scanner(System.in);
//creation of an object 
methods m=new methods();
System.out.println("Enter 2 numbers:");
int num1=sc.nextInt();
int num2=sc.nextInt();

System.out.println("Enter the radius:");
int r=sc.nextInt();

//calling the method
int answer=m.add(num1,num2);
int answer2=m.sub(num1,num2);
float answer3=m.circumcalc(r);


System.out.println("The answer for addition is "+answer);

System.out.println("The answer for subtraction is "+answer2);

System.out.println("The circumference of circle is "+answer3);

}
int add(int a,int b)
{
return a+b;
}

int sub(int c,int d)
{
return c-d;
}

float circumcalc(int radius)
{
return 2*3.14f*radius;
}
}
