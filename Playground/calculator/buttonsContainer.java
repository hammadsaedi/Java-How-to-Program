package calculator;

import java.awt.*;
import javax.swing.*;

public class buttonsContainer extends JPanel{
    // numeric buttons
    static private hButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    // color
    
    // constructor
    public buttonsContainer(JFrame window){
        // numeric buttons
        button0 = new hButton("0", window);
        button1 = new hButton("1", window);
        button2 = new hButton("2", window);
        button3 = new hButton("3", window);
        button4 = new hButton("4", window);
        button5 = new hButton("5", window);
        button6 = new hButton("6", window);
        button7 = new hButton("7", window);
        button8 = new hButton("8", window);
        button9 = new hButton("9", window);

        // adding buttons in buttons container
        add(button7);
        add(button8);
        add(button9);
        add(button4);
        add(button5);
        add(button6);
        add(button1);
        add(button2);
        add(button3);
        add(button0);

        // button container designing
        setBackground(Color.BLACK);
        setLayout(new GridLayout(4,3, 1, 1));
    }
}
