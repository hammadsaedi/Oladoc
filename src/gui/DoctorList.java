package gui;

import app.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

public class DoctorList extends JFrame {
    public JPanel load;
    private ArrayList<Doctor> doctors;
    private JList<Doctor> doctorList;
    private JScrollPane scrollPane;

    public DoctorList(ArrayList<Doctor> doctors) {
        this.doctors = doctors;

        load = new JPanel(new BorderLayout());

        doctorList = new JList<>(doctors.toArray(new Doctor[doctors.size()]));
        scrollPane = new JScrollPane(doctorList);
        load.add(scrollPane,BorderLayout.CENTER);

        doctorList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                int index = list.locationToIndex(evt.getPoint());
                System.out.println("I got clicked");
                System.out.println(index);
            }
        });
    }

    public static void main(String[] args) {
        Time t = new Time(12);
        Time t2 = new Time(23);
        Timing t1 = new Timing(t,t2);
        ArrayList<Doctor> doc = new ArrayList<>();
        Doctor dummyDoctor = new Doctor("123", "password", "John", "Doe", 30, "Male", "1234567890", "12345-1234567-1", "johndoe@example.com", new Address(123, 213, "State", "ff","pk"),"Surgeon",t1, new Hospital("Hospital 1"), 5.0, 100.0, 1000);
        for (int i = 0; i < 50; i++) {
            doc.add(dummyDoctor);
        }
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.add(new DoctorList(doc).load,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
