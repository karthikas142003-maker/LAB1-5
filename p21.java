package string2;
import java.util.*;

public class p21 {

    // User-defined function to truncate string
    public static String truncate(String str, int maxLength) {

        // If string is null or shorter than max length
        if (str == null || str.length() <= maxLength) {
            return str;
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int length = sc.nextInt();

        // Function call
        String result = truncate(input, length);

        // Output
        System.out.println("Truncated String: " + result);

        sc.close();
    }
}