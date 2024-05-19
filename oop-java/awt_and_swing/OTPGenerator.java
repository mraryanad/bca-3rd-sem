import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import javax.swing.*;

public class OTPGenerator extends JFrame implements ActionListener {

    private JButton generateButton;
    private JLabel outputLabel;

    OTPGenerator() {
        setTitle("OTP Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        generateButton = new JButton("Generate OTP");
        outputLabel = new JLabel("");

        generateButton.addActionListener(this);

        add(generateButton);
        add(outputLabel);

        setLayout(new GridLayout(2, 1));
        setLocationRelativeTo(null);
        // setSize(400, 200);
        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            String otp = generateOTP(4); // Generate a 4-digit OTP
            outputLabel.setText("OTP: " + otp);
        }
    }

    private String generateOTP(int length) {
        String digits = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            otp.append(digits.charAt(random.nextInt(digits.length())));
        }

        return otp.toString();
    }

    public static void main(String[] args) {
        new OTPGenerator();
    }
}
