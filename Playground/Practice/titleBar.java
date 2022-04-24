// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 23 April 2022 1:00 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// layout is too messy


import java.awt.*;
import javax.swing.*;

public class titleBar extends JPanel {
    /* declaration of class level variables */
    // swing components
    private static JFrame window = new JFrame(); // frame (Window)
    private JPanel crossPanel, minimizePanel; // button containers
    private hButton crossButton, minimizeButton; // buttons

    // main method
    public static void main(String[] args){
        // creating instance of title bar (constructor method)
        titleBar titleBar = new titleBar();
        
        /* Window customizations */
        // // removing default title bar
        window.setUndecorated(true);
        // adding title bar in window (JFrame)
        window.add(titleBar);
        // setting window (JFrame) visible
        window.setVisible(true);
        // terminate program on after window closure
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
        // packing JFrame
        window.pack();
    }

    // constructor method
    public titleBar(){
        /* creating instance of swing components */
        // Button Containers
        crossPanel = new JPanel();
        minimizePanel = new JPanel();
        // Buttons
        crossButton = new hButton("X", window);
        minimizeButton = new hButton("_", window);


        /* adding swing components */
        // Adding Cross Panel and Minimize Panel in Title Bar Panel
        add(minimizePanel);
        add(crossPanel);

        // Adding Buttons in their containers
        crossPanel.add(crossButton);
        minimizePanel.add(minimizeButton);


        /* Button action listeners and corresponding actions */
        // cross button listener
        crossButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                window.dispose();
            }
        });

        // minimizer button listener
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                window.setState(JFrame.ICONIFIED);
            }
        });

        /* Title bar customization*/
        setLayout((new GridLayout(1,2, 0, 0)));
    }
}