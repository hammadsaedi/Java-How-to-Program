// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)


// Import the Scanner class
import java.util.Scanner;

public class ex_3_21 {
  public static void main(String[] args) {
        // Declaration of variables
        int largest = 0;
        
        // Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Ten times iterations
        for (int i = 1; i <= 10; i++ ) {
            // Taking Input
            System.out.print("Enter a number: " );
            int number= input.nextInt();
            
            // Checking Largest Number
            if (number >= largest ) {
                largest = number;
            }
        }

        // Displaying result
        System.out.printf("The largest number is %d", largest);
        
        // Closing Scanner Object
        input.close();
    } 
}