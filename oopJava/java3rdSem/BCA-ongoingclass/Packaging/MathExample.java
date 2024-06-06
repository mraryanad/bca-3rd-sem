public class MathExample {
    public static void main(String[] args) {
        // absolute value
        int num1 = -5;
        int absValue = Math.abs(num1);
        System.out.println("Absolute value of " + num1 + " is: " + absValue);
        
        // maximum and minimum
        int num2 = 10;
        int num3 = 20;
        int maxValue = Math.max(num2, num3);
        int minValue = Math.min(num2, num3);
        System.out.println("Maximum of " + num2 + " and " + num3 + " is: " + maxValue);
        System.out.println("Minimum of " + num2 + " and " + num3 + " is: " + minValue);
        
        // power and square root
        double num4 = 2.5;
        double power = Math.pow(num4, 3);
        double sqrt = Math.sqrt(power);
        System.out.println(num4 + " raised to the power of 3 is: " + power);
        System.out.println("Square root of " + power + " is: " + sqrt);
        
        // rounding
        double num5 = 3.7;
        long rounded = Math.round(num5);
        System.out.println("Rounded value of " + num5 + " is: " + rounded);

        // random number
        double randomNum = Math.random();
        System.out.println("Random number: " + randomNum);
    }
}
