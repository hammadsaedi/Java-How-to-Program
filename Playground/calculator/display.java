package calculator;

import javax.swing.*;
// import javax.swing.text.SimpleAttributeSet;

import java.awt.*;


public class display extends JTextField {
    // colors
    Color backgroundColor = new Color(44, 44, 44);
    Color foregroundColor = new Color(191, 191, 191);

    // constructor
    public display(){
        // default text
        setText("0");
        setForeground(foregroundColor);
        setBackground(backgroundColor);
        // setOpaque(false);

        setEditable(false);

    }
    
}
