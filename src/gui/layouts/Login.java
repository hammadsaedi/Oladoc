package gui.layouts;

import gui.customComponents.customButton;
import gui.customComponents.customField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JPanel option,login;
    JLabel usernameLabel,passwordLabel;
    customField usernameField,passwordField;
    customButton loginButton,home;
    JRadioButton doctor,patient,admin;
    ButtonGroup loginGroup;

    public Login(){
        // Set up the frame
        setTitle("Login Form");
        setSize(300, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Create a panel to hold the login form components
        login = new JPanel(new GridLayout(3,2));

        add(login,BorderLayout.CENTER);

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
        option = new JPanel(new GridLayout(1,3));

        loginGroup = new ButtonGroup();
        admin = new JRadioButton("Admin");
        loginGroup.add(admin);
        doctor = new JRadioButton("Doctor");
        loginGroup.add(doctor);
        patient = new JRadioButton("Patient");
        loginGroup.add(patient);

        option.add(admin);option.add(doctor);option.add(patient);

        add(option,BorderLayout.NORTH);

    }

    public void actionPerformed(ActionEvent e){
        String username = usernameField.getText();
        String password = passwordField.getText();
        if(e.getActionCommand().equals("Login")){
            if(admin.isSelected()){

            }
            else if(doctor.isSelected()){

            }
            else if(patient.isSelected()){

            }
        }
        //redirect to home frame
        else if(e.getActionCommand().equals("Home")){

        }
    }
}
