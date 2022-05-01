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

                // Decimal field text
                decText = Field[1].getText();
                
                // Numbers System Conversions
                numbers = numFactory.intModeConversion(decText, 1);
                
                // Setting converted text to screens
                for (int i = 0; i < Field.length; i++){
                    Field[i].setText(numbers[i]);
                }
                
                // Display Screen Text
                screen.setText(numbers[0]); // setting HEX Text   
            }
        });

        // DEC Mode
        NUM[1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // DEC Buttons Setting
                buttonsContainer.decMode();

                // Decimal field text
                decText = Field[1].getText();
                
                // Numbers System Conversions
                numbers = numFactory.intModeConversion(decText, 1);
                
                // Setting converted text to screens
                for (int i = 0; i < Field.length; i++){
                    Field[i].setText(numbers[i]);
                }
                
                // Display Screen Text
                screen.setText(numbers[1]); // setting DEC Text   
            }
        });

        // OCT Mode
        NUM[2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // OCT Buttons Setting
                buttonsContainer.octMode();

                // Decimal field text
                decText = Field[1].getText();
                
                // Numbers System Conversions
                numbers = numFactory.intModeConversion(decText, 1);
                
                // Setting converted text to screens
                for (int i = 0; i < Field.length; i++){
                    Field[i].setText(numbers[i]);
                }
                
                // Display Screen Text
                screen.setText(numbers[2]); // setting OCT Text   
            }
        });

        // BIN Mode
        NUM[3].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // BIN Buttons Setting
                buttonsContainer.binMode();

                // Decimal field text
                decText = Field[1].getText();
                
                // Numbers System Conversions
                numbers = numFactory.intModeConversion(decText, 1);
                
                // Setting converted text to screens
                for (int i = 0; i < Field.length; i++){
                    Field[i].setText(numbers[i]);
                }
                
                // Display Screen Text
                screen.setText(numbers[3]); // setting BIN Text   
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


        // System.out.print(screenText);


        // if (NUM[0].isSelected()) {
        //     // Screen Text (that's HEX)
        //     // String screenText = calculator.screen.getText();

        //     System.out.print(screenText);

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
        int numberSystem = 0;

        if (buttonGroup.getSelection().getActionCommand() == "HEX") {
            numberSystem = 0;
        } else if (buttonGroup.getSelection().getActionCommand() == "DEC"){
            numberSystem = 1;            
        } else if (buttonGroup.getSelection().getActionCommand() == "OCT"){
            numberSystem = 2;
        } else if (buttonGroup.getSelection().getActionCommand() == "BIN"){
            numberSystem = 3;
        }

        // number conversion
        numbers = numFactory.intModeConversion(screenText, numberSystem);

        // setting converted text to screens
        for (int i = 0; i < Field.length; i++){
            Field[i].setText(numbers[i]);
        }
        
        // Display Screen Text
        screen.setText(numbers[numberSystem]); // setting HEX Text
  
    }
}
