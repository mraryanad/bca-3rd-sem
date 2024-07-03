package labReport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMGUI extends JFrame implements ActionListener {

    // Default Access Modifier so that VAR can be accessed within the file
    static int savedPin = 2424;
    static int balance = 20300;
    static int incorrectAttempts = 0;
    static String bankName = "Kumari";

    // GUI Components
    private CardLayout cardLayout;
    private JPanel mainPanel, pinPanel, actionPanel, withdrawPanel;
    private JTextField pinField, bankField, withdrawField;
    private JLabel messageLabel, balanceLabel;

    public ATMGUI() {
        // Frame settings
        setTitle("Kumari ATM Service");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // CardLayout for switching between panels
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Panels
        createPinPanel();
        createActionPanel();
        createWithdrawPanel();

        // Add panels to main panel
        mainPanel.add(pinPanel, "PIN");
        mainPanel.add(actionPanel, "ACTION");
        mainPanel.add(withdrawPanel, "WITHDRAW");

        add(mainPanel);

        setVisible(true);
    }

    private void createPinPanel() {
        pinPanel = new JPanel(new BorderLayout());
        JLabel pinLabel = new JLabel("Enter PIN:");
        pinField = new JTextField(10);
        JButton pinButton = new JButton("Submit");
        pinButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.add(pinLabel);
        inputPanel.add(pinField);
        inputPanel.add(pinButton);

        messageLabel = new JLabel("Please enter your PIN code to get started", SwingConstants.CENTER);

        pinPanel.add(messageLabel, BorderLayout.NORTH);
        pinPanel.add(inputPanel, BorderLayout.CENTER);
    }

    private void createActionPanel() {
        actionPanel = new JPanel(new BorderLayout());
        JLabel bankLabel = new JLabel("Enter Your Bank Name:");
        bankField = new JTextField(10);
        JButton proceedButton = new JButton("Proceed");
        proceedButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.add(bankLabel);
        inputPanel.add(bankField);
        inputPanel.add(proceedButton);

        balanceLabel = new JLabel("Balance: Rs " + balance, SwingConstants.CENTER);

        actionPanel.add(balanceLabel, BorderLayout.NORTH);
        actionPanel.add(inputPanel, BorderLayout.CENTER);
    }

    private void createWithdrawPanel() {
        withdrawPanel = new JPanel(new BorderLayout());
        JLabel withdrawLabel = new JLabel("Enter Amount to Withdraw (multiples of 500):");
        withdrawField = new JTextField(10);
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.add(withdrawLabel);
        inputPanel.add(withdrawField);
        inputPanel.add(withdrawButton);

        withdrawPanel.add(inputPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Submit")) {
            int userPin = Integer.parseInt(pinField.getText());

            if (userPin == savedPin) {
                messageLabel.setText("Successfully Logged In");
                cardLayout.show(mainPanel, "ACTION");
            } else {
                incorrectAttempts++;
                if (incorrectAttempts >= 3) {
                    messageLabel.setText("Service Blocked. Contact Bank.");
                    pinField.setEnabled(false);
                } else {
                    messageLabel.setText("Incorrect PIN. " + (3 - incorrectAttempts) + " attempts remaining.");
                }
            }
        } else if (command.equals("Proceed")) {
            String userBankName = bankField.getText();

            if (!userBankName.equalsIgnoreCase(bankName)) {
                balance -= 10;
                balanceLabel.setText("Balance: Rs " + balance + " (Rs 10 deducted for different bank)");
            } else {
                balanceLabel.setText("Balance: Rs " + balance);
            }

            cardLayout.show(mainPanel, "WITHDRAW");
        } else if (command.equals("Withdraw")) {
            int withdrawalAmount = Integer.parseInt(withdrawField.getText());

            if (withdrawalAmount % 500 == 0 && withdrawalAmount <= balance) {
                balance -= withdrawalAmount;
                balanceLabel.setText("Balance: Rs " + balance);
                JOptionPane.showMessageDialog(this, "Rs " + withdrawalAmount + " withdrawn successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid withdrawal amount or insufficient balance.");
            }

            cardLayout.show(mainPanel, "ACTION");
        }
    }

    public static void main(String[] args) {
        new ATMGUI();
    }
}
