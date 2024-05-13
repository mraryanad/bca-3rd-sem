# Chapter - 6 (String)

`How to create a String?`

## 1) String Literal

- By directly assigning a value to the variable
  <br/>
  <b>Example:</b>
  ```
  String s = "Hello World!";
  ```

## 2) New Keyword

- By creating instance<br/>
  <b>Example:</b>

  ```
  String s = new String("Hello World!"); // value passed into the constructor
  ```

## 3) Methods/Functions used in String

```
length(); // length of the string
compareTo(); // compare and return either True or False
equals(); // checks if the strings are equal
equalsIgnoreCase(); // removes case sensitivity
concat(); // join strings together
isEmpty(); // checks if the string is empty
Trim(); // trims the string
toLowerCase(); // changes to lowercase
toUpperCase(); // changes to uppercase
```

## 4) String Methods Examples

```
public class StringExamples {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";
    String s3 = "Hi";
    String s4 = "BCA!";
    String s5 = "HELLO";
    String s6 = "World";
    String s7 = "";
    String s8 = "Hello! ";
    String s9 = "LOWERCASE";
    String s10 = "uppercase";

    // LENGTH OF STRINGS
    System.out.println(
      "Length of s1 & s2: " + s1.length() + " & " + s2.length() + "\n"
    ); // 5 & 5

    // EQUALS TO
    System.out.println(s3.equals(s4)); // false
    System.out.println(s1.equals(s5)); // false
    System.out.println(s1.equalsIgnoreCase(s5) + "\n"); // true

    // COMPARE STRINGS
    System.out.println(s1.compareTo(s2)); // negative
    System.out.println(s1.compareTo(s5)); // positive
    System.out.println(s2.compareTo(s6)); // 0
    System.out.println(s1.compareToIgnoreCase(s5) + "\n"); // 0

    // CONCATENATION
    System.out.println(s1.concat(s2) + "\n"); // Hello World

    // IS EMPTY
    System.out.println(s1.isEmpty()); // false
    System.out.println(s7.isEmpty() + "\n"); // true

    // TRIM - removes whitespaces
    System.out.println(s8 + "Good Morning!"); // w/o trim
    System.out.println(s8.trim() + "Good Morning!" + "\n"); // with trim

    // LOWERCASE & UPPERCASE
    System.out.println(s10.toLowerCase()); // converts to lowercase
    System.out.println(s9.toUpperCase() + "\n"); // converts to uppercase
  }
}

```

## 5) Character Extraction

Process of extracting any character/symbol from a string

- charAt(); // returns specified character's index in the string
- getChars(); // gets more than one character from the string
- getBytes(); // extracts characters form the string and converts them to the byte array
- toCharArray(); // converts all characters in a string into an array of characters
