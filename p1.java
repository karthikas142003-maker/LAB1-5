package arraylist;

import java.util.*;

public class p1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List: " + list);

        // 2. Adding at specific index
        list.add(1, "Mango");
        System.out.println("After adding at index: " + list);

        // 3. Adding multiple elements
        list.addAll(Arrays.asList("Grapes", "Pineapple"));
        System.out.println("After adding multiple: " + list);

        // 4. Accessing
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating
        list.set(0, "Kiwi");
        System.out.println("After update: " + list);

        // 6. Removing
        list.remove("Banana");
        System.out.println("After remove: " + list);

        // 7. Searching
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // 8. Size
        System.out.println("Size: " + list.size());

        // 9. Iterating
        for (String item : list) {
            System.out.println(item);
        }

        // 10. Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Sorting
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // 12. Sublist
        System.out.println("Sublist: " + list.subList(1, 3));

        // 13. Clear
        list.clear();
        System.out.println("After clear: " + list);
    }
}