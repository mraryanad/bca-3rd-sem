import java.awt.*;
import javax.swing.*;

class ComboBoxEg extends JFrame {
    String data[] = {"Hemanta", "Nimesh", "Kedar", "Sailesh"};
    public ComboBoxEg () {
        JComboBox cBox = new JComboBox(data);
        add(cBox);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new ComboBoxEg();
    }
}
