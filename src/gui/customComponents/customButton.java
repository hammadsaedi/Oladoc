package gui.customComponents;

import javax.swing.*;
import java.awt.*;

public class customButton extends JButton {
    public customButton(){
        setBackground(Color.blue);
    }

    public customButton(String name){
        this();
        setText(name);
    }
}
