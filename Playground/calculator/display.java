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
        // setText("0123456");
        setForeground(foregroundColor);
        setBackground(backgroundColor);




        // // design
        // attributeSet = new SimpleAttributeSet();  
        
        // StyleConstants.setBold(attributeSet, true);  
        // StyleConstants.setItalic(attributeSet, true);  
        // StyleConstants.setForeground(attributeSet, Color.WHITE);  
        // StyleConstants.setBackground(attributeSet, Color.BLACK); 
    }
    
}
