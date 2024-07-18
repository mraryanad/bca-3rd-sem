package string;

public class StringManipulation {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        String str3 = "  Trim me  ";
        String str4 = "hello, world!";

        // Length of the string
        System.out.println("Length of str1: " + str1.length());
        // Character at a specific index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // Substring from a string
        System.out.println("Substring of str1 from index 7: " + str1.substring(7));
        System.out.println("Substring of str2 from index 0 to 4: " + str2.substring(0, 4));

        // Concatenation of strings
        System.out.println("Concatenation of str1 and str2: " + str1.concat(" ").concat(str2));

        // Checking if strings are equal
        System.out.println("str1 equals str4: " + str1.equals(str4));
        System.out.println("str1 equalsIgnoreCase str4: " + str1.equalsIgnoreCase(str4));

        // Checking if a string contains a sequence
        System.out.println("str2 contains 'Java': " + str2.contains("Java"));

        // Converting string to upper and lower case
        System.out.println("str2 in uppercase: " + str2.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        // Replacing characters in a string
        System.out.println("str1 with 'World' replaced by 'Java': " + str1.replace("World", "Java"));

        // Trimming whitespace from a string
        System.out.println("str3 before trim: '" + str3 + "'");
        System.out.println("str3 after trim: '" + str3.trim() + "'");

        // Splitting a string
        String[] words = str2.split(" ");
        System.out.println("Words in str2:");
        for (String word : words) {
            System.out.println(word);
        }

        // Converting other data types to string
        int num = 100;
        double decimal = 99.99;
        System.out.println("String representation of int: " + String.valueOf(num));
        System.out.println("String representation of double: " + String.valueOf(decimal));

        // Checking if string is empty
        String emptyString = "";
        System.out.println("Is emptyString empty? " + emptyString.isEmpty());

        // Checking if a string starts with or ends with a specific substring
        System.out.println("Does str1 start with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("Does str2 end with 'Programming'? " + str2.endsWith("Programming"));
    }
}
