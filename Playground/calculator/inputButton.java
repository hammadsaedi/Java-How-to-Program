package calculator;

import javax.swing.*;
// import java.awt.event.KeyEvent;
import java.awt.*;

public class inputButton extends JButton {
    /* declaration of class level variables */
    // awt colors
    Color buttonColor = new Color(60, 60, 60), hoveColor = new Color(166, 166, 166);

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
                // default text
                String defaultText = buttonsContainer.button[0].getText();

                if (getText() == "-") { // For Negative Button
                    if (screenText.contains(getText())){ // already negative
                        screen.setText(screenText.replace("-", ""));  // removes negative sign
                    } else {
                        if (screenText.equals(defaultText)) { 
                            // writing button text to screen
                            screen.setText(defaultText); // Zero does not have sign
                        } else {
                            // negating the screen
                            screen.setText("-" + screenText);
                        }
                    }  
                } else {
                    if (screenText.equals(defaultText)) {
                        // writing button text to screen
                        screen.setText(getText());
                    } 
                    else {
                        // concatenating button's text to existing screen text
                        screen.setText(screenText + getText());
                    }
                }
                numberSystemPanel.screensUpdate(screen);
            }
        });
    }
}