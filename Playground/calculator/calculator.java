package calculator;

import java.awt.*;
import javax.swing.*;

public class calculator extends JFrame{
    // buttons container
    display screen = new display();
    buttonsContainer container = new buttonsContainer(screen);
    numberSystemPanel numbers = new numberSystemPanel(screen);

    // constructor
    calculator(){

        // adding components in calculator
        add(screen);
        add(numbers);
        add(container);

        
        // absolute sizing
        screen.setBounds(0, 0, 330, 50);
        numbers.setBounds(0, 55, 330, 125);
        container.setBounds(0, 180, 330, 300);

        // new numberSystemConversion();

        // calculator (JFrame) design
        // setLayout(new FlowLayout());

        setLayout(null);

        setUndecorated(true);
        setBackground(new Color(1.0f,1.0f,1.0f,0.5f));

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
