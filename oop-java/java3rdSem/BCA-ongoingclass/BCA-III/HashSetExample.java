import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> colors = new HashSet<String>();

        // Adding elements to the HashSet using the add method
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Displaying the HashSet using an iterator
        System.out.println("Original HashSet: ");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element from the HashSet using the remove method
        colors.remove("Yellow");

        // Displaying the HashSet after removal
        System.out.println("HashSet after removal: ");
        iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking if an element is present in the HashSet using the contains method
        boolean contains = colors.contains("Green");
        System.out.println("HashSet contains Green: " + contains);

        // Clearing the HashSet using the clear method
        colors.clear();
        System.out.println("HashSet after clear: " + colors);

        // Finding the size of the HashSet
        int size = colors.size();
        System.out.println("Size of the HashSet: " + size);
    }
}
