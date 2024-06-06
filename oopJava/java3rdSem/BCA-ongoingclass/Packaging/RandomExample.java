import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10000); // generates a random number between 0 and 99
        System.out.println("Random number: " + randomNumber);
    }
}
