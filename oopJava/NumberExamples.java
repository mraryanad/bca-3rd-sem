package oopJava;

public class NumberExamples {
    public static void main(String[] args) {
        // valueOf Method
        String numberString = "123";
        Integer intNumber = Integer.valueOf(numberString);
        System.out.println("Integer Number: " + intNumber);

        // compareTo Method
        Double num1 = 150.0;
        Double num2 = 200.0;
        int result = num1.compareTo(num2);
        if (result == 0) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else if (result < 0) {
            System.out.println(num1 + " is less than " + num2 + ".");
        } else {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }

        // equals Method
        Double num3 = 300.0;
        Double num4 = 300.0;
        boolean isEqual = num3.equals(num4);
        System.out.println("Are " + num3 + " and " + num4 + " equal?\n" + isEqual);

        // parseInt Method
        String intString = "456";
        int parsedInt = Integer.parseInt(intString);
        System.out.println("Parsed Int: " + parsedInt);

        // toString Method
        Double num5 = 123.45;
        String stringValue = num5.toString();
        System.out.println("String Value of " + num5 + " is: " + stringValue);

        // valueOf Method
        Double num6 = Double.valueOf(789);
        System.out.println("Double Number: " + num6);
    }
}
