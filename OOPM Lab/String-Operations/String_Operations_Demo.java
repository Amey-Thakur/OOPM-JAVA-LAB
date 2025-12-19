/**
 * Program: String Operations Demo
 * Description: A Java program to demonstrate various methods of the String class.
 *              Operations include length, concatenation, trimming, comparison, substring, etc.
 * Author: Amey Thakur
 * Reference: https://github.com/Amey-Thakur/OOPM-JAVA-LAB
 */

public class String_Operations_Demo {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("       String Operations Demo");
        System.out.println("---------------------------------------------");

        // Declare String literals
        String s = "Engineering"; 
        String emptyStr = "";
        String str1 = "computer";
        String str2 = "CoMpuTer";
        
        // Declare String using new operator 
        String sObj = new String("ABC"); 

        System.out.println("Original String s: \"" + s + "\"");
        System.out.println("Original String str1: \"" + str1 + "\"");
        System.out.println("Original String str2: \"" + str2 + "\"");
        System.out.println();

        // Length of string
        System.out.println("1. Length of '" + s + "' = " + s.length()); 

        // Concatenation
        System.out.println("2. Concatenation ('" + emptyStr + "' + 'def') = \"" + emptyStr.concat("def") + "\""); 

        // Check if empty
        System.out.println("3. Is '" + emptyStr + "' empty? = " + emptyStr.isEmpty()); 

        // Trim (demonstration requires leading/trailing spaces, adding for clarity)
        String spacedStr = "  Space  ";
        System.out.println("4. Trim '" + spacedStr + "' = \"" + spacedStr.trim() + "\""); 

        // Lowercase and Uppercase
        System.out.println("5. Lowercase '" + emptyStr + "' (demo) = " + emptyStr.toLowerCase()); 
        System.out.println("6. Uppercase '" + str1 + "' = " + str1.toUpperCase()); 

        // Contains
        System.out.println("7. Does '" + s + "' contain 'for'? = " + s.contains("for")); 

        // Equals vs EqualsIgnoreCase
        System.out.println("8. Equals ('" + str1 + "' == '" + str2 + "')? = " + str1.equals(str2)); 
        System.out.println("9. EqualsIgnoreCase ('" + str1 + "' == '" + str2 + "')? = " + str1.equalsIgnoreCase(str2)); 

        // EndsWith
        System.out.println("10. Does '" + s + "' end with 's'? = " + s.endsWith("s")); 

        // Substring
        // Note: substring(begin, end) returns from begin index (inclusive) to end index (exclusive)
        // Check bounds before calling to be safe, but adhering to logic: index 4 to 8
        if (s.length() >= 8) {
             System.out.println("11. Substring of '" + s + "' (4,8) = \"" + s.substring(4, 8) + "\""); 
        }

        // IndexOf
        System.out.println("12. Index of 'e' in '" + s + "' = " + s.indexOf('e')); 

        // CharAt
        System.out.println("13. Character at index 0 in '" + s + "' = " + s.charAt(0));

        // Replace character
        System.out.println("14. Replace 'e' with 'a' in '" + s + "' = " + s.replace('e', 'a')); 

        // Replace substring
        System.out.println("15. Replace 'Engin' with 'mountain' in '" + s + "' = " + s.replace("Engin", "mountain")); 
        
        System.out.println("---------------------------------------------");
    }
}
