//program to demonstrate single level and multi level inheritance
import java.util.Scanner;
class parent
{
int accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a number::");
int no=sc.nextInt();
return no;
}
}

class child extends parent
{
int index=0;
int a[]=new int[10];

int [] table(int num)
{
for(int i=num;i<=num*10;i+=num)
{
a[index]=i;
index++;
}

return a;

}
}

class grandchild extends child
{
void display(int a2[])
{
System.out.println("The table of entered number is : ");
for (int i=0;i<10;i++)
{
System.out.println(a2[i]);
}
}
}


class multilevel_inherit
{
public static void main(String [] args)
{
grandchild g=new grandchild();
int num=g.accept();
int a1[]=g.table(num);
g.display(a1);

}
}
