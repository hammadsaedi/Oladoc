package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage {
    public JPanel load;
    private JLabel titleLabel;
    private JButton loginButton;
    private JButton registerButton;

    public HomePage() {
        load = new JPanel();
        load.setBackground(new Color(124, 252, 0));
        load.setLayout(null);

        titleLabel = new JLabel("Welcome to our App");
        titleLabel.setBounds(200, 50, 200, 30);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        load.add(titleLabel);

        loginButton = new JButton("Login");
        loginButton.setBounds(250, 150, 100, 30);
        load.add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(250, 200, 100, 30);
        load.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // code to open the login page
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // code to open the registration page
            }
        });
    }
}
