import java.util.LinkedList;
import java.util.Collections;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> colors = new LinkedList<String>();

        // Adding elements to the LinkedList using the add method
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Displaying the LinkedList using the get method
        System.out.println("Original LinkedList: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Removing an element from the LinkedList using the remove method
        colors.remove("Yellow");

        // Displaying the LinkedList after removal
        System.out.println("LinkedList after removal: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Updating an element in the LinkedList using the set method
        colors.set(1, "Orange");

        // Displaying the LinkedList after update
        System.out.println("LinkedList after update: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Sorting the LinkedList using the sort method
        Collections.sort(colors);
        System.out.println("Sorted LinkedList: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Clearing the LinkedList using the clear method
        colors.clear();
        System.out.println("LinkedList after clear: " + colors);
    }
}
