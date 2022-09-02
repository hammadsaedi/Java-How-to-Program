// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 9:15 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 5.10 (Rounding Numbers) To round numbers to specific decimal places, use a statement like
 * double y = Math.floor(x * 10 + 0.5) / 10;
 * which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
 * double y = Math.floor(x * 100 + 0.5) / 100;
 * which rounds x to the hundredths position (i.e., the second position to the right of the decimal
 * point). Write an application that defines four methods for rounding a number x in various ways:
 * a) roundToInteger(number)
 * b) roundToTenths(number)
 * c) roundToHundredths(number)
 * d) roundToThousandths(number)
 * For each value read, your program should display the original value, the number rounded to the
 * nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest hundredth and the number rounded to the nearest thousandth.
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_10 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        double number, roundedNumToInteger, roundedNumToTenths,roundedNumToHundredths,roundedNumToThousandths;

        // Scanner Object
        Scanner input = new Scanner(System.in);      
        
        // Banner
        System.out.println("Application to Round Numbers up to 3 decimal places");

        // Taking Input
        System.out.print("Enter Number (Double Data Type): ");
        number = input.nextDouble();

        // Closing Scanner Object
        input.close();

        // Rounding Double up to nearest integer
        roundedNumToInteger = roundToInteger(number);
        // Rounding Double up to 10th integer
        roundedNumToTenths = roundToTenths(number);
        // Rounding Double up to 100th integer
        roundedNumToHundredths = roundToHundredths(number);
        // Rounding Double up to 1000th integer
        roundedNumToThousandths = roundToThousandths(number);
  
        // Displaying result
        System.out.printf("Orignal Number: %f%nRounded Number up to nearest integer: %f%nRounded Number up to 10th integer: %f%nRounded Number up to 100th integer: %f%nRounded Number up to 1000th integer: %f%n", number, roundedNumToInteger, roundedNumToTenths, roundedNumToHundredths, roundedNumToThousandths);
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

    // method to round double to tenth integer
    public static double roundToTenths(double number){
        // Variable declarations
        double roundedNumber;
        
        // rounding number
        roundedNumber = Math.floor(number*10 + 0.5) / 10;

        // retuning rounded number
        return roundedNumber;    
    }

    // method to round double to hundredth integer
    public static double roundToHundredths(double number){
        // Variable declarations
        double roundedNumber;
        
        // rounding number
        roundedNumber = Math.floor(number * 100 + 0.5) / 100;

        // retuning rounded number
        return roundedNumber;    
    }

    // method to round double to thousandth integer
    public static double roundToThousandths(double number){
        // Variable declarations
        double roundedNumber;
        
        // rounding number
        roundedNumber = Math.floor(number * 1000 + 0.5) / 1000;

        // retuning rounded number
        return roundedNumber;    
    }
}