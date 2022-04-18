// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 11:05 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.25 (Divisible by 3) Write an application that reads an integer and determines and prints
 * whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
 * it’s divided by 3 with a remainder of 0.]
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_2_25 {
    public static void main(String[] args){
        // Initialization of Variables
        int number;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This Application checks if Integer is divisible by 3 or not.");
        // Integer Number
        System.out.print("Enter any Integer: ");
        number = input.nextInt();
        
        // Close Scanner Object
        input.close();
        
        // Divisiblity Check
        if (number % 3 == 0) {
            System.out.print("Number is divible by 3.");
        } else {
            System.out.print("Number is not divible by 3.");
        }
    }
}
