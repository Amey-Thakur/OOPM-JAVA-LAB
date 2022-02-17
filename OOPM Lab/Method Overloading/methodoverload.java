//methodoverloading is the process in which a program can have 2 or more methods with the same name but different parameter list. So depending upon the parameters that we pass in the method calling statement, the compiler will call the suitable method

class methodoverload
{

public static void main(String [] args)
{
methodoverload m=new methodoverload();
m.display("aiktc");
m.display(23);
m.display(12,3.4)
}

void display(int a)
{
System.out.println("we are in 1st method");

System.out.println("The value is "+a);
}

void display(String s)
{

System.out.println("we are in 2nd method");

System.out.println("The value is "+s);

}

void display(int a,float b)
{
System.out.println("we are in 1st method");

System.out.println("The value is "+a);
System.out.println("The value is "+b);

}
}









