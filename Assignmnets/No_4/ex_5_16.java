// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 1:30 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
 * second integer is a multiple of the first. The method should take two integer arguments and return
 * true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
 * Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
 * time) and determines whether the second value in each pair is a multiple of the first. 
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_16 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number1, number2;
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
            System.out.printf("Enter first number (integer): ");
            number1 = input.nextInt();
            System.out.printf("Enter second number (integer): ");
            number2 = input.nextInt();

            // Checking if the second mumber is a multiple of the first number ?
            isMultiple = isMultiple(number1, number2);

            // Displaying result
            System.out.printf("The second mumber is a multiple of the First number: %b%n%n", isMultiple);

            // Ask to continue or quit?
            System.out.printf("Press 'y' to continue: ");
            choice = input.next().charAt(0);
        }

        // Closing Scanner Object
        input.close();
    }

    // method to check if the second mumber is a multiple of the first number ?
    public static boolean isMultiple(int number1, int number2){
        // Variable declarations
        boolean isMultiple;
        
        // calculating hypotenuse
        isMultiple =  (number2 % number1 == 0)?true:false;

        // retuning hypotenuse
        return isMultiple;    
    }
}