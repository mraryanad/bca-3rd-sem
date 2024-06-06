import java.util.Arrays;

public class CharacterExtraction {
  public static void main(String[] args) {
    // Create a string
    String s = "Hello, world!";

    // Use charAt() to extract a single character
    char c = s.charAt(0);
    System.out.println("The first character of the string is: " + c);

    // Use getChars() to extract multiple characters
    char[] chars = new char[5];
    s.getChars(0, 5, chars, 0);
    System.out.println("The first five characters of the string are: " + String.valueOf(chars));

    // Use getBytes() to convert the string to a byte array
    byte[] bytes = s.getBytes();
    System.out.println("The string as a byte array: " + Arrays.toString(bytes));

    // Use toCharArray() to convert the string to a character array
    chars = s.toCharArray();
    System.out.println("The string as a character array: " + Arrays.toString(chars));
  }
}
