// WAP to check palindrome of a given number
package oopJava.labReport;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to check if its palindrome: ");
        int n = scan.nextInt();

        int temp = n;
        int rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}