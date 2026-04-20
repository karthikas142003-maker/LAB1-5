package arraylist;
import java.util.*;

public class p8 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        // Display original list
        System.out.println("Original LinkedList: " + list);

        // Using descendingIterator for reverse traversal
        Iterator<String> iterator = list.descendingIterator();

        System.out.println("LinkedList in reverse order:");

        // Iterating in reverse
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}