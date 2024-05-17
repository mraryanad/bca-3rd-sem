public class NumberExamples {
    public static void main(String[] args) {
        // valueOf method
        String numberString = "123";
        Integer intNumber = Integer.valueOf(numberString);
        System.out.println("Integer Number: " + intNumber);

        // compareTo method
        Double num1 = 150.0;
        Double num2 = 200.0;
        int result = num1.compareTo(num2);
        if (result == 0) {
            System.out.println(num1 + " and " + num2 + " are equal");
        } else if (result < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is greater than " + num2);
        }

        // equals method
        Double num3 = 300.0;
        Double num4 = 300.0;
        boolean isEqual = num3.equals(num4);
        System.out.println("Are " + num3 + " and " + num4 + " equal: " + isEqual);

        // parseInt method
        String intString = "456";
        int parsedInt = Integer.parseInt(intString);
        System.out.println("Parsed int: " + parsedInt);

        // toString method
        Double num5 = 123.45;
        String stringValue = num5.toString();
        System.out.println("String value of " + num5 + " is: " + stringValue);

        // valueOf method
        Double num6 = Double.valueOf(789);
        System.out.println("Double Number: " + num6);
    }
}
