import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SearchInList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Blueberry");
        fruits.add("Grape");
        
        String searchItem = "Cherry";
        
        // Using the indexOf() method
        int index = fruits.indexOf(searchItem);
        if (index != -1) {
            System.out.println(searchItem + " found at index: " + index);
        } else {
            System.out.println(searchItem + " not found in the list");
        }
        
        // Using the contains() method
        if (fruits.contains(searchItem)) {
            System.out.println(searchItem + " found in the list");
        } else {
            System.out.println(searchItem + " not found in the list");
        }
        
        // Iterating through the List using a for-each loop
        System.out.println("Fruits in the list: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Iterating through the List using ListIterator
        System.out.println("Fruits in the list (using ListIterator): ");
        ListIterator<String> iterator = fruits.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
