package calculator;

import java.awt.*;
import javax.swing.*;

public class buttonsContainer extends JPanel {
    private static final long serialVersionUID = 1L;

    // numeric buttons
    static inputButton[] button = new inputButton[16]; 
    static inputButton signButton, decimalButton;
    // color
    
    // constructor
    public buttonsContainer(JTextField screen){
        // creating buttons
        for (int i = 0; i < button.length; i++){
            button[i] = new inputButton(Integer.toHexString(i), screen);
        }

        // adding buttons
        for (int i = button.length - 1; i >= 0; i--){
            add(button[i]);
        }
        
        signButton = new inputButton("-", screen);
        add(signButton);
        decimalButton = new inputButton(".", screen);
        add(decimalButton);

        // button container designing
        setBackground(Color.BLACK);
        setLayout(new GridLayout(6,3, 1, 1));
        setOpaque(false);

        // default
        decMode();
        intMode();
    }

    public static void hexMode(){
        for (int i = 0; i < button.length; i++){
            button[i].setEnabled(true);
            // System.out.print(i);
        }
    }

    public static void decMode(){
        for (int i = button.length -1; i > 9; i--){
            button[i].setEnabled(false);
        }
        for (int i = 0; i <= 9; i++){
            button[i].setEnabled(true);
        }
    }

    public static void octMode(){
        for (int i = button.length -1; i > 7; i--){
            button[i].setEnabled(false);
        }
        for (int i = 0; i <= 7; i++){
            button[i].setEnabled(true);
        }
    }

    public static void binMode(){
        for (int i = button.length - 1; i > 1; i--){
            button[i].setEnabled(false);
        }
    }

    public static void floatMode(){
        decimalButton.setEnabled(true);
    }

    public static void intMode(){
        decimalButton.setEnabled(false);
    }
}
