// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 21 April 2022 11:35 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * (Swing GUI) Temperatures Convertor
 * - Celsius
 * - Fahrenheit
 *  -Kelvin
*/

import javax.swing.*;
import java.awt.*;

public class temperature extends JFrame {  
    // swing components
    static JPanel panel1, panel2, panel3;
    static JLabel celsiusLabel, fahrenheitLabel, kelvinLabel; // label
    static JTextField celsiusField, fahrenheitField, kelvinField; // fields
    static JButton clearButton, closeButton; // button

    // color
    static Color black = new Color(0, 0, 0);
    static Color white = new Color(255, 255, 255);
    static Color buttonColor = new Color(60, 59, 57);
    static Color hoverColor = new Color(166, 166, 166);

    // constructor
    temperature(){  
        //creating instance of swing components
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        celsiusLabel = new JLabel("Celsius"); 
        celsiusField = new JTextField(20);
        fahrenheitLabel = new JLabel("Fahrenheit");
        fahrenheitField = new JTextField(20);
        kelvinLabel = new JLabel("Kelvin");
        kelvinField = new JTextField(20);
        clearButton = new JButton("Clear");
        closeButton = new JButton("X");
        // exit on close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Title Bar
        setTitle("Temperature Converter");
            
        // Adding panel in Frame
        add(panel1);

        // Adding components in Panel
        panel1.add(panel2);
        panel1.add(closeButton);
        panel1.add(celsiusLabel);
        panel1.add(celsiusField);
        panel1.add(fahrenheitLabel);
        panel1.add(fahrenheitField);
        panel1.add(kelvinLabel);
        panel1.add(kelvinField);
        panel1.add(panel3);
        panel1.add(clearButton);
        

        // Alignment
        celsiusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        fahrenheitLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        kelvinLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // button
        clearButton.setFocusPainted(false);
        clearButton.setBorderPainted(false);
        clearButton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        closeButton.setFocusPainted(false);
        closeButton.setBorderPainted(false);
        closeButton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        // fields
        celsiusField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        fahrenheitField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        kelvinField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        

        // Setting default values
        celsiusField.setText("0");
        fahrenheitField.setText("32");
        kelvinField.setText("273.15");
        
        
        // -------------- Event Listeners ------------------------

        // celsius field text listener (Pressing Enter is required)
        celsiusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusField(evt);
            }
        });

        // fahrenheit field text listener (Pressing Enter is required)
        fahrenheitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitField(evt);
            }
        });

        // kelvin field text listener (Pressing Enter is required)
        kelvinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelvinField(evt);
            }
        });

        // clear button listener
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton(evt);
            }
        });

        // close button listener
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                dispose();
            }
        });


        // hover effect
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearButton.setForeground(black);
                clearButton.setBackground(hoverColor);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearButton.setBackground(buttonColor);
                clearButton.setForeground(white);
            }
        });

        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButton.setForeground(black);
                closeButton.setBackground(Color.RED);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButton.setBackground(buttonColor);
                closeButton.setForeground(white);
                // clearButton.setBackground(UIManager.getColor("control"));
            }
        });


        // -------------- Design ------------------------
        panel1.setBackground(black);
        panel2.setBackground(buttonColor);
        panel3.setBackground(black);

        celsiusLabel.setForeground(white);
        celsiusField.setBackground(black);
        celsiusField.setForeground(white);
        
        fahrenheitLabel.setForeground(white);
        fahrenheitField.setBackground(black);
        fahrenheitField.setForeground(white);
        
        kelvinLabel.setForeground(white);
        kelvinField.setBackground(black);
        kelvinField.setForeground(white);

        clearButton.setBackground(buttonColor);
        clearButton.setForeground(white);

        closeButton.setBackground(buttonColor);
        closeButton.setForeground(white);

        panel1.setLayout(new GridLayout(5,2, 0, 0));
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);

        // setVisible(true);
        pack();
    }  

    // method to listen celsius field
    private void celsiusField(java.awt.event.ActionEvent evt){
        // variable declaration
        double celsius, fahrenheit, kelvin;
        String text;

        // fetching and storing written text on screen
        text = celsiusField.getText(); 

        // converting text into double
        celsius = Double.parseDouble(text);
        
        // temperature conversion
        fahrenheit = celsius * (9.0/5.0) + 32;
        kelvin = celsius + 273.15;

        // String for casting
        text = "" + fahrenheit;

        // displaying on for text field
        fahrenheitField.setText(text);

        // String for kelvin casting
        text = "" + kelvin;

        // displaying on kelvin text field
        kelvinField.setText(text);
    }

    // method to listen fahrenheit field
    private static void fahrenheitField(java.awt.event.ActionEvent evt){
        // variable declaration
        double celsius, fahrenheit, kelvin;
        String text;

        // fetching and storing written text on screen
        text = fahrenheitField.getText(); 

        // converting text into double
        fahrenheit = Double.parseDouble(text);
        
        // temperature conversion
        celsius = (fahrenheit - 32) * (5.0/9.0);
        kelvin = celsius + 273.15;

        // String for celsius casting
        text = "" + celsius;

        // displaying on celsius text field
        celsiusField.setText(text);

        // String for kelvin casting
        text = "" + kelvin;

        // displaying on kelvin text field
        kelvinField.setText(text);
    }

    // method to listen kelvin field
    private static void kelvinField(java.awt.event.ActionEvent evt){
        // variable declaration
        double celsius, fahrenheit, kelvin;
        String text;

        // fetching and storing written text on screen
        text = kelvinField.getText(); 

        // converting text into double
        kelvin = Double.parseDouble(text);
        
        // temperature conversion
        celsius = kelvin - 273.15;
        fahrenheit = celsius * (9.0/5.0) + 32;

        // String casting for celsius
        text = "" + celsius;

        // displaying on celsius text field
        celsiusField.setText(text);

        // String casting for fahrenheit
        text = "" + fahrenheit;

        // displaying on fahrenheit text field
        fahrenheitField.setText(text);
    }

    // method to listen clear button
    private static void clearButton(java.awt.event.ActionEvent evt){
        // Setting default values
        celsiusField.setText("0");
        fahrenheitField.setText("32");
        kelvinField.setText("273.15");
    }

    // main method
    public static void main(String[] args) {  
        // calling constructor
        new temperature();  
    }  
}  