package gui.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import app.*;

public class Registration extends JFrame implements ActionListener {
    public JPanel load;
    private BackEndInterface app;

    private JLabel lId, lPassword, lFirstName, lLastName, lAge, lGender, lNumber, lCnic, lEmail, lHouseNo, lStreetNo,
            lArea, lCity,
            lCountry, lSpecialization, lExperience, lHourlyCharge, lDoctorBalance, lStartTime, lEndTime, lHospitalName,
            lBloodGroup, lPatientBalance;

    private JFormattedTextField tId, tPassword, tFirstName, tLastName, tAge, tGender, tNumber, tCnic, tEmail, tHouseNo,
            tStreetNo,
            tArea, tCity, tCountry, tSpecialization, tExperience, tHourlyCharge, tDoctorBalance, tStartTime, tEndTime,
            tHospitalName, tBloodGroup, tPatientBalance;

    private ButtonGroup loginGroup;
    private JRadioButton doctor, patient;
    private JPanel option, formPanel, footer;

    private JButton submit, home;

    public Registration(BackEndInterface app) {
        this.app = app;

        load = new JPanel(new BorderLayout());

        formPanel = new JPanel(new GridLayout(21, 2));

        lId = new JLabel("User Name: ");
        lPassword = new JLabel("Password: ");
        lFirstName = new JLabel("First Name: ");
        lLastName = new JLabel("Last Name: ");
        lAge = new JLabel("Age: ");
        lGender = new JLabel("Gender: ");
        lNumber = new JLabel("Phone Number: ");
        lCnic = new JLabel("CNIC: ");
        lEmail = new JLabel("Email: ");
        lHouseNo = new JLabel("House No: ");
        lStreetNo = new JLabel("Street No: ");
        lArea = new JLabel("Area: ");
        lCity = new JLabel("City: ");
        lCountry = new JLabel("Country: ");
        lSpecialization = new JLabel("Specialization: ");
        lExperience = new JLabel("Experience: ");
        lHourlyCharge = new JLabel("Hourly Charge: ");
        lDoctorBalance = new JLabel("Doctor's Balance: ");
        lStartTime = new JLabel("Start Time: ");
        lEndTime = new JLabel("End Time: ");
        lHospitalName = new JLabel("Hospital Name: ");
        lBloodGroup = new JLabel("Blood Group: ");
        lPatientBalance = new JLabel("Patient's Balance: ");

        tId = new JFormattedTextField("hammad");
        tPassword = new JFormattedTextField("amir");
        tFirstName = new JFormattedTextField("Hammad");
        tLastName = new JFormattedTextField("Saeedi");
        tAge = new JFormattedTextField("20");
        tGender = new JFormattedTextField("Male");
        tNumber = new JFormattedTextField("033325122004");
        tCnic = new JFormattedTextField("36103-410071-1");
        tEmail = new JFormattedTextField("faoqzuhair@gmail.com");
        tHouseNo = new JFormattedTextField("19");
        tStreetNo = new JFormattedTextField("1");
        tArea = new JFormattedTextField("Amin Town");
        tCity = new JFormattedTextField("Khanewal");
        tCountry = new JFormattedTextField("Pakistan");
        tSpecialization = new JFormattedTextField("General");
        tExperience = new JFormattedTextField("1.5");
        tHourlyCharge = new JFormattedTextField("100");
        tDoctorBalance = new JFormattedTextField("15000");
        tStartTime = new JFormattedTextField("9");
        tEndTime = new JFormattedTextField("17");
        tHospitalName = new JFormattedTextField("HBS");
        tBloodGroup = new JFormattedTextField("A+");
        tPatientBalance = new JFormattedTextField("12000");

        load.add(formPanel);

        // Radio Buttons
        option = new JPanel(new GridLayout(1, 2));
        loginGroup = new ButtonGroup();
        doctor = new JRadioButton("Doctor");
        loginGroup.add(doctor);
        patient = new JRadioButton("Patient");
        loginGroup.add(patient);

        option.add(doctor);
        option.add(patient);

        JScrollPane bar1 = new JScrollPane(formPanel);

        patient.addActionListener(this);
        doctor.addActionListener(this);

        // footer
        submit = new JButton("Submit");
        home = new JButton("Home");
        footer = new JPanel(new GridLayout(1, 2));
        footer.add(submit);
        footer.add(home);
        submit.addActionListener(this);
        home.addActionListener(this);

        load.add(footer, BorderLayout.SOUTH);
        load.add(option, BorderLayout.NORTH);
        load.add(bar1, BorderLayout.CENTER);

        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String id = tId.getText();
                String password = tPassword.getText();
                String firstName = tFirstName.getText();
                String lastName = tLastName.getText();
                int age = Integer.parseInt(tAge.getText());
                String gender = tGender.getText();
                String number = tNumber.getText();
                String cnic = tCnic.getText();
                String email = tEmail.getText();
                int houseNo = Integer.parseInt(tHouseNo.getText());
                int streetNo = Integer.parseInt(tStreetNo.getText());
                String area = tArea.getText();
                String city = tCity.getText();
                String country = tCountry.getText();
                Address address = new Address(houseNo, streetNo, area, city, country);
                // validation for null value
                // has to be added

                if (patient.isSelected()) {
                    String bloodGroup = tBloodGroup.getText();
                    double balance = Double.parseDouble(tPatientBalance.getText());
                    app.registerPatient(firstName, lastName, age, gender, number, cnic, email, address, id, password,
                            bloodGroup,
                            balance);
                } else if (doctor.isSelected()) {
                    String specialization = tSpecialization.getText();
                    Time start = new Time(Integer.parseInt(tStartTime.getText()));
                    Time end = new Time(Integer.parseInt(tEndTime.getText()));
                    Timing timing = new Timing(start, end);
                    String hospitalName = tHospitalName.getText();
                    Hospital hospital = new Hospital(hospitalName);
                    double experience = Double.parseDouble(tExperience.getText());
                    double hourlyCharges = Double.parseDouble(tHourlyCharge.getText());
                    double balance = Double.parseDouble(tDoctorBalance.getText());
                    app.registerDoctor(id, password, firstName, lastName, age, gender, number, cnic, email, address,
                            specialization, timing, hospital, experience, hourlyCharges, balance);
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == patient || e.getSource() == doctor) {
            if (doctor.isSelected()) {
                formPanel.removeAll();
                formPanel.add(lId);
                formPanel.add(tId);
                formPanel.add(lPassword);
                formPanel.add(tPassword);
                formPanel.add(lFirstName);
                formPanel.add(tFirstName);
                formPanel.add(lLastName);
                formPanel.add(tLastName);
                formPanel.add(lAge);
                formPanel.add(tAge);
                formPanel.add(lGender);
                formPanel.add(tGender);
                formPanel.add(lNumber);
                formPanel.add(tNumber);
                formPanel.add(lCnic);
                formPanel.add(tCnic);
                formPanel.add(lEmail);
                formPanel.add(tEmail);
                formPanel.add(lHouseNo);
                formPanel.add(tHouseNo);
                formPanel.add(lStreetNo);
                formPanel.add(tStreetNo);
                formPanel.add(lArea);
                formPanel.add(tArea);
                formPanel.add(lCity);
                formPanel.add(tCity);
                formPanel.add(lCountry);
                formPanel.add(tCountry);
                formPanel.add(lSpecialization);
                formPanel.add(tSpecialization);
                formPanel.add(lExperience);
                formPanel.add(tExperience);
                formPanel.add(lHourlyCharge);
                formPanel.add(tHourlyCharge);
                formPanel.add(lDoctorBalance);
                formPanel.add(tDoctorBalance);
                formPanel.add(lStartTime);
                formPanel.add(tStartTime);
                formPanel.add(lEndTime);
                formPanel.add(tEndTime);
                formPanel.add(lHospitalName);
                formPanel.add(tHospitalName);
            }

            if (patient.isSelected()) {
                formPanel.removeAll();
                formPanel.add(lId);
                formPanel.add(tId);
                formPanel.add(lPassword);
                formPanel.add(tPassword);
                formPanel.add(lFirstName);
                formPanel.add(tFirstName);
                formPanel.add(lLastName);
                formPanel.add(tLastName);
                formPanel.add(lAge);
                formPanel.add(tAge);
                formPanel.add(lGender);
                formPanel.add(tGender);
                formPanel.add(lNumber);
                formPanel.add(tNumber);
                formPanel.add(lCnic);
                formPanel.add(tCnic);
                formPanel.add(lEmail);
                formPanel.add(tEmail);
                formPanel.add(lHouseNo);
                formPanel.add(tHouseNo);
                formPanel.add(lStreetNo);
                formPanel.add(tStreetNo);
                formPanel.add(lArea);
                formPanel.add(tArea);
                formPanel.add(lCity);
                formPanel.add(tCity);
                formPanel.add(lCountry);
                formPanel.add(tCountry);
                formPanel.add(lBloodGroup);
                formPanel.add(tBloodGroup);
                formPanel.add(lPatientBalance);
                formPanel.add(tPatientBalance);
            }
            formPanel.repaint();
            formPanel.revalidate();
        }
    }
}
