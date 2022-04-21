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
    static JLabel celsiusLabel, fahrenheitLabel, kelvinLabel; // label
    static JTextField celsiusField, fahrenheitField, kelvinField; // fields
    static JButton clearButton; // button

    // constructor
    temperature(){  
        //creating instance of swing components
        celsiusLabel = new JLabel("Celsius");
        celsiusField = new JTextField(20);
        fahrenheitLabel = new JLabel("Fahrenheit");
        fahrenheitField = new JTextField(20);
        kelvinLabel = new JLabel("Kelvin");
        kelvinField = new JTextField(20);
        clearButton = new JButton("Clear");

        // exit on close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Title Bar
        setTitle("Temperature Converter");
            
        // Adding components in Frame
        add(celsiusLabel);
        add(celsiusField);
        add(fahrenheitLabel);
        add(fahrenheitField);
        add(kelvinLabel);
        add(kelvinField);
        add(clearButton);

        // Setting default values
        celsiusField.setText("0");
        fahrenheitField.setText("32");
        kelvinField.setText("273.15");

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

        // clear button listener (Pressing Enter is required)
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton(evt);
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
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
        fahrenheit = celsius * 1.8 + 32;
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
        celsius = (fahrenheit - 32) * 1.8;
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
        fahrenheit = celsius * 1.8 + 32;

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