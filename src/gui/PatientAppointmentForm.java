package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientAppointmentForm extends JPanel {
    private JLabel lDoctorName, lAppointmentTime, lStartTime, lEndTime, lHourlyCharge;
    private JTextField tDoctorName, tAppointmentTime, tStartTime, tEndTime, tHourlyCharge;

    private JComboBox mode;

    public PatientAppointmentForm() {
        setLayout(new GridLayout(8, 2));

        lDoctorName = new JLabel("Doctor Name:");
        tDoctorName = new JTextField();

        lAppointmentTime = new JLabel("Appointment Time:");
        tAppointmentTime = new JTextField();

        lStartTime = new JLabel("Doctor Start Time:");
        tStartTime = new JTextField();

        lEndTime = new JLabel("Doctor End Time:");
        tEndTime = new JTextField();

        mode = new JComboBox(new String[] {"In-Person", "Online"});

        lHourlyCharge = new JLabel("Doctor Hourly Charge:");
        tHourlyCharge = new JTextField();

        add(lDoctorName);
        add(tDoctorName);
        add(lAppointmentTime);
        add(tAppointmentTime);
        add(lStartTime);
        add(tStartTime);
        add(lEndTime);
        add(tEndTime);
        add(mode);
        add(lHourlyCharge);
        add(tHourlyCharge);

        mode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(mode.getSelectedIndex());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new PatientAppointmentForm());
        frame.setVisible(true);
    }
}