package gui;

import app.*;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DoctorList extends JFrame {
    public JPanel load;
    private ArrayList<Doctor> doctors;
    private JList<Doctor> doctorList;
    private JScrollPane scrollPane;

    public DoctorList(ArrayList<Doctor> doctors) {
        this.doctors = doctors;

        load = new JPanel();

        doctorList = new JList<>(doctors.toArray(new Doctor[doctors.size()]));
        scrollPane = new JScrollPane(doctorList);
        load.add(scrollPane);
    }

    public static void main(String[] args) {
        
    }
}
