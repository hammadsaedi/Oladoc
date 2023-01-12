package app;

import gui.layouts.FeedbackForm;
import gui.layouts.Header;
import gui.layouts.Login;
import gui.layouts.Registration;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class mainRunner {

    public static void main(String[] args) throws IOException {
        // BackEndInterface app = new BackEndInterface("db");
        BackEndInterface app = new BackEndInterface(new Database(new Admin("admin",
                "admin")), "db");
        JFrame frame = new JFrame();

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setFocusable(false);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.add(new Registration(app).load, BorderLayout.CENTER);
        frame.add(new Header().load, BorderLayout.NORTH);

        // frame.add(new FeedbackForm().load,BorderLayout.CENTER);
        frame.repaint();
        frame.revalidate();

    }
}
