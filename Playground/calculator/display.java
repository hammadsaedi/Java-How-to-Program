package calculator;

import javax.swing.*;
// import javax.swing.text.SimpleAttributeSet;

import java.awt.*;


public class display extends JTextField {
    // constructor
    public display(){
        // default text
        setText("0");
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);


        // // design
        // attributeSet = new SimpleAttributeSet();  
        
        // StyleConstants.setBold(attributeSet, true);  
        // StyleConstants.setItalic(attributeSet, true);  
        // StyleConstants.setForeground(attributeSet, Color.WHITE);  
        // StyleConstants.setBackground(attributeSet, Color.BLACK); 
    }
    
}
