package gui;

import app.*;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class FrontEnd extends JFrame {
    private BackEndInterface app;
    private JPanel header;
    private JPanel body;
    private JPanel footer;
    private final JPanel home;

    public FrontEnd(BackEndInterface app) throws IOException {
        this.app = app;
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);
        this.app = app;
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setFocusable(false);
        setLocationRelativeTo(null);
        setResizable(false);

        // home
        home = (new HomePage(this)).load;

        // Header
        header = new JPanel(new FlowLayout());
        BufferedImage myPicture = ImageIO.read(new File("OLADOC1.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        header.add(picLabel);

        // Body
        body = home;

        // Footer
        footer = new JPanel(new GridLayout(1, 2));
        JButton backButton = new JButton("Back");
        JButton homeButton = new JButton("Home");
        footer.add(backButton);
        footer.add(homeButton);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                loadHomePage();
            }
        });

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Stack Implementation
            }
        });

        // adding components
        add(header, BorderLayout.NORTH);
        add(body, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);
        setVisible(true);
    }

    protected void loadLoginPage() {
        remove(body);
        body = new Login().load;
        add(body, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    protected void loadHomePage() {
        remove(body);
        body = new HomePage(this).load;
        add(body, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    protected void loadRegistrationPage() {
        remove(body);
        body = new Registration(this, app).load;
        add(body, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public static void main(String[] args) throws IOException {
        new FrontEnd(new BackEndInterface(new Database(new Admin("admin", "admin")), "db"));
    }
}
