// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 4:28 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and
 * the number of zeros input.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_2_32 {
    public static void main(String[] args){ 
        // Initialization of Variables
        int number1, number2, number3, number4, number5, negative, positive, zero;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This Application tells the number of negative numbers input, the number of positive numbers input and the number of zeros input.");
        // First Number
        System.out.print("Enter any integer: ");
        number1 = input.nextInt();  
        // Second Number
        System.out.print("Enter another integer: ");
        number2 = input.nextInt(); 
        // Third Number
        System.out.print("Enter another integer: ");
        number3 = input.nextInt(); 
        // Forth Number
        System.out.print("Enter another integer: ");
        number4 = input.nextInt(); 
        // Fifth Number
        System.out.print("Enter another integer: ");
        number5 = input.nextInt();
        
        // Close Scanner Object
        input.close();

        // Assigning Value to variable
        positive = 0;
        negative = 0;
        zero = 0;

        // Computing Negative, Positive and Zero Entries
        // First Number
        if (number1 > 0){
            positive += 1;
        } else if (number1 < 0){
            negative += 1;
        } else {
            zero += 1;
        }
        // Second Number
        if (number2 > 0){
            positive += 1;
        } else if (number2 < 0){
            negative += 1;
        } else {
            zero += 1;
        }
        // Third Number
        if (number3 > 0){
            positive += 1;
        } else if (number3 < 0){
            negative += 1;
        } else {
            zero += 1;
        }
        // Fourth Number
        if (number4 > 0){
            positive += 1;
        } else if (number4 < 0){
            negative += 1;
        } else {
            zero += 1;
        }
        // Fifth Number
        if (number5 > 0){
            positive += 1;
        } else if (number5 < 0){
            negative += 1;
        } else {
            zero += 1;
        }

        // Displaying result
        System.out.printf("Positive Input: %d%nNegative Input: %d%nZero Input: %d%n",positive,negative,zero);
    }
}