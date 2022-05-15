package calculator;

import java.awt.*;
import javax.swing.*;

public class numberSystemPanel extends JPanel {
    // Decimal screen panel text
    static String decText;

    // Arrays to store Numbers HEX, DEC, OCT, BIN and Error Message
    static String numbers[];

    // awt color
    Color backgroundColor = new Color(44, 44, 44);
    Color foregroundColor = new Color(191, 191, 191);
    Color buttonColor = new Color(60, 60, 60), hoveColor = new Color(166, 166, 166);
    
    // swing components
    static JRadioButton[] NUM = new JRadioButton[4];
    static JTextField[] Field = new JTextField[4];
    static ButtonGroup buttonGroup = new ButtonGroup();   
    
    // constructor
    public numberSystemPanel(JTextField screen){

        // Radio Buttons
        NUM[0] = new JRadioButton("HEX");
        NUM[1] = new JRadioButton("DEC", true);
        NUM[2] = new JRadioButton("OCT");
        NUM[3] = new JRadioButton("BIN");

        // Radio Buttons Action Commands
        NUM[0].setActionCommand("HEX");
        NUM[1].setActionCommand("DEC");
        NUM[2].setActionCommand("OCT");
        NUM[3].setActionCommand("BIN");

        // Text Fields
        for (int i = 0; i < Field.length; i++){
            Field[i] = new JTextField();
        }

        // Default Text
        for (int i = 0; i < Field.length; i++){
            Field[i].setText("0");
        }

        // field.setForeground(foregroundColor);
        // hexField.setOpaque(false);
        // // setForeground(foregroundColor);
        // setBackground(backgroundColor);

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
                // HEX Buttons Setting
                buttonsContainer.hexMode();

                // Changing screen text to HEX Formate
                screen.setText(Field[0].getText());

                // Updating screen
                screensUpdate(screen);
            }
        });

        // DEC Mode
        NUM[1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // DEC Buttons Setting
                buttonsContainer.decMode();

                // Changing screen text to DEC Formate
                screen.setText(Field[1].getText());

                // Updating screen
                screensUpdate(screen);
            }
        });

        // OCT Mode
        NUM[2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // OCT Buttons Setting
                buttonsContainer.octMode();

                // Changing screen text to OCT Formate
                screen.setText(Field[2].getText());

                // Updating screen
                screensUpdate(screen);
            }
        });

        // BIN Mode
        NUM[3].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // BIN Buttons Setting
                buttonsContainer.binMode();

                // Changing screen text to BIN Formate
                screen.setText(Field[3].getText());

                // Updating screen
                screensUpdate(screen);
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




        // if (NUM[0].isSelected()) {
        //     // Screen Text (that's HEX)
        //     // String screenText = calculator.screen.getText();


        //     // Converting into Decimal
        //     String DEC = Integer.toString(Integer.parseInt(screenText,16));
        //     numberSystemPanel.Field[1].setText(DEC);
        // }

        setLayout(new GridLayout(4,2, 1, 1));
 
    }

    // display screen to Number System Panel
    public static void screensUpdate(JTextField screen){
        // text of display screen
        String screenText = screen.getText();
        String dataType = dataTypePanel.getInputSelection();
        int radix = 16, numberSystem = 0;

        if (getSelection() == "HEX") {
            numberSystem = 0;
            radix = 16;
        } else if (getSelection() == "DEC"){
            numberSystem = 1;
            radix = 10;        
        } else if (getSelection() == "OCT"){
            numberSystem = 2;
            radix = 8;
        } else if (getSelection() == "BIN"){
            numberSystem = 3;
            radix = 2;
        }

        // Selected Field Text
        // screenText  = Field[numberSystem].getText();

        if ((dataType.equals("Float") || dataType.equals("Double")) && !screen.getText().contains(".")){
            if (dataType.equals("Float")) {
                numbers = numberSystemUnit.conversion(screenText, "Integer", radix);
            } else {
                numbers = numberSystemUnit.conversion(screenText, "Long", radix);
            }
        } else {
            numbers = numberSystemUnit.conversion(screenText, dataType, radix); 
        }

        // setting converted text to screens
        for (int i = 0; i < Field.length; i++){
            Field[i].setText(numbers[i]);
        }

        // Display Screen Text
        screen.setText(numbers[numberSystem]); // setting HEX Text  
    }

    // Method to return Action command of selected radio button
    public static String getSelection(){        
        // returning action command of selected button
        return buttonGroup.getSelection().getActionCommand();
    }

    // Method to return text of decimal screen panel
    public static String getDECString(){
        // returning action command of selected button
        return Field[1].getText();
    }
}
