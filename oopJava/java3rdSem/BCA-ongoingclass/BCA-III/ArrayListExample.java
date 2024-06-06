import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> colors = new ArrayList<String>();

        // Adding elements to the ArrayList using the add method
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Displaying the ArrayList using the get method
        System.out.println("Original ArrayList: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Removing an element from the ArrayList using the remove method
        colors.remove("Yellow");

        // Displaying the ArrayList after removal
        System.out.println("ArrayList after removal: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Updating an element in the ArrayList using the set method
        colors.set(1, "Orange");

        // Displaying the ArrayList after update
        System.out.println("ArrayList after update: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Sorting the ArrayList using the sort method
        Collections.sort(colors);
        System.out.println("Sorted ArrayList: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Clearing the ArrayList using the clear method
        colors.clear();
        System.out.println("ArrayList after clear: " + colors);
    }
}
