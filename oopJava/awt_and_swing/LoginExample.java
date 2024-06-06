import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginExample extends JFrame implements ActionListener {
    private static JLabel emailLabel, passwordLabel, outputLabel;
    private static JTextField emailTextField;
    private static JPasswordField passwordField;
    private static JButton loginButton;
    final private static String dbEmail = "test@example.com";
    final private static String dbPassword = "password";
    private static int attemptCount = 0;

    LoginExample() {
        setTitle("Login Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        emailLabel = new JLabel("Please enter your email: ");
        emailTextField = new JTextField(20);

        passwordLabel = new JLabel("Please enter your password: ");
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        outputLabel = new JLabel("");

        add(emailLabel);
        add(emailTextField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(outputLabel);

        setSize(600, 200);
        setLayout(new GridLayout(6, 1));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            if (attemptCount >= 3) {
                outputLabel.setText("Your service has been blocked due to multiple failed login attempts.");
                return;
            }

            String userEmail = emailTextField.getText();
            String userPassword = new String(passwordField.getPassword());

            if (userEmail.equals(dbEmail) && userPassword.equals(dbPassword)) {
                outputLabel.setForeground(Color.GREEN);
                outputLabel.setText("Logged In Successfully");
                attemptCount = 0; // Reset the count on successful login
            } else {
                attemptCount++;
                outputLabel.setForeground(Color.RED);
                outputLabel
                        .setText("Please enter the correct username and password. Attempt " + attemptCount + " of 3.");
                if (attemptCount >= 3) {
                    outputLabel.setForeground(Color.RED);
                    outputLabel.setText("Your service has been blocked due to multiple failed login attempts.");
                }
            }
        }
    }

    public static void main(String[] args) {
        new LoginExample();
    }
}
