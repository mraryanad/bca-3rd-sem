import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> colors = new TreeSet<String>();

        // Adding elements to the TreeSet using the add method
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Displaying the TreeSet using an iterator
        System.out.println("Original TreeSet: ");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element from the TreeSet using the remove method
        colors.remove("Yellow");

        // Displaying the TreeSet after removal
        System.out.println("TreeSet after removal: ");
        iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking if an element is present in the TreeSet using the contains method
        boolean contains = colors.contains("Green");
        System.out.println("TreeSet contains Green: " + contains);

        // Clearing the TreeSet using the clear method
        colors.clear();
        System.out.println("TreeSet after clear: " + colors);

        // Finding the size of the TreeSet
        int size = colors.size();
        System.out.println("Size of the TreeSet: " + size);
    }
}
