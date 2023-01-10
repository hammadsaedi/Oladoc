package gui.layouts;

import gui.customComponents.customButton;
import gui.customComponents.customField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JPanel load;
    private JLabel usernameLabel, passwordLabel;
    private customField usernameField, passwordField;
    private customButton loginButton, home;
    private JRadioButton doctor, patient, admin;
    private ButtonGroup loginGroup;

    public Login() {

        load = new JPanel(new BorderLayout());
        load.setSize(400,400);

        // Create a panel to hold the login form components
        JPanel login = new JPanel(new GridLayout(3, 2));

        load.add(login, BorderLayout.CENTER);

        // Add the username label and text field to the panel
        usernameLabel = new JLabel("Username:");
        login.add(usernameLabel);
        usernameField = new customField(20);
        login.add(usernameField);

        // Add the password label and text field to the panel
        passwordLabel = new JLabel("Password:");
        login.add(passwordLabel);
        passwordField = new customField(20);
        login.add(passwordField);

        // Add the login button to the panel
        loginButton = new customButton("Login");
        loginButton.addActionListener(this);
        login.add(loginButton);
        home = new customButton("Home");
        home.addActionListener(this);
        login.add(home);

        //Radio Button Panel
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
        //redirect to home frame
        else if (e.getActionCommand().equals("Home")) {

        }
    }
}
