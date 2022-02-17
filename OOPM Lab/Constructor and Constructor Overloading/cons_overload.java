class cons_overload
{
int a,b;
float c;
String d;

cons_overload(int num1,int num2)
{
a=num1;
b=num2;
}

cons_overload(float num)
{
c=num;
}

cons_overload(String val)
{
d=val;
}

public static void main(String [] args)
{
cons_overload co=new cons_overload(5,7);
cons_overload co1=new cons_overload(5.9f);
cons_overload co2=new cons_overload("AIKTC");

System.out.println(co.a);
System.out.println(co.b);
System.out.println(co1.c);
System.out.println(co2.d);
}
}
