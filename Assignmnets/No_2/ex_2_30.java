// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 3:58 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
 * separated from one another by three spaces each. For example, if the user types in the number 42339,
 * the program should print
 * 4 2 3 3 9
 *  Assume that the user enters the correct number of digits. What happens when you enter a
 * number with more than five digits? What happens when you enter a number with fewer than five
 * digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
 * need to use both division and remainder operations to “pick off” each digit.]
*/

package Assignmnets.No_2;

// Import the Scanner class
import java.util.Scanner;

public class ex_2_30 {
    public static void main(String[] args){ 
        // Initialization of Variables
        int number, digit1, digit2,digit3,digit4,digit5;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This Application split 5 digits by three spaces.");
        // Five Digit Number
        System.out.print("Enter five digit number: ");
        number = input.nextInt();  
        
        // Close Scanner Object
        input.close();

        // Computing Numbers (Integer Division)
        digit1 = number / 10000;
        digit2 = number / 1000 % 10;
        digit3 = (number / 100) % 10;
        digit4 = number / 10 % 10;
        digit5 = number / 1 % 10;

        // Displaying result
        System.out.printf("%d   %d   %d   %d   %d",digit1,digit2,digit3,digit4,digit5);
    }
}