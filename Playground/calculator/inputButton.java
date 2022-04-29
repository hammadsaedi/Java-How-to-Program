package calculator;

import javax.swing.*;
// import java.awt.event.KeyEvent;
import java.awt.*;

public class inputButton extends JButton {
    /* declaration of class level variables */
    // awt colors
    Color buttonColor = new Color(60, 60, 60), hoveColor = new Color(166, 166, 166);;

    // constructor method
    public inputButton(String text, JTextField screen) {
        // color
        setForeground(Color.WHITE);
        setBackground(buttonColor);

        // setting text
        setText(text);

        setFocusPainted(false);
        setBorderPainted(false);


        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setForeground(Color.BLACK);
                setBackground(hoveColor);
                setBorder(BorderFactory.createLineBorder(Color.WHITE));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setForeground(Color.WHITE);
                setBackground(buttonColor);
                setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            }
        });


        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // previous text
                String screenText = screen.getText();
                
                // concatenating button's text to screen
                screen.setText(screenText + getText());
            }
        });
    }
}