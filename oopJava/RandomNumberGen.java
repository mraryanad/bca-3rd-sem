package oopJava;

import java.util.Random;

public class RandomNumberGen {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000000000); // generated a random number
        System.out.println("Random NUmber: " + randomNumber);
    }
}