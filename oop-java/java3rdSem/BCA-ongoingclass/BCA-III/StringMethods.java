public class StringMethods {
    public static void main(String[] args) {
        // Create a new string object
        String str = "Hello World!";

        // Use the length() method to get the length of the string
        int length = str.length();
        System.out.println("The length of the string is: " + length);

        // Use the compareTo() method to compare the string to another string
        int result = str.compareTo("Hello World!");
        System.out.println("The result of the comparison is: " + result);

        // Use the equals() method to compare the string to another string
        boolean equals = str.equals("Hello World!");
        System.out.println("Are the strings equal? " + equals);

        // Use the equalsIgnoreCase() method to compare the string to another string, ignoring case
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello world!");
        System.out.println("Are the strings equal, ignoring case? " + equalsIgnoreCase);

        // Use the concat() method to concatenate two strings
        String newStr = str.concat(" How are you?");
        System.out.println("The concatenated string is: " + newStr);

        // Use the isEmpty() method to check if the string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // Use the trim() method to remove leading and trailing whitespace
        String trimmedStr = str.trim();
        System.out.println("The trimmed string is: " + trimmedStr);

        // Use the toLowerCase() method to convert the string to lowercase
        String lowercaseStr = str.toLowerCase();
        System.out.println("The lowercase string is: " + lowercaseStr);

        // Use the toUpperCase() method to convert the string to uppercase
        String uppercaseStr = str.toUpperCase();
        System.out.println("The uppercase string is: " + uppercaseStr);
    }
}


/* Output
The length of the string is: 12
The result of the comparison is: 0
Are the strings equal? true
Are the strings equal, ignoring case? true
The concatenated string is: Hello World! How are you?
Is the string empty? false
The trimmed string is: Hello World!
The lowercase string is: hello world!
The uppercase string is: HELLO WORLD! */