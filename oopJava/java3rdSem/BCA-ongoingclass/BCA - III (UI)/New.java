import java.awt.*;
import javax.swing.*;

public class New {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calc");

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Calc program");

        JButton btn1 = new JButton("1");
        // btn1.setText("1");

        JButton btn2 = new JButton("2");
        // btn2.setText("2");

        JTextField textField = new JTextField(20);
        panel.add(label);
        panel.add(textField);
        panel.add(btn1);
        panel.add(btn2);
        frame.add(panel);
        frame.setVisible(true);
    }
}
