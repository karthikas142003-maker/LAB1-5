package string2;
import java.util.*;

public class p19 {

    // User-defined function to remove whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", ""); // removes all whitespace characters
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        String result = removeWhitespace(input);

        // Output
        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }
}