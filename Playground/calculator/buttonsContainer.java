package calculator;

import java.awt.*;
import javax.swing.*;

public class buttonsContainer extends JPanel {
    private static final long serialVersionUID = 1L;

    // numeric buttons
    static private inputButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonA, buttonB, buttonC, buttonD, buttonE, buttonF;

    // color
    
    // constructor
    public buttonsContainer(JTextField screen){
        // numeric buttons
        button0 = new inputButton("0", screen);
        button1 = new inputButton("1", screen);
        button2 = new inputButton("2", screen);
        button3 = new inputButton("3", screen);
        button4 = new inputButton("4", screen);
        button5 = new inputButton("5", screen);
        button6 = new inputButton("6", screen);
        button7 = new inputButton("7", screen);
        button8 = new inputButton("8", screen);
        button9 = new inputButton("9", screen);
        buttonA = new inputButton("A", screen);
        buttonB = new inputButton("B", screen);
        buttonC = new inputButton("C", screen);
        buttonD = new inputButton("D", screen);
        buttonE = new inputButton("E", screen);
        buttonF = new inputButton("F", screen);

        // adding buttons in buttons container
        add(buttonA);
        add(button7);
        add(button8);
        add(button9);
        add(buttonB);
        add(button4);
        add(button5);
        add(button6);
        add(buttonC);
        add(button1);
        add(button2);
        add(button3);
        add(buttonD);
        add(buttonE);
        add(buttonF);
        add(button0);

        // button container designing
        setBackground(Color.BLACK);
        setLayout(new GridLayout(4,4, 1, 1));
    }
}
