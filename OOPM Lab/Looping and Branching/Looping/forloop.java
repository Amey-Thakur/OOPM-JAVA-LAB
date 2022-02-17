import java.util.Scanner;
class forloop
{

public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number whose table who want to view:");
int num=sc.nextInt();

int c=1;

System.out.println("The table is ::");
for(int i=num;i<=num*10;i+=num)
{
System.out.println(num+"X"+c+"="+i);
c++;
}
}

}
