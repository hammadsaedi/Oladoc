package gui.layouts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeedbackForm extends JFrame implements ActionListener {
    JPanel panel;
    JLabel ratingLabel,reviewLabel;
    JTextArea reviewField;
    JSlider ratingSlider;
    JButton submitButton;

    public FeedbackForm() {
        // Set up the frame
        setTitle("Feedback Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Create a panel to hold the feedback form components
        panel = new JPanel();
        add(panel);

        // Add the review label and text area to the panel
        reviewLabel = new JLabel("Review:");
        panel.add(reviewLabel);
        reviewField = new JTextArea(5, 30);
        panel.add(reviewField);

        // Add the rating label and slider to the panel
        ratingLabel = new JLabel("Rating (out of 5):");
        panel.add(ratingLabel);
        ratingSlider = new JSlider(1, 5, 3);
        panel.add(ratingSlider);

        // Add the submit button to the panel
        submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Add an action listener to the submit button
        submitButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Submit")){

        }
    }
}
