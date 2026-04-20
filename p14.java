package string2;

import java.util.*;

public class p14 {
    public static void main(String[] args) {

        String str = "Hello Java";

        // Length & Character Access
        System.out.println("Length: " + str.length());
        System.out.println("Char at 1: " + str.charAt(1));

        // Comparison
        System.out.println("Equals: " + str.equals("Hello Java"));

        // Searching
        System.out.println("Contains 'Java'? " + str.contains("Java"));

        // Substring
        System.out.println("Substring: " + str.substring(0, 5));

        // Replace
        System.out.println("Replace: " + str.replace("Java", "World"));

        // Trim
        String s = "  Hi  ";
        System.out.println("Trim: '" + s.trim() + "'");

        // Concatenation
        System.out.println("Concat: " + str + " Programming");

        // Split
        String colors = "Red,Blue,Green";
        for (String c : colors.split(",")) {
            System.out.println(c);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Lab");
        System.out.println("StringBuilder: " + sb);

        // Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Student", 90);
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