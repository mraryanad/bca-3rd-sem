import java.security.SecureRandom;
import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        Random random = new SecureRandom();
        int otp = 0;

        // Generate a 4-digit OTP
        for (int i = 0; i < 4; i++) {
            otp = otp * 10 + random.nextInt(10);
        }

        System.out.println("Your OTP is: " + otp);
    }
}