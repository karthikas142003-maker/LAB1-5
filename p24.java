package string2;
import java.util.*;

public class p24 {

    // User-defined function to count words
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split string by one or more spaces
        String[] words = str.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        int wordCount = countWords(input);

        // Output
        System.out.println("Number of words: " + wordCount);

        sc.close();
    }
}
