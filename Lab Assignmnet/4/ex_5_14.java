// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 9:35 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.14 (Floor and Ceil) Write two methods myFloor and myCeil that take a positive double num
 * variable int myFloor(double num) and int myCeil(double num).
 * The myFloor method takes num and returns the largest integer number that is less than or equal to x.
 * The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do
 * not use any Math class methods. Incorporate this method into an application that sends a double
 * value to the functions and tests their ability to calculate the required output.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_14 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        double number;
        int largestInteger, smallestInteger;

        // Scanner Object
        Scanner input = new Scanner(System.in);  
        
        // Banner
        System.out.println("Floor and Ceil Application");

        // Taking Input
        System.out.print("Enter Number (Double Data Type): ");
        number = input.nextDouble();

        // Closing Scanner Object
        input.close();

        // largest integer number that is less than or equal to double number
        largestInteger = myFloor(number);

        // the smallest number that is greater than or equal to double number
        smallestInteger = myCeil(number);
        
        // Displaying result
        System.out.printf("Orignal Number: %f%nLargest Integer Number that is less than or equal to given number: %d%nSmallest Number greater than or equal to given number: %d", number, largestInteger, smallestInteger);
    }

    // method to return largest integer number that is less than or equal to double number
    public static int myFloor(double number){
        // Variable declarations
        int largestInteger;
        
        // rounding number
        largestInteger = (int) number;

        // retuning rounded number
        return largestInteger;    
    }

    // method to return largest integer number that is less than or equal to double number
    public static int myCeil(double number){
        // Variable declarations
        int smallestInteger;
        
        // rounding number
        smallestInteger = (int) number + 1;

        // retuning rounded number
        return smallestInteger;
    }
}