package gui;

import app.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

public class DoctorAppointmentPanel extends JFrame {
    public JPanel load;
    private ArrayList<Appointment> appointments;
    private JList<Appointment> appointmentsList;
    private JScrollPane scrollPane;

    public DoctorAppointmentPanel(ArrayList<Appointment> appointments) {
        this.appointments = appointments;

        load = new JPanel(new BorderLayout());

        appointmentsList = new JList<>(appointments.toArray(new Appointment[appointments.size()]));
        scrollPane = new JScrollPane(appointmentsList);
        load.add(scrollPane,BorderLayout.CENTER);

        appointmentsList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                int index = list.locationToIndex(evt.getPoint());
                System.out.println("I got clicked");
                System.out.println(index);
            }
        });
    }

    public static void main(String[] args) {
    }
}
