//to overcome the drawback of the string immutability

class sbuf
{
public static void main(String [] args)
{
//how to create a string  using string buffer class 
StringBuffer sb=new StringBuffer("computer");

//Displaying the string
System.out.println("The string is "+sb);

//methods that can be used with string
System.out.println(sb.length());
System.out.println(sb.capacity());
System.out.println(sb.append(" engineering"));
System.out.println(sb.insert(4,"engg"));
System.out.println(sb.reverse());
}
}
