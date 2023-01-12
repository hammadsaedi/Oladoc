package gui.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;

public class Registration extends JFrame implements ActionListener {
    public JPanel load;

    private JLabel lFirstName,lLastName,lAge,lGender,lNumber,lCnic,lEmail,lHouseNo,lStreetNo,lArea,lCity,lCountry,lSpecialization,lExperience,lHourlyCharge,lDoctorBalance,lStartTime,lEndTime,lHospitalName,lBloodGroup,lPatientBalance;

    private JFormattedTextField tFirstName,tLastName,tAge,tGender,tNumber,tCnic,tEmail,tHouseNo,tStreetNo,tArea,tCity,tCountry,tSpecialization,tExperience,tHourlyCharge,tDoctorBalance,tStartTime,tEndTime,tHospitalName,tBloodGroup,tPatientBalance;

    private ButtonGroup loginGroup;
    private JRadioButton doctor,patient;
    private JPanel option,formPanel,footer;

    private JButton submit,home;
    public Registration() {
        load = new JPanel(new BorderLayout());

        formPanel = new JPanel(new GridLayout(19,2));

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


        tFirstName = new JFormattedTextField();
        tLastName = new JFormattedTextField();
        tAge = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tGender = new JFormattedTextField();
        tNumber = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tCnic = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tEmail = new JFormattedTextField();
        tHouseNo = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tStreetNo = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tArea = new JFormattedTextField();
        tCity = new JFormattedTextField();
        tCountry = new JFormattedTextField();
        tSpecialization = new JFormattedTextField();
        tExperience = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tHourlyCharge = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tDoctorBalance = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tStartTime = new JFormattedTextField(DateFormat.getTimeInstance());
        tEndTime = new JFormattedTextField(DateFormat.getTimeInstance());
        tHospitalName = new JFormattedTextField();
        tBloodGroup = new JFormattedTextField();
        tPatientBalance = new JFormattedTextField(NumberFormat.getIntegerInstance());

        load.add(formPanel);

        //Radio Buttons
        option = new JPanel(new GridLayout(1,2));
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


        //footer
        submit = new JButton("Submit");
        home = new JButton("Home");
        footer = new JPanel(new GridLayout(1,2));
        footer.add(submit);footer.add(home);
        submit.addActionListener(this);home.addActionListener(this);

        load.add(footer,BorderLayout.SOUTH);load.add(option,BorderLayout.NORTH);load.add(bar1,BorderLayout.CENTER);
    }



    public void actionPerformed(ActionEvent e){
        if(e.getSource() == patient || e.getSource() == doctor){
            if(doctor.isSelected()){
                formPanel.removeAll();
                formPanel.add(lFirstName);formPanel.add(tFirstName);formPanel.add(lLastName);formPanel.add(tLastName);formPanel.add(lAge);formPanel.add(tAge);formPanel.add(lGender);formPanel.add(tGender);formPanel.add(lNumber);formPanel.add(tNumber);formPanel.add(lCnic);formPanel.add(tCnic);formPanel.add(lEmail);formPanel.add(tEmail);formPanel.add(lHouseNo);formPanel.add(tHouseNo);formPanel.add(lStreetNo);formPanel.add(tStreetNo);formPanel.add(lArea);formPanel.add(tArea);formPanel.add(lCity);formPanel.add(tCity);formPanel.add(lCountry);formPanel.add(tCountry);formPanel.add(lSpecialization);formPanel.add(tSpecialization);formPanel.add(lExperience);formPanel.add(tExperience);formPanel.add(lHourlyCharge);formPanel.add(tHourlyCharge);formPanel.add(lDoctorBalance);formPanel.add(tDoctorBalance);formPanel.add(lStartTime);formPanel.add(tStartTime);formPanel.add(lEndTime);formPanel.add(tEndTime);formPanel.add(lHospitalName);formPanel.add(tHospitalName);
            }

            if(patient.isSelected()){
                formPanel.removeAll();
                formPanel.add(lFirstName);formPanel.add(tFirstName);
                formPanel.add(lLastName);formPanel.add(tLastName);
                formPanel.add(lAge);formPanel.add(tAge);
                formPanel.add(lGender);formPanel.add(tGender);
                formPanel.add(lNumber);formPanel.add(tNumber);
                formPanel.add(lCnic);formPanel.add(tCnic);
                formPanel.add(lEmail);formPanel.add(tEmail);
                formPanel.add(lHouseNo);formPanel.add(tHouseNo);
                formPanel.add(lStreetNo);formPanel.add(tStreetNo);
                formPanel.add(lArea);formPanel.add(tArea);
                formPanel.add(lCity);formPanel.add(tCity);
                formPanel.add(lCountry);formPanel.add(tCountry);
                formPanel.add(lBloodGroup);formPanel.add(tBloodGroup);
                formPanel.add(lPatientBalance);
                formPanel.add(tPatientBalance);
            }
            formPanel.repaint();
            formPanel.revalidate();
        }
    }
}
