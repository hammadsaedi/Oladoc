package gui.layouts;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;

public class Profile extends JFrame {
    public JPanel load;

    private JLabel lFirstName,lLastName,lAge,lGender,lNumber,lCnic,lEmail,lHouseNo,lStreetNo,lArea,lCity,lCountry,lSpecialization,lExperience,lHourlyCharge,lDoctorBalance,lStartTime,lEndTime,lHospitalName,lBloodGroup,lPatientBalance;

    private JFormattedTextField tFirstName,tLastName,tAge,tGender,tNumber,tCnic,tEmail,tHouseNo,tStreetNo,tArea,tCity,tCountry,tSpecialization,tExperience,tHourlyCharge,tDoctorBalance,tStartTime,tEndTime,tHospitalName,tBloodGroup,tPatientBalance;

   private JButton updateProfileDoctor,updateProfilePatient,home;

   private JPanel formPanel,footer;

    public Profile(Patient patient){
        load = new JPanel(new BorderLayout());
        formPanel = new JPanel(new GridLayout(14,2));
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
        lBloodGroup = new JLabel("Blood Group: ");
        lPatientBalance = new JLabel("gui.layouts.Patient's Balance: ");

        tFirstName = new JFormattedTextField();
        tLastName = new JFormattedTextField();
        tAge = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tGender = new JFormattedTextField();
        tNumber = new JFormattedTextField();
        tCnic = new JFormattedTextField();
        tEmail = new JFormattedTextField();
        tHouseNo = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tStreetNo = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tArea = new JFormattedTextField();
        tCity = new JFormattedTextField();
        tCountry = new JFormattedTextField();
        tBloodGroup = new JFormattedTextField();
        tPatientBalance = new JFormattedTextField(NumberFormat.getIntegerInstance());

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

        load.add(formPanel);

        JScrollPane bar1 = new JScrollPane(formPanel);

        //footer
        updateProfilePatient = new JButton("Update Profile");
        home = new JButton("Home");
        footer = new JPanel(new GridLayout(1,2));
        footer.add(updateProfilePatient);footer.add(home);
//        updateProfilePatient.addActionListener(this);home.addActionListener(this);
        load.add(footer,BorderLayout.SOUTH);;load.add(bar1,BorderLayout.CENTER);


        //Setting text
        tFirstName.setValue(patient.getFirstName());
        tLastName.setValue(patient.getLastName());
        tAge.setValue(patient.getAge());
        tGender.setValue(patient.getGender());
        tCnic.setValue(patient.getCnic());
        tEmail.setValue(patient.getEmail());
        tHouseNo.setValue(patient.getAddress().getHouseNo());
        tArea.setValue(patient.getAddress().getArea());
        tStreetNo.setValue(patient.getAddress().getStreetNo());
        tCity.setValue(patient.getAddress().getCity());
        tCountry.setValue(patient.getAddress().getCountry());
        tNumber.setValue(patient.getNumber());

        tBloodGroup.setValue(patient.getBloodGroup());
        tPatientBalance.setValue(patient.getBalance());


        updateProfilePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                patient.setFirstName(tFirstName.getText());
                patient.setLastName(tLastName.getText());
                patient.setAge(Integer.parseInt(tAge.getText()));
                patient.setGender(tGender.getText());
                patient.setCnic(tCnic.getText());
                patient.setEmail(tEmail.getText());
                patient.getAddress().setHouseNo((Integer) tHouseNo.getValue());
                patient.getAddress().setArea(tArea.getText());
                patient.getAddress().setStreetNo((Integer) tStreetNo.getValue());
                patient.getAddress().setCity(tCity.getText());
                patient.getAddress().setCountry(tCountry.getText());

                patient.setBloodGroup(tBloodGroup.getText());
                patient.setBalance((Double) tPatientBalance.getValue());
            }
        });

    }

    public Profile(Doctor doctor) {
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
        lDoctorBalance = new JLabel("gui.layouts.Doctor's Balance: ");
        lStartTime = new JLabel("Start gui.layouts.Time: ");
        lEndTime = new JLabel("End gui.layouts.Time: ");
        lHospitalName = new JLabel("gui.layouts.Hospital Name: ");


        tFirstName = new JFormattedTextField();
        tLastName = new JFormattedTextField();
        tAge = new JFormattedTextField(NumberFormat.getIntegerInstance());
        tGender = new JFormattedTextField();
        tNumber = new JFormattedTextField();
        tCnic = new JFormattedTextField();
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

        formPanel.add(lFirstName);formPanel.add(tFirstName);formPanel.add(lLastName);formPanel.add(tLastName);formPanel.add(lAge);formPanel.add(tAge);formPanel.add(lGender);formPanel.add(tGender);formPanel.add(lNumber);formPanel.add(tNumber);formPanel.add(lCnic);formPanel.add(tCnic);formPanel.add(lEmail);formPanel.add(tEmail);formPanel.add(lHouseNo);formPanel.add(tHouseNo);formPanel.add(lStreetNo);formPanel.add(tStreetNo);formPanel.add(lArea);formPanel.add(tArea);formPanel.add(lCity);formPanel.add(tCity);formPanel.add(lCountry);formPanel.add(tCountry);formPanel.add(lSpecialization);formPanel.add(tSpecialization);formPanel.add(lExperience);formPanel.add(tExperience);formPanel.add(lHourlyCharge);formPanel.add(tHourlyCharge);formPanel.add(lDoctorBalance);formPanel.add(tDoctorBalance);formPanel.add(lStartTime);formPanel.add(tStartTime);formPanel.add(lEndTime);formPanel.add(tEndTime);formPanel.add(lHospitalName);formPanel.add(tHospitalName);

        load.add(formPanel);

        JScrollPane bar1 = new JScrollPane(formPanel);

        //footer
        updateProfileDoctor = new JButton("Update Profile");
        home = new JButton("Home");
        footer = new JPanel(new GridLayout(1,2));
        footer.add(updateProfileDoctor);footer.add(home);
//        updateProfileDoctor.addActionListener(this);home.addActionListener(this);
        load.add(footer,BorderLayout.SOUTH);load.add(bar1,BorderLayout.CENTER);



        //Setting text
        tFirstName.setValue(doctor.getFirstName());
        tLastName.setValue(doctor.getLastName());
        tAge.setValue(doctor.getAge());
        tGender.setValue(doctor.getGender());
        tCnic.setValue(doctor.getCnic());
        tEmail.setValue(doctor.getEmail());
        tHouseNo.setValue(doctor.getAddress().getHouseNo());
        tArea.setValue(doctor.getAddress().getArea());
        tStreetNo.setValue(doctor.getAddress().getStreetNo());
        tCity.setValue(doctor.getAddress().getCity());
        tCountry.setValue(doctor.getAddress().getCountry());

        tSpecialization.setValue(doctor.getSpecialization());
        tExperience.setValue(doctor.getExperience());
        tHourlyCharge.setValue(doctor.getHourlyCharges());
        tStartTime.setValue(doctor.getTiming().getStart().getHour());
        tEndTime.setValue(doctor.getTiming().getEnd().getHour());
        tHospitalName.setValue(doctor.getHospital().getName());

        updateProfileDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                doctor.setFirstName(tFirstName.getText());
                doctor.setLastName(tLastName.getText());
                doctor.setAge(Integer.parseInt(tAge.getText()));
                doctor.setGender(tGender.getText());
                doctor.setCnic(tCnic.getText());
                doctor.setEmail(tEmail.getText());
                doctor.getAddress().setHouseNo((Integer) tHouseNo.getValue());
                doctor.getAddress().setArea(tArea.getText());
                doctor.getAddress().setStreetNo((Integer) tStreetNo.getValue());
                doctor.getAddress().setCity(tCity.getText());
                doctor.getAddress().setCountry(tCountry.getText());

                doctor.setSpecialization(tSpecialization.getText());
                doctor.setExperience((Double) tExperience.getValue());
                doctor.setHourlyCharges((Double) tHourlyCharge.getValue());
                doctor.getTiming().getStart().setHour((Integer) tStartTime.getValue());
                doctor.getTiming().getEnd().setHour((Integer) tEndTime.getValue());
                doctor.getHospital().setName(tHospitalName.getText());
                System.out.println("Updation Done");
            }
        });
    }

}

