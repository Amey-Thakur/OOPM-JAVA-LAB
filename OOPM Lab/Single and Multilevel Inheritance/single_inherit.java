//program to demonstrate single level and multi level inheritance
import java.util.Scanner;
class parent
{

void table(int num)
{

for(int i=num;i<=num*10;i+=num)
{
System.out.println(i);
}
}
}

class child extends parent
{

int accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a number::");
int no=sc.nextInt();
return no;
}

}

class single_inherit
{
public static void main(String [] args)
{
child c=new child();
int number=c.accept();
c.table(number);
}
}
