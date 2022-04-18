// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 3:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.16 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
 * it from the user and displays whether the number and its square are greater than, equal to, not equal
 * to, or less than the number 100. Use the techniques shown in Fig. 2.15.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_2_16 {
    public static void main(String[] args) {
        // Initialization of Variables
        int number;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This applications compares Integer Number and Its Square with 100 and dsiplays results");
        // Iteger Number
        System.out.print("Enter any Integer: ");
        number = input.nextInt();

        // Close Scanner Object
        input.close();

        // Computing square
        double square = Math.pow(number, 2);

        // Conditional Construct
        if (number > 100 && square > 100) { // Logical AND; True, if both are true
            System.out.println("Number and Its Square are greater than to 100");
        } else if (number == 100 && square == 100) {
            System.out.println("Number and Its Square are equal than to 100"); // Not Possible
        } else if (number < 100 && number < 100) {
            System.out.println("Number and Its Square are less than to 100");
        } // Number and Square Both can be either greater or equal or less than 100; not
          // at a time. But, they can be not equal to and greater than or less than 100
        if (number != 100 && number != 100) {
            System.out.println("Number and Its Square are not equal than to 100");
        }

    }
}
