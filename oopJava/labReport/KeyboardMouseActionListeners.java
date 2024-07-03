package labReport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardMouseActionListeners extends JFrame implements KeyListener, MouseListener, ActionListener {
    private JLabel keyLabel;
    private JLabel mouseLabel;
    private JLabel actionLabel;
    private JButton actionButton;

    public KeyboardMouseActionListeners() {
        setTitle("Event Listeners Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        keyLabel = new JLabel("Press any key...");
        mouseLabel = new JLabel("Click anywhere...");
        actionLabel = new JLabel("Press the button...");
        actionButton = new JButton("Click Me");

        add(keyLabel);
        add(mouseLabel);
        add(actionLabel);
        add(actionButton);

        // Add listeners
        addKeyListener(this);
        addMouseListener(this);
        actionButton.addActionListener(this);

        // Make sure the JFrame can focus to capture key events
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        setVisible(true);
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyLabel.setText("Key Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        mouseLabel.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    // ActionListener method
    @Override
    public void actionPerformed(ActionEvent e) {
        actionLabel.setText("Button Pressed!");
    }

    public static void main(String[] args) {
        new KeyboardMouseActionListeners();
    }
}
