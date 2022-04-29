package calculator;

import java.awt.*;
import javax.swing.*;

public class buttonsContainer extends JPanel {
    private static final long serialVersionUID = 1L;

    // numeric buttons
    static inputButton[] button = new inputButton[16]; 
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
        
        // button container designing
        setBackground(Color.BLACK);
        setLayout(new GridLayout(6,3, 1, 1));
        hexMode();
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
            System.out.print(i);
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

}
