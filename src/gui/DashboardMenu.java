package gui;

import javax.swing.*;
import java.awt.*;

public class DashboardMenu extends JFrame {
    public JPanel load;

    private JButton profile, appointment, logout;

    public DashboardMenu() {
        load = new JPanel(new GridLayout(3, 1));

        profile = new JButton();
        appointment = new JButton();
        logout = new JButton();

    }

}
