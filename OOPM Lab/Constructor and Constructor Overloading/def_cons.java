/*program for demonstrating the default constructor 

Default Constructor provided by Compiler
When we do not explicitly provide a constructor to our class, the compiler provides a default constructor which initialises all the instance variables to their default values. The default constructor provided by the compiler is different from the no argument or default constructor which we provide ourselves. In the constructor that we provide, we are able to set the variables to any default values that we wish to do so which may be 0 ,-1 or some other different value, but this is not the case with the default constructor provided by the compiler. It sets variables of different data types to the default values given by the following table:

Data Type 	Variable Name
byte 		0
short 		0
int 		0
long 		0L
float 		0.0f
double 		0.0
boolean 	false
char 	        '\u0000'(null character)
<All reference types> 	Null
*/


class def_cons
{
int a;
float b;
String c;
long d;
char e;
double f;
boolean g;
short h;
byte i;

public static void main(String [] args)
{

def_cons c=new def_cons();
	
System.out.println("a="+c.a);
System.out.println("b="+c.b);
System.out.println("c="+c.c);
System.out.println("d="+c.d);
System.out.println("e="+c.e);
System.out.println("f="+c.f);
System.out.println("g="+c.g);
System.out.println("h="+c.h);
System.out.println("i="+c.i);

}
}






