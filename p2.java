package arraylist;
import java.util.*;

public class p2 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Displaying the list
        System.out.println("Colors in the list: " + colors);

        // Searching for "Red"
        if (colors.contains("Red")) {
            System.out.println("Color 'Red' is available in the list.");
        } else {
            System.out.println("Color 'Red' is NOT available in the list.");
        }
    }
}