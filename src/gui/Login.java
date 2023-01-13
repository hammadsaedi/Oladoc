package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    public JPanel load;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField, passwordField;
    private JButton loginButton;
    private JRadioButton doctor, patient, admin;
    private ButtonGroup loginGroup;

    public Login() {
        load = new JPanel(new BorderLayout());

        JPanel login = new JPanel(new GridLayout(3, 2));

        load.add(login, BorderLayout.CENTER);

        usernameLabel = new JLabel("Username:");
        login.add(usernameLabel);
        usernameField = new JTextField(20);
        login.add(usernameField);

        passwordLabel = new JLabel("Password:");
        login.add(passwordLabel);
        passwordField = new JTextField(20);
        login.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        login.add(loginButton);

        JPanel option = new JPanel(new GridLayout(1, 3));

        loginGroup = new ButtonGroup();
        admin = new JRadioButton("Admin");
        loginGroup.add(admin);
        doctor = new JRadioButton("Doctor");
        loginGroup.add(doctor);
        patient = new JRadioButton("Patient");
        loginGroup.add(patient);

        option.add(admin);
        option.add(doctor);
        option.add(patient);

        load.add(option, BorderLayout.NORTH);

    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (e.getActionCommand().equals("Login")) {
            if (admin.isSelected()) {

            } else if (doctor.isSelected()) {

            } else if (patient.isSelected()) {

            }
        }
        // redirect to home frame
        else if (e.getActionCommand().equals("Home")) {

        }
    }
}
