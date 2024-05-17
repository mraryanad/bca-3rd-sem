import java.awt.*;
import javax.swing.*;

public class Calculator {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        JPanel  panel = new JPanel();
        frame.setSize(400,500);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //Adding Input Fields
        JTextField textField = new JTextField(20);
        panel.add(textField, BorderLayout.CENTER);

        //Adding Buttons
        JButton btn1 = new JButton("1");
        panel.add(btn1);
        JButton btn2 = new JButton("2");
        panel.add(btn2);
        JButton btn3 = new JButton("3");
        panel.add(btn3);
        JButton bt4 = new JButton("4");
        panel.add(bt4);
        JButton btn6 = new JButton("6");
        panel.add(btn6);
        JButton btn7 = new JButton("7");
        panel.add(btn7);
        JButton btn8 = new JButton("8");
        panel.add(btn8);
        JButton btn9 = new JButton("9");
        panel.add(btn9);
        JButton btn10 = new JButton("10");
        panel.add(btn10);
        JButton btnAdd = new JButton("+");
        panel.add(btnAdd);
        JButton btnMin = new JButton("-");
        panel.add(btnMin);
        JButton btnMul = new JButton("*");
        panel.add(btnMul);
        JButton btnDiv = new JButton("/");
        panel.add(btnDiv);
    }
}
