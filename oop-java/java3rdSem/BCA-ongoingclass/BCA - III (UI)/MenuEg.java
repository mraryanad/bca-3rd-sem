import java.awt.*;
import javax.swing.*;

class MenuEg {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Menu Ex");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("EDIT");
        JMenu menu2 = new JMenu("Save");

        JMenu m = new JMenu("Help?");
        JMenuItem item1 = new JMenuItem("Text Help");
        JMenuItem item2 = new JMenuItem("Audio  Help");
        m.add(item1);
        m.add(item2);
        JMenuItem item3 = new JMenuItem("visual Help");
        JMenuItem item4 = new JMenuItem("print  Help");
        m.add(item3);
        m.add(item4);
        JMenuItem menuItem1 = new JMenuItem("Open");
        menu.add(menuItem1);
        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(m);
        
        frame.add(BorderLayout.CENTER , menuBar);
        frame.setVisible(true);
    }
}
