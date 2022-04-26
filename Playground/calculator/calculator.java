package calculator;

import java.awt.*;
import javax.swing.*;


public class calculator extends JFrame{
    // buttons container
    buttonsContainer container;
    display screen;

    // constructor
    calculator(){
        // button container
        container = new buttonsContainer(this);
        // screen
        screen = new display();

        // adding components in calculator
        add(screen);
        add(container);
        
        // absolute sizing
        screen.setBounds(0, 0, 400, 50);
        container.setBounds(100, 100, 100, 100);

        // calculator (JFrame) design
        // setLayout(new FlowLayout());
        // setLayout(new GridLayout(2,1, 0, 0));

        // getContentPane();  
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 300);  
        // pack();
    }

    // main method
    public static void main(String[] args) {
        // creating instance of calculator
        new calculator();
    }
    
}
