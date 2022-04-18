// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

// Import the Scanner class
import java.util.Scanner;

public class ex_3_28_b {
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
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
            } else {
                System.out.println("#####");
            System.out.println("$$$$$");
        }
        
        // Close Scanner
        input.close();
    }       
}    

