package arraylist;
import java.util.*;

public class p6 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Define nth position (example: n = 3 → 3rd element)
        int n = 3;

        // Removing nth element (index = n-1)
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1);
            System.out.println("After removing " + n + "th element: " + colors);
        } else {
            System.out.println("Invalid position!");
        }
    }
}
