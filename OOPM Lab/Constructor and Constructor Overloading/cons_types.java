class cons_types
{
int x;
float y;

//no-arguments constructor
cons_types()
{
System.out.println("In no-arguments constructor");
}

//parameterized constructor
cons_types(int a,float b)
{
System.out.println("In parameterized constructor");
this.x=a;
this.y=b;
}

public static void main(String [] args)
{
cons_types c1=new cons_types();//calling the no arguments constructor
cons_types c2=new cons_types(5,10.5f);//calling the parameterized constructor
}
}
