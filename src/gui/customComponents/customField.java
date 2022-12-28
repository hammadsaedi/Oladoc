package gui.customComponents;

import javax.swing.*;
import java.awt.*;

public class customField extends JTextField {
    public customField(){
    }

    public customField(int columns){
        this();
        setColumns(columns);
    }
}
