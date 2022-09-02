// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_30 {
    public static void main(String[] args) {
        // Variable Decalration
        int n, a, b;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter the length of base: ");
        n = input.nextInt();

        if (n > 0 && n <= 10) {
            for (a = 0; a < n; a++) { // outer loop to handle number of rows
                for (b = 0; b <= a; b++) { // inner loop to handle number of columns
                    System.out.print("* "); // printing stars
                }
                System.out.println(); // end-line
            }
        } else {
            System.out.println("Base must be between 1 and 10");
            }
        
            // Close Scanner
        input.close();
    }
    
}       

