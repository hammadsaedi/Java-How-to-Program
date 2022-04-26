package calculator;

import javax.swing.*;
import java.awt.*;

public class hButton extends JButton {
    /* declaration of class level variables */
    // swing components
    // JFrame window;
    // awt colors
    Color buttonColor = new Color(60, 60, 60), hoveColor = new Color(166, 166, 166);;

    // main method
    public static void main(String[] args){

    }

    // constructor method
    public hButton(String text, JFrame window) {
        setForeground(Color.WHITE);
        setBackground(buttonColor);

        setText(text);

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

        setFocusPainted(false);
        setBorderPainted(false);
    
        if (text == "X"){
            // close button listener
            addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    window.dispose();
                }
            });
            setMnemonic('C');

        } else if (text == "-"){
            // minimizer button listener
            addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    window.setState(JFrame.ICONIFIED);
                }
            });
            setMnemonic('M');
        }
    }
}
