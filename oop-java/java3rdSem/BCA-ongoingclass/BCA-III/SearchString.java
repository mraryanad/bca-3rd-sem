public class SearchString {
  public static void main(String[] args) {
    // Create a string
    String s = "Hello, world!";

    // Search for the substring "world"
    int index = s.indexOf("world");
    if (index >= 0) {
      System.out.println("Found the substring at index: " + index);
    } else {
      System.out.println("Did not find the substring in the string.");
    }

    // Search for the substring "foo"
    index = s.indexOf("foo");
    if (index >= 0) {
      System.out.println("Found the substring at index: " + index);
    } else {
      System.out.println("Did not find the substring in the string.");
    }

    // Search for the substring "world" starting at index 6
    index = s.indexOf("world", 6);
    if (index >= 0) {
      System.out.println("Found the substring at index: " + index);
    } else {
      System.out.println("Did not find the substring in the string.");
    }
  }
}
