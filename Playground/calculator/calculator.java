package calculator;

import java.awt.*;
import javax.swing.*;


public class calculator extends JFrame{
    // buttons container
    buttonsContainer container;
    public static display screen;

    // constructor
    calculator(){
        // screen
        screen = new display();
        // button container
        container = new buttonsContainer(screen); 

        // adding components in calculator
        add(screen);
        add(container);

        
        // absolute sizing
        screen.setBounds(0, 0, 330, 50);
        container.setBounds(0, 50, 330, 430);

        // calculator (JFrame) design
        // setLayout(new FlowLayout());
        // setLayout(new GridLayout(2,1, 0, 0));

        setLayout(null);

        // getContentPane();  
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(350, 550);  
        // pack();
    }

    // main method
    public static void main(String[] args) {
        // creating instance of calculator
        new calculator();
    }
    
}
