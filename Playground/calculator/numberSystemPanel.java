package calculator;

import java.awt.*;
import javax.swing.*;

public class numberSystemPanel extends JPanel {
    // awt color
    Color backgroundColor = new Color(44, 44, 44);
    Color foregroundColor = new Color(191, 191, 191);

    Color buttonColor = new Color(60, 60, 60), hoveColor = new Color(166, 166, 166);

    
    // swing components
    static JRadioButton[] NUM = new JRadioButton[4];
    static JTextField[] Field = new JTextField[4];
    ButtonGroup buttonGroup = new ButtonGroup();   
    
    // constructor
    public numberSystemPanel(){
        // Radio Buttons
        NUM[0] = new JRadioButton("HEX");
        NUM[1] = new JRadioButton("DEC", true);
        NUM[2] = new JRadioButton("OCT");
        NUM[3] = new JRadioButton("BIN");

        // Text Fields
        for (int i = 0; i < Field.length; i++){
            Field[i] = new JTextField();
        }


        // field.setForeground(foregroundColor);
        
        // hexField.setOpaque(false);


        // setForeground(foregroundColor);
        setBackground(backgroundColor);

        // adding radio button and text fields in Panel and further more adding radio buttons in Button Group (for selection of one option at a time)
        for (int i = 0; i < NUM.length && i < Field.length; i++){
            add(NUM[i]);
            buttonGroup.add(NUM[i]);
            add(Field[i]);
        }


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

        // HEX Mode
        NUM[0].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Screen Text (that's HEX)
                buttonsContainer.hexMode();
                String screenText = calculator.screen.getText();
                
                Field[0].setText(screenText);
                
                // Converting into Decimal
                int decimal = Integer.parseInt(screenText,16);
                
                String DEC = Integer.toString(decimal);
                Field[1].setText(DEC);
                
                // Converting into Octal
                String OCT = Integer.toOctalString(decimal);
                Field[2].setText(OCT);

                // Converting into Octal
                String BIN = Integer.toBinaryString(decimal);
                Field[3].setText(BIN);
                
            }
        });

        // DEC Mode
        NUM[1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                buttonsContainer.decMode();
            }
        });

        // OCT Mode
        NUM[2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                buttonsContainer.octMode();
            }
        });

        // BIN Mode
        NUM[3].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                buttonsContainer.binMode();
            }
        });


        // HEX.setBounds(0, 50, 50, 50);
        // hexField.setBounds(0, 50, 300, 50);
        // DEC.setBounds(0, 100, 50, 50);
        // decField.setBounds(0, 100, 300, 50);
        // OCT.setBounds(0, 0, 150, 50);
        // octField.setBounds(0, 150, 300, 50);
        // BIN.setBounds(0, 0, 200, 50);
        // binField.setBounds(0, 200, 300, 50);

        String screenText = calculator.screen.getText();
        // System.out.print(screenText);

        buttonGroup.getSelection();
        if (NUM[0].isSelected()) {
            // Screen Text (that's HEX)
            // String screenText = calculator.screen.getText();

            System.out.print(screenText);

            // Converting into Decimal
            String DEC = Integer.toString(Integer.parseInt(screenText,16));
            numberSystemPanel.Field[1].setText(DEC);
        }

        setLayout(new GridLayout(4,2, 1, 1));

 
    }
}
