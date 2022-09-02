// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 4:16 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
 * and prints the largest and smallest integers in the group. Use only the programming techniques you
 * learned in this chapter
 */
// Logical Operators are not discuused in this chanpter


package Assignmnets.No_2;

// Import the Scanner class
import java.util.Scanner;

public class ex_2_24 {
    public static void main(String[] args) {
        // Initialization of Variables
        int number1, number2, number3, number4, number5, largest, smallest;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This applications compares Five Integer Number dsiplays Largest and Smallest among them.");
        // First Number
        System.out.print("Enter any Integer: ");
        number1 = input.nextInt();
        // Second Number
        System.out.print("Enter another Integer: ");
        number2 = input.nextInt();
        // Third Number
        System.out.print("Enter another Integer: ");
        number3 = input.nextInt();
        // Fourth Number
        System.out.print("Enter another Integer: ");
        number4 = input.nextInt();
        // Fifth Number
        System.out.print("Enter another Integer: ");
        number5 = input.nextInt();

        // Close Scanner Object
        input.close();    
        
        // Comparing for Largest Number
        if (number1 > number2){
            if (number1 > number3){
                if (number1 > number4){
                    if (number1 > number5){
                        largest = number1;
                    } else {
                        largest = number5;
                    }
                } else if(number4 > number5){
                    largest = number4;

                } else {
                    largest = number5;
                }
            } else if (number3 > number4){
                if (number3 > number5){
                    largest = number3;
                } else {
                    largest = number5;
                }
            } else if (number4 > number5){
                largest = number4;
            } else {
                largest = number5;
            }
        } else if(number2 > number3){
            if (number2 > number4){
                if (number2 > number5){
                    largest = number2;
                } else {
                    largest = number5;
                }
            } else if (number4 > number5){
                largest = number4;
            } else {
                largest = number5;
            }
        } else if (number3 > number4){
            if (number3 > number5){
                largest = number3;
            } else {
                largest = number5;
            }
        } else if (number4 > number5){
            largest = number4;
        } else{
            largest = number5;
        }


        // Comparing for Smallest
        if (number1 < number2){
            if (number1 < number3){
                if (number1 < number4){
                    if (number1 < number5){
                        smallest = number1;
                    } else {
                        smallest = number5;
                    }
                } else if(number4 < number5){
                    smallest = number4;

                } else {
                    smallest = number5;
                }
            } else if (number3 < number4){
                if (number3 < number5){
                    smallest = number3;
                } else {
                    smallest = number5;
                }
            } else if (number4 < number5){
                smallest = number4;
            } else {
                smallest = number5;
            }
        } else if(number2 < number3){
            if (number2 > number4){
                if (number2 < number5){
                    smallest = number2;
                } else {
                    smallest = number5;
                }
            } else if (number4 < number5){
                smallest = number4;
            } else {
                smallest = number5;
            }
        } else if (number3 < number4){
            if (number3 < number5){
                smallest = number3;
            } else {
                smallest = number5;
            }
        } else if (number4 < number5){
            smallest = number4;
        } else{
            smallest = number5;
        }

        // Displaying Results
        System.out.println("Largest: " + largest + "\n" + "Smallest: " + smallest);
    }
}