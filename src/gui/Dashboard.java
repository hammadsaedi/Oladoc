package gui.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

    // Declare JButtons
    private JButton btnProfile, btnAppointment,btnLogout;

    public JPanel load;

    private JPanel buttonsMenu;

    public Dashboard(Patient patient) {
        // Set the title of the JFrame
        super("Dashboard");

        load = new JPanel(new BorderLayout());
        buttonsMenu = new JPanel(new GridLayout(5,1));
        // Initialize JButtons
        btnProfile = new JButton("Profile");
        btnAppointment = new JButton("Appointment");
        btnLogout = new JButton("Log Out");

        buttonsMenu.add(btnProfile);buttonsMenu.add(btnAppointment);buttonsMenu.add(btnLogout);

        load.add(buttonsMenu,BorderLayout.WEST);

        // Add action listener to the buttons
        btnProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                load.add(new Profile(patient).load,BorderLayout.CENTER);
                load.revalidate();
            }
        });

        btnAppointment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BorderLayout layout = (BorderLayout)load.getLayout();
                load.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                load.repaint();
                load.revalidate();
            }
        });
    }
}
