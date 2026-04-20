package string2;
import java.util.*;

public class p20 {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+"); // split by spaces
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + remaining letters
                result += Character.toUpperCase(word.charAt(0)) 
                          + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim(); // remove extra space at end
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        String output = capitalizeWords(input);

        // Output
        System.out.println("Capitalized String: " + output);

        sc.close();
    }
}