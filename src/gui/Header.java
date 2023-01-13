package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Header extends JFrame {
    public JPanel load;

    public Header() throws IOException {

        load = new JPanel(new FlowLayout());

        BufferedImage myPicture = ImageIO.read(new File("OLADOC1.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        load.add(picLabel);

    }
}
