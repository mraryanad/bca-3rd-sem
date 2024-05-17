public  class StringBufferExample {
  public static void main(String[] args) {
    // create a new StringBuffer object
    StringBuffer sb = new StringBuffer();
    
    // use the length() method to get the length of the StringBuffer
    int length = sb.length();
    System.out.println("Length of StringBuffer: " + length);
    
    // use the capacity() method to get the capacity of the StringBuffer
    int capacity = sb.capacity();
    System.out.println("Capacity of StringBuffer: " + capacity);
    
    // use the append() method to add a string to the StringBuffer
    sb.append("Hello");
    System.out.println("After appending: " + sb);
    
    // use the insert() method to insert a string at a specific index
    sb.insert(5, " World");
    System.out.println("After inserting: " + sb);
    
    // use the reverse() method to reverse the characters in the StringBuffer
    sb.reverse();
    System.out.println("After reversing: " + sb);
    
    // use the delete() method to delete a substring from the StringBuffer
    sb.delete(5, 11);
    System.out.println("After deleting: " + sb);
    
    // use the deleteCharAt() method to delete a character at a specific index
    sb.deleteCharAt(0);
    System.out.println("After deleting character at index 0: " + sb);
    
    // use the replace() method to replace a substring with another string
    sb.replace(0, 5, "Goodbye");
    System.out.println("After replacing: " + sb);
  }
}

/* Length of StringBuffer: 0
Capacity of StringBuffer: 16
After appending: Hello      
After inserting: Hello World
After reversing: dlroW olleH
After deleting: dlroW
After deleting character at index 0: lroW
After replacing: Goodbye */