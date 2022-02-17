abstract class parent
{
abstract void area();

int num=10;

void disp()
{
System.out.println("Display method of abstract class area");
}
}

class square extends parent
{
void area()
{
int area=2*2;

System.out.println("The area of square is"+area);

System.out.println("The value of num is "+num);


}
}

class abstraction
{
public static void main(String [] args)
{
square sq=new square();
sq.area();
sq.disp();
}
}
