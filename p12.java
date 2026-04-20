package sting;
import java.util.*;

public class p12 {
    public static void main(String[] args) {

        // String Creation
        String str = "Hello Java";

        // Length & Character Access
        System.out.println("Length: " + str.length());
        System.out.println("Char at 1: " + str.charAt(1));

        // Comparison
        System.out.println("Equals 'Hello Java': " + str.equals("Hello Java"));

        // Searching
        System.out.println("Contains 'Java'? " + str.contains("Java"));

        // Substring
        System.out.println("Substring: " + str.substring(0, 5));

        // Modification
        System.out.println("Replace: " + str.replace("Java", "World"));

        // Trim
        String s = "  Hi  ";
        System.out.println("Trim: '" + s.trim() + "'");

        // Concatenation
        System.out.println("Concat: " + str + " Programming");

        // Splitting
        String colors = "Red,Blue,Green";
        String[] arr = colors.split(",");
        System.out.println("Split:");
        for (String c : arr) {
            System.out.println(c);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Lab");
        System.out.println("StringBuilder: " + sb);

        // Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Aditya", 90);
        System.out.println("Formatted: " + formatted);

        // Email Validation
        String email = "user@gmail.com";
        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}