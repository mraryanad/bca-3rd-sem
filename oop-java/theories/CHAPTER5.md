# Chapter 5

`TYPES OF ERRORS`

- <b>Runtime Error</b>: Error caused by faulty system
- <b>Syntax Error</b>: Grammatical Error in Programming
- <b>Compile Time Error</b>: Error in the code that troubles compilation

<br/>
<hr/>

## 1) Handling Errors/Exception

- <b>try</b>: Executable code is written in this block.
- <b>catch</b>: Error handling is done in this block
- <b>throw</b>: Provides message to the catch block
- <b>throws</b>: Handles future errors
- <b>finally</b>: This block of code runs no matter the 'try-catch'.

## 2) Examples of error/exception handling

```import java.io.*;

public class TryCatchExample {

  public static void main(String[] args) {

    try {
      int a[] = new int[2];
      System.out.println("Access Element Three: " + a[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception Thrown: " + e);
    }

    System.out.println("Out of the block.");
  }
}

```

`Output:`<br/>
<b>Exception Thrown:</b> java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2.<br/>
Out of the block.

## 3) Multiple catch block

`Syntax:`

```
  try {
    // Protected Code

  } catch (Exception e) {
    // TODO: handle exception

  } catch (ExceptionType1 e1) {
    // TODO: handle exception
  }
```

## 4) Nested Try Block

`Syntax:`

```
try{
  // Statement 1;
  // Statement 2;

  try{
    // Statement 3;
    // Statement 4;

    }
  }
```

## 5) Finally

`Syntax:`

```
try {
    // Protected Code

  } catch (Exception e) {
    // TODO: handle exception

  } finally {
    // Executes every time the try-catch is triggered

  }

```

## 6) Throw & Throws

`Example:`

```
public class TryCatchExampleOne {

  public static void main(String[] args) throws Exception {
    int x = -5;
    int y = -10;

    try {
      if (x < 0 || y < 0) {
        throw new Exception("x and y must be positive");

      }
      int sum = x + y;
      System.out.println("The sum of x and y is: " + sum);

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());

    } finally {
      System.out.println("Existing Program");

    }
  }
}

```
