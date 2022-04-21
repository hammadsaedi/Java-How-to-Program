import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JLabel nameLabel, emailLabel, phoneLabel;
    private JTextField nameTextField, emailTextField, phoneTextField;
    private JButton enterButton, saveButton;
    
    public MyFrame(){
        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        phoneLabel = new JLabel("Phone:");

        nameTextField = new JTextField(20);
        emailTextField = new JTextField(20);
        phoneTextField = new JTextField(20);

        enterButton =  new JButton("Enter"); 
        saveButton =  new JButton("Save"); 

        // adds
        add(nameLabel);
        add(nameTextField);

        add(emailLabel);
        add(emailTextField);

        add(phoneLabel);
        add(phoneTextField);

        add(enterButton);
        add(saveButton);

        setLayout(new FlowLayout());

    }
    public static void main(String[] args){
        MyFrame aFrame = new MyFrame();
        aFrame.setVisible(true);
        aFrame.pack();
    } 
    
}
