package calculator;

import javax.swing.*;

public class dataTypePanel extends JMenuBar{
    // swing components
    JMenu inputMenu = new JMenu("Input"), outputMenu = new JMenu("Output");
    JRadioButtonMenuItem[] inputType = new JRadioButtonMenuItem[6], outputType = new JRadioButtonMenuItem[6];
    static ButtonGroup inputGroup = new ButtonGroup(), outputGroup = new ButtonGroup();   


    // constructor
    dataTypePanel(JTextField screen){
        // Input Type Menu Items
        inputType[0] = new JRadioButtonMenuItem("Byte");
        inputType[1] = new JRadioButtonMenuItem("Short");
        inputType[2] = new JRadioButtonMenuItem("Integer", true);
        inputType[3] = new JRadioButtonMenuItem("Long");
        inputType[4] = new JRadioButtonMenuItem("Float");
        inputType[5] = new JRadioButtonMenuItem("Double");
        
        // Output Type Menu Items
        outputType[0] = new JRadioButtonMenuItem("Byte");
        outputType[1] = new JRadioButtonMenuItem("Short");
        outputType[2] = new JRadioButtonMenuItem("Integer");
        outputType[3] = new JRadioButtonMenuItem("Long");
        outputType[4] = new JRadioButtonMenuItem("Float");
        outputType[5] = new JRadioButtonMenuItem("Double");

        // Setting Action Commands
        // For Input Radio Button 
        inputType[0].setActionCommand("Byte");
        inputType[1].setActionCommand("Short");
        inputType[2].setActionCommand("Integer");
        inputType[3].setActionCommand("Long");
        inputType[4].setActionCommand("Float");
        inputType[5].setActionCommand("Double");
        // For Output Radio Buttons
        // Setting Action Commands
        outputType[0].setActionCommand("Byte");
        outputType[1].setActionCommand("Short");
        outputType[2].setActionCommand("Integer");
        outputType[3].setActionCommand("Long");
        outputType[4].setActionCommand("Float");
        outputType[5].setActionCommand("Double");

        // Adding input type menu items 
        for (int i = 0; i < inputType.length; i++){
            inputMenu.add(inputType[i]); // adding in input menu
            inputGroup.add(inputType[i]); // adding in button group
        }

        // Adding output type menu items 
        for (int i = 0; i < outputType.length; i++){
            outputMenu.add(outputType[i]); // adding in input menu
            outputGroup.add(outputType[i]); // adding in button group
        }

        // adding menu in menu bar
        add(inputMenu);
        add(outputMenu);

        // Integer Mode
        for (int i = 0; i < inputType.length - 2; i++){
            inputType[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // Integer Mode
                    buttonsContainer.intMode();
    
                    // Updating screen
                    numberSystemPanel.screensUpdate(screen);
                }
            });
        }

        // Integer Mode
        for (int i = inputType.length - 1; i > inputType.length - 3; i--){
            inputType[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // Integer Mode
                    buttonsContainer.floatMode();
    
                    // Updating screen
                    numberSystemPanel.screensUpdate(screen);
                }
            });
        }
        
        
        
    }

    // method to return selected input radio button
    public static String getInputSelection(){
        // returning action command of selected input button
        return  inputGroup.getSelection().getActionCommand();
    }

    // method to return selected output radio button
    public static String getOutputSelection(){
        // returning action command of selected input button
        return  inputGroup.getSelection().getActionCommand();
    }
}
