import java.awt.*;

public class FrameOne {
    public FrameOne() {
        Frame f = new Frame();
        f.setTitle("Hello");
        f.setBounds(200, 200, 500, 500);
        Button btn = new Button("Test Btn");
        btn.setBounds(1000, 500, 100, 50);
        f.add(btn); // adding a new Button.
        f.setSize(300, 250); // setting size.
        // f.setTitle("JavaTPoint"); //setting title.
        f.setLayout(null); // set default layout for frame.
        f.setVisible(true); // set frame visibility true.
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        FrameOne awt = new FrameOne(); // creating a frame.
    }
}