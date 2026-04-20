package arraylist;
import java.util.*;

public class p7 {
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

        // Creating iterator starting from 2nd position (index 1)
        ListIterator<String> iteratorObj = list.listIterator(1);

        System.out.println("Iterating from 2nd position:");

        // Iterating using iterator
        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
    }
}