# Java Arrays

Used to store multiple data of same type without the need of creating multiple variables for multiple data of same type.

<b>1. Declaration:</b>

```
String[] thisArray;
String[] otherArray = {
    "hello",
    "this",
    "is",
    "an",
    "array"
    };
```

<b>2. Accessing the array:</b>

```
String[] exampleArray = {
    "hello",
    "this",
    "is",
    "an",
    "array"
}

System.out.println(exampleArray[0]);  // Prints "hello"
```

<b>3. Length of the array:</b>

```
String[] exampleArray = {
    "hello",
    "this",
    "is",
    "an",
    "array"
}

System.out.println(exampleArray.length); // Prints length of the array
```

<b>4. Loops in Array:</b>

```
// For Loop
String[] exampleArray = {
    "hello",
    "this",
    "is",
    "an",
    "array"
}

for (int i = 0; i < exampleArray.length; i++) {
    System.out.println(exampleArray[i]);
}


// For-Each Loop
String[] exampleArray = {
    "hello",
    "this",
    "is",
    "an",
    "array"
}

for (String ex : exampleArray) {
    System.out.println(ex);
}
```

## Multidimensional Arrays

- Array of Arrays.
- Useful when you want to store data in a tabular form (rows & columns).

`Example: `

```
int [][] twoDimensionalArray= {
    {
        1,
        2,
        3,
        4,
        5
    },
    {
        6,
        7,
        8,
        9.
        0
    }
}

System.out.println(twoDimensionalArray[0][2]); // Prints "3"
System.out.println(twoDimensionalArray[1][4]); // Prints "0"
```

## Wrapper Classes

Wrapper classes provide a way to use primitive data types (int, boolean, etc) as objects.

<table border>
    <thead>
        <td>Primitive Data Type</td>
        <td>Wrapper Class</td>
    </thead>
    <tbody>
        <tr>
            <td>int</td>
            <td>Integer</td>
        </tr>
        <tr>
            <td>double</td>
            <td>Double</td>
        </tr>
        <tr>
            <td>char</td>
            <td>Character</td>
        </tr>
    </tbody>
</table>

`Example: `

```
public class WrapperExample {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    }
}
```
