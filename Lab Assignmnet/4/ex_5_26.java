// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 5 April, 2022 5:15 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.26 (Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
 * returns the sum of the digits. For example, given the number 7631, the method should return 17.
 * Incorporate the method into an application that reads a value from the user and displays the result.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_26 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number, sum;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Sum of Digits"); 

        // Taking Number Input
        System.out.print("Enter any Integer: ");
        number = input.nextInt(); 

        // closing scanner object
        input.close();

        // calculating digi sum
        sum = digiSum(number);

        // displaying result
        System.out.printf("Sum of Digit: %d", sum);
    }

    // method to calculate sum of digits
    public static int digiSum(int number){
        // variable declaration
        int digit, sum;

        // Variable Initialization
        sum = 0;

        // Looping through all numbers to check if it has factor other than 1 or itself
        while (number != 0){
            digit = (number % 10); // Integer Modolus will fetch last digit
            sum += digit; // Add Last digit in sum
            number /= 10; // Integer Division will eliminate last digit
        }

        // return sum of digits
        return sum;
    } 
}