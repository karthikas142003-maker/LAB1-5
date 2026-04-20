package arraylist;
import java.util.*;

public class p9 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Adding initial elements
        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        // Display original list
        System.out.println("Original LinkedList: " + l_listobj);

        // Inserting "Pink" at the end using offerLast()
        l_listobj.offerLast("Pink");

        // Display updated list
        System.out.println("After adding 'Pink' at the end: " + l_listobj);
    }
}