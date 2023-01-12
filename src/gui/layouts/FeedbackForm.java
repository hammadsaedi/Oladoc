package gui.layouts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeedbackForm extends JFrame implements ActionListener {
    public JPanel load;
    JLabel ratingLabel,reviewLabel;
    JTextArea reviewField;
    JSlider ratingSlider;
    JButton submitButton;

    public FeedbackForm() {
        // Set up the frame
        setTitle("Feedback Form");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the feedback form components
        load = new JPanel();
        add(load,BorderLayout.CENTER);

        // Add the review label and text area to the panel
        reviewLabel = new JLabel("Review:");
        load.add(reviewLabel);
        reviewField = new JTextArea(5, 30);
        load.add(reviewField);

        // Add the rating label and slider to the panel
        ratingLabel = new JLabel("Rating (out of 5):");
        load.add(ratingLabel);
        ratingSlider = new JSlider(1, 5, 3);
        ratingSlider.setPaintTicks(true);
        ratingSlider.setMinorTickSpacing(1);
        ratingSlider.setPaintTrack(true);
        ratingSlider.setMajorTickSpacing(1);
        ratingSlider.setSnapToTicks(true);
        ratingSlider.setPaintLabels(true);
        load.add(ratingSlider);

        // Add the submit button to the panel
        submitButton = new JButton("Submit");
        load.add(submitButton);

        // Add an action listener to the submit button
        submitButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Submit")){

        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
