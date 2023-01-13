package gui;

import app.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class MainUI extends JFrame {
    private BackEndInterface app;
    private JPanel header;
    private JPanel body;
    private JPanel footer;

    public MainUI() throws IOException {
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setFocusable(false);
        setLocationRelativeTo(null);
        setResizable(false);

        // Header
        header = new JPanel(new FlowLayout());
        BufferedImage myPicture = ImageIO.read(new File("OLADOC1.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        header.add(picLabel);

        // Body
        body = null;

        // Footer
        footer = new JPanel(new GridLayout(1, 2));
        JButton back = new JButton("Back");
        JButton home = new JButton("Home");
        footer.add(back);
        footer.add(home);
        home.addActionListener(null);
        back.addActionListener(null);

        // adding components
        add(header, BorderLayout.NORTH);
        // add(body, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new MainUI();
    }
}
