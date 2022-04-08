// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 1:10 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them
 * from the user and prints the square of each, the sum of their squares, and the difference of the squares
 * (first number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_2_15 {
    public static void main(String[] args){
        // Initialization of Variables
        int number1, number2;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This Application computes and print Squares, Sum of Squares and Differences of Square of Two Integers.");
        // First Number
        System.out.print("Enter any Integer: ");
        number1 = input.nextInt();
        // Second Number
        System.out.print("Enter another Integer: ");
        number2 = input.nextInt();

        // Close Scanner Object
        input.close();
        
        // Computing and Storing results in variables
        // Square of Numbers
        double squareNumber1 = Math.pow(number1,2); // Math.pow(i,j) is supported for double data type
        double squareNumber2 = Math.pow(number2,2);
        // Sum of Square
        double sqaureSum = squareNumber1 + squareNumber2;
        // Difference of Square
        double sqaureDiff = squareNumber1 - squareNumber2;

        // Printing Result
        System.out.printf("Sqaure of First Number: %f%nSqaure of Second Number: %f%nSum of squares: %f%nDifference of squares: %f%n",squareNumber1,squareNumber2,sqaureSum,sqaureDiff);
        
    }
}