package gui;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class MessagePanel extends JPanel {
    public MessagePanel(String message) {
        JLabel label = new JLabel(message);
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        setBackground(Color.GREEN);
        Font font = new Font("Arial", Font.BOLD, 28);
        label.setFont(font);
    }
}
