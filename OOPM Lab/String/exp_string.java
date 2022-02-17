import java.io.*; 
import java.lang.*; 
  
class exp_string
{ 
    public static void main(String[] args) 
    { 
     // Declare String without using new operator 
     String s = "Engineering"; 
       
     // Declare String using new operator 
     String s1 = new String("ABC"); 
     String g="";
     String i="computer";
     String j="CoMpuTer";
        
     System.out.println("Length is  = " + s.length()); 
     System.out.println("After Concatenation = " + g.concat("def")); 
     System.out.println("Empty or not  = " + g.isEmpty()); 
     System.out.println("After trim  = " + s.trim()); 
     System.out.println("After lowercase  = " + g.toLowerCase()); 
     System.out.println("After Uppercase  = " + i.toUpperCase()); 
     System.out.println(s.contains("for")); 
     System.out.println(i.equals(j)); 
     System.out.println(i.equalsIgnoreCase(j)); 
     System.out.println(s.endsWith("s") ); 
     System.out.println("Substring is  = " +s.substring(4,8)); 
     System.out.println("Index of e is  = " +s.indexOf('e') ); 
System.out.println("Character at specified index= "+s.charAt(0));
System.out.println("String after replacing character= "+s.replace('e','a')); 
System.out.println("String after replacing substring= " +s.replace	("Engin","mountain")); 
   
    } 
} 
