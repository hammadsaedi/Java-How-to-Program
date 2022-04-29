package calculator;

import java.awt.*;
import javax.swing.*;

public class numberSystemPanel extends JPanel {
    // awt color
    Color backgroundColor = new Color(44, 44, 44);
    Color foregroundColor = new Color(191, 191, 191);

    Color buttonColor = new Color(60, 60, 60), hoveColor = new Color(166, 166, 166);

    
    // swing components
    JRadioButton HEX, DEC, OCT, BIN;
    JTextField hexField, decField, octField, binField;
    ButtonGroup buttonGroup = new ButtonGroup();   
    
    // constructor
    public numberSystemPanel(){
        // label = new JLabel(text);
        hexField = new JTextField();
        decField = new JTextField();
        octField = new JTextField();
        binField = new JTextField();
        HEX = new JRadioButton("HEX");
        DEC = new JRadioButton("DEC", true);
        OCT = new JRadioButton("OCT");
        BIN = new JRadioButton("BIN");

        // field.setForeground(foregroundColor);
        
        // hexField.setOpaque(false);


        // setForeground(foregroundColor);
        setBackground(backgroundColor);

        add(HEX);
        add(hexField);
        add(DEC);
        add(decField);
        add(OCT);
        add(octField);
        add(BIN);
        add(binField);

        buttonGroup.add(HEX);
        buttonGroup.add(DEC);
        buttonGroup.add(OCT);
        buttonGroup.add(BIN);

        // addMouseListener(new java.awt.event.MouseAdapter() {
        //     public void mouseEntered(java.awt.event.MouseEvent evt) {
        //         setForeground(Color.BLACK);
        //         setBackground(hoveColor);
        //         setBorder(BorderFactory.createLineBorder(Color.WHITE));
        //     }
        //     public void mouseExited(java.awt.event.MouseEvent evt) {
        //         setForeground(Color.WHITE);
        //         setBackground(buttonColor);
        //         setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        //     }
        // });


        HEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                buttonsContainer.hexMode();
            }
        });

        DEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                buttonsContainer.decMode();
            }
        });

        OCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                buttonsContainer.octMode();
            }
        });

        BIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                buttonsContainer.binMode();
            }
        });

        // buttonsContainer.binMode();

        // HEX.setBounds(0, 50, 50, 50);
        // hexField.setBounds(0, 50, 300, 50);
        // DEC.setBounds(0, 100, 50, 50);
        // decField.setBounds(0, 100, 300, 50);
        // OCT.setBounds(0, 0, 150, 50);
        // octField.setBounds(0, 150, 300, 50);
        // BIN.setBounds(0, 0, 200, 50);
        // binField.setBounds(0, 200, 300, 50);

        setLayout(new FlowLayout());

 
    }
}
