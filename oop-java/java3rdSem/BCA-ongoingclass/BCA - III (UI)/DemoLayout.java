import java.awt.*;
import javax.swing.*;

public class DemoLayout {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setTitle("Layout");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pannel1 = new JPanel();
        pannel1.setSize(50, 50);
        pannel1.setLayout(new FlowLayout());

        JPanel pannel2 = new JPanel();
        pannel2.setLayout(new BorderLayout());

        JButton btn1 = new JButton("One");
        JButton btn2 = new JButton("Two");
        JButton btn3 = new JButton("Three");
        JButton btn4 = new JButton("FOUR");

        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
         JButton btn9 = new JButton("9");
          JButton btn10 = new JButton("10");

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2, 3));

        panel3.add(btn5);
        
        panel3.add(btn6);
        panel3.add(btn7);
        panel3.add(btn8);
        panel3.add(btn10);
        panel3.add(btn9);
        


        pannel1.add(btn4);

        pannel2.add(BorderLayout.NORTH ,btn1);
        pannel2.add(BorderLayout.SOUTH, btn2);
        pannel2.add(BorderLayout.EAST, btn3);
        


        frame.add(BorderLayout.NORTH, pannel1);
        frame.add(BorderLayout.SOUTH, pannel2);
        frame.add(BorderLayout.CENTER, panel3);
        frame.setVisible(true);


        
    }
}
