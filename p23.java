package string2;
import java.util.*;

public class p23 {

    // User-defined function to generate random string
    public static String generateRandomString(int length) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result = "";

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result += characters.charAt(index);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter desired length: ");
        int len = sc.nextInt();

        // Function call
        String randomString = generateRandomString(len);

        // Output
        System.out.println("Generated Random String: " + randomString);

        sc.close();
    }
}