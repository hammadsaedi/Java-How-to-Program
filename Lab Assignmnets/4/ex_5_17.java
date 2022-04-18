// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 2:11 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.17 (Divisible by 5) Write a method isDivisible that uses the remainder operator (%) to determine whether ten input integers are divisible by 5 or not. The method should take an integer argument
 * and return true if the integer is divisible by 5 and false otherwise. Incorporate this method into an
 * application that inputs a sequence of integers (one at a time) and determines the result.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_17 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number;
        boolean isMultiple;
        char choice;

        // Scanner Object
        Scanner input = new Scanner(System.in);          

        // Banner
        System.out.println("Multiple Checker"); 

        // Initialization
        choice = 'y';

        // System Loop
        while (choice == 'y') {

            // Taking numbers input
            System.out.printf("Enter any number (integer): ");
            number = input.nextInt();


            // Checking if number is multiple of five ?
            isMultiple = isMultipleOfFive(number);

            // Displaying result
            System.out.printf("Number is multiple of five: %b%n%n", isMultiple);

            // Ask to continue or quit?
            System.out.printf("Press 'y' to continue: ");
            choice = input.next().charAt(0);
        }

        // Closing Scanner Object
        input.close();
    }

    // method to check if mumber is a multiple of the five or not ?
    public static boolean isMultipleOfFive(int number){
        // Variable declarations
        boolean isMultiple;
        
        // calculating hypotenuse
        isMultiple =  (number % 5 == 0)?true:false;

        // retuning hypotenuse
        return isMultiple;    
    }
}