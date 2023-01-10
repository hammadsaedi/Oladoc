package gui.layouts;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class hellow extends JFrame {
    JPanel p1;
    public hellow() throws IOException {

        p1 = new JPanel(new FlowLayout());

        BufferedImage myPicture = ImageIO.read(new File("F:/Oladoc/OLADOC1.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        p1.add(picLabel);

    }
}
