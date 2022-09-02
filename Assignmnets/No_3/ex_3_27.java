// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_27 {
    public static void main(String[] args) {
        // Variable Decalration
        int x, y;

        // Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Taking input
        // x
        System.out.print("Enter a number: ");
        x = input.nextInt();
        // y
        System.out.print("Enter a number: ");
        y = input.nextInt();
        
        // Checking condition
        if (x > 5) {
            if (y > 5)
                System.out.println("x and y are > 5");
        } else
            System.out.println("x is <= 5");
        
        // Close Scanner
        input.close();
    }       
}    

