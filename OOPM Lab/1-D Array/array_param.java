//program to demonstrate how we can pass an entire array as a parameter to a method

import java.util.Scanner;

class array_param
{
public static void main(String [] args)
{
array_param a=new array_param();

Scanner sc=new Scanner(System.in);

int [] arr=new int [10];

//storing value entered by the user in an array
System.out.println("Enter the values in the array::");

for(int i=0;i<10;i++)
arr[i]=sc.nextInt();

int [] newarr2=a.arrdisplay(arr);

System.out.println("The updated array returned by the method is :");

	for(int i=0;i<10;i++)
	{
		System.out.println(newarr2[i]);
	}
}

int [] arrdisplay(int [] newarr)
{
System.out.println("The values in the array are::");

for(int i=0;i<10;i++)
{
System.out.println(newarr[i]);
}

System.out.println("Incrementing the values in the array by 2");

for(int i=0;i<10;i++)
{
newarr[i]=newarr[i]+2;
}

return newarr;

}
}
