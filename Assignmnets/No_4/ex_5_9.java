// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 8:40 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 5.9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
 * double y = Math.floor(x + 0.5);
 * will round the number x to the nearest integer and assign the result to y. Write an application that
 * reads double values and uses the preceding statement to round each of the numbers to the nearest
 * integer. For each number processed, display both the original number and the rounded number.
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_9 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        double number, roundedNumber;

        // Scanner Object
        Scanner input = new Scanner(System.in);  
        
        // Banner
        System.out.println("Round Number up to nearest integer.");

        // Taking Input
        System.out.print("Enter Number (Double Data Type): ");
        number = input.nextDouble();

        // Closing Scanner Object
        input.close();

        // Rounding Double up to Integer
        roundedNumber = roundToInteger(number);
        
        // Displaying result
        System.out.printf("Orignal Number: %f%nRounded Number: %f", number, roundedNumber);
    }

    // method to round double to nearest integer
    public static double roundToInteger(double number){
        // Variable declarations
        double roundedNumber;
        
        // rounding number
        roundedNumber = Math.floor(number + 0.5);

        // retuning rounded number
        return roundedNumber;    
    }
}