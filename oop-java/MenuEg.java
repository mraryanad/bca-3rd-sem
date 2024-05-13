import javax.swing.*;
import java.awt.*;

class MenuEg {
    public static void main(String[] args) {
        // You can pass title to the constructor
        JFrame frame = new JFrame("Menu Example");
        
        // frame.setTitle("Menu Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Edit");
        JMenu menu2 = new JMenu("Save");
        JMenu m = new JMenu("Help");

        JMenuItem item1 = new JMenuItem("Text Help");
        JMenuItem item2 = new JMenuItem("Audio Help");
        m.add(item1);
        m.add(item2);

        JMenuItem item3 = new JMenuItem("Visual Help");
        JMenuItem item4= new JMenuItem("Print Help");
        m.add(item3);
        m.add(item4);

        JMenuItem menuItem1 = new JMenuItem("Open");
        menu.add(menuItem1);
        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(m);

        frame.add(BorderLayout.CENTER, menuBar);
        frame.setVisible(true);

    }
}