//Program to demonstrate the use of 2d array

class twodarray
{
public static void main(String [] args)
{

//creation of 2d array 
int [][] a={{10,20,30},{40,50,60}};
int [][] b={{11,30,32},{82,5,82}};
int [][] c=new int [2][3];

//displaying the content that is stored in the array a and b
System.out.print("1st Array\n");

for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.print("\t"+a[i][j]);
}
System.out.print("\n");
}

System.out.print("2nd array\n");

for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.print("\t"+b[i][j]);
}
System.out.print("\n");
}

for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}


System.out.print("The answer for addition of both the arrays is as follows \n");

for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.print("\t"+c[i][j]);
}
System.out.print("\n");
}
}
}

