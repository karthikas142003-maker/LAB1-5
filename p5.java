package arraylist;
import java.util.*;

public class p5 {
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

        // Extracting 1st and 2nd elements (index 0 to 2, end is exclusive)
        List<String> subList = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted SubList (1st & 2nd elements): " + subList);
    }
}