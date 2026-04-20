package string2;
import java.util.*;

public class p17 {

    // User-defined function to reverse string
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        String result = reverseString(input);

        // Output
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}