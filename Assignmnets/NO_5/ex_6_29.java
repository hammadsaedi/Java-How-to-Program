// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 17 April 2022 4:40 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.29 (Fibonacci Series) The Fibonacci series
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, …
 * begins with the terms 0 and 1 and has the property that each succeeding term is the sum of the two
 * preceding terms.
 * a) Write a method fibonacci(n) that calculates the nth Fibonacci number. Incorporate
 * this method into an application that enables the user to enter the value of n.
 * b) Determine the largest Fibonacci number that can be displayed on your system.
 * c) Modify the application you wrote in part (a) to use double instead of int to calculate
 * and return Fibonacci numbers, and use this modified application to repeat part (b).
*/

package Assignmnets.NO_5;

// Importing Arrays class 
import java.util.Arrays;
// Importing Scanner class 
import java.util.Scanner;

public class ex_6_29 {
    // array to store fibonacci numbers (Integer Typed)
    public static int[] integerFibonacci = new int[0];
    // array to store fibonacci number (Double Typed)
    public static double[] doubleFibonacci = new double[0]; 

    // Main method
    public static void main(String args[]) {
        // variable declaration
        int choice, integerN;
        double doubleN;

        // Creating Scanner Object
        Scanner input = new Scanner(System.in);

        // Banner
        System.out.println("Fibonacci Series");

        do {
            // Taking Input
            System.out.println("Press 1 for checking nth fibonacci numbers in (integer data type)");
            System.out.println("Press 2 for checking nth fibonacci numbers in (double data type)");
            choice = input.nextInt();
            
            // 
            if (choice == 1) {
                // Taking Input
                System.out.print("Enter value of n to find nth fibonacci number (integer data type): ");
                // Taking Input
                integerN = input.nextInt();
                // Displaying results
                System.out.printf("%dth Fibonacci Number: %d%n",integerN, fibonacci(integerN));
                // Bonus Output
                System.out.printf("Fibonacci Series Up to %dth Number: %n%s%n",integerN, Arrays.toString(integerFibonacci));
            } else if (choice == 2){
                System.out.print("Enter value of n to find nth fibonacci number (double data type): ");
                doubleN = input.nextDouble();
                // Displaying results
                System.out.printf("%dth Fibonacci Number: %f%n", (int) doubleN, fibonacci(doubleN)); // Rounding Double Number to remove digits after decimals 
                // Bonus Output
                System.out.printf("Fibonacci Series Up to %dth Number: %n%s%n",(int) doubleN, Arrays.toString(doubleFibonacci));
            }
        } while (choice != 1 && choice != 2); // In Case of wrong input choice
        
        
        // Closing Scanner Object
        input.close();
	}

    // method to return nth fibonacci (Integer Typed)
	public static int fibonacci(int n) {
        // variable declarations
        int index, nth, firstNumber, secondNumber;

        // Starting from 0, 1
        firstNumber = 0;
        secondNumber = 1;

        // Initialization
        nth = -1;
        
        // fibonacci numbers
        if (n == 1){ // first fibonacci numbers
            nth = 0;
            // storing fibonacci numbers in array
            integerFibonacci = append(integerFibonacci, 0);
        } else if (n == 2) { // second fibonacci numbers
            nth = 1;
            // storing fibonacci numbers in array
            integerFibonacci = append(integerFibonacci, 0);
            integerFibonacci = append(integerFibonacci, 1);
        } else if (n > 1){
            // storing fibonacci numbers in array
            integerFibonacci = append(integerFibonacci, 0);
            integerFibonacci = append(integerFibonacci, 1);
            // nth fibonacci numbers
            for (index = 3; index <= n; index++){ 
                // sum of previous two numbers
                nth = firstNumber + secondNumber; 
                // storing fibonacci numbers in array
                integerFibonacci = append(integerFibonacci, nth);
                // updating first number in series
                firstNumber = secondNumber;
                // updating third number in series
                secondNumber = nth;
            }
        } 

        // return nth fibonacci number
        return nth;
	}

    // method to return nth fibonacci (Double Typed)
	public static double fibonacci(double n) {
        // variable declarations
        double index;
        double nth, firstNumber, secondNumber;

        // Rounding Double Number to remove digits after decimals 
        n = Math.round(n);

        // starting from 0, 1
        firstNumber = 0;
        secondNumber = 1;

        // Initialization
        nth = -1;
        
        // fibonacci numbers
        if (n == 1){ // first fibonacci numbers
            nth = 0;
            // storing fibonacci numbers in array
            doubleFibonacci = append(doubleFibonacci, 0);
        } else if (n == 2) { // second fibonacci numbers
            nth = 1;
            // storing fibonacci numbers in array
            doubleFibonacci = append(doubleFibonacci, 0);
            doubleFibonacci = append(doubleFibonacci, 1);
        } else if (n > 1) {
            // storing fibonacci numbers in array
            doubleFibonacci = append(doubleFibonacci, 0);
            doubleFibonacci = append(doubleFibonacci, 1);
            // nth fibonacci numbers
            for (index = 3; index <= n; index++){ 
                // sum of previous two numbers
                nth = firstNumber + secondNumber; 
                // storing fibonacci numbers in array
                doubleFibonacci = append(doubleFibonacci, nth);
                // updating first number in series
                firstNumber = secondNumber;
                // updating third number in series
                secondNumber = nth;
            }
        } 

        // return nth fibonacci number
        return nth;
	}

    // Method to append an element at the end position of the array (Integer Typed)
    public static int[] append(int[] array, int number) {
        // new array creation with size of n + 1 for last element to be appended
        int[] appendArray = new int[array.length + 1];
    
        // Copying elements into new array
        for (int i = 0; i < array.length; i++) {
            appendArray[i] = array[i];
        }

        // Appending last element
        appendArray[array.length] = number;

        // returning appended array
        return appendArray;
    }
    
    // Method to append an element at the end position of the array (Double Typed)
    public static double[] append(double[] array, double number) {
        // new array creation with size of n + 1 for last element to be appended
        double[] appendArray = new double[array.length + 1];
    
        // Copying elements into new array
        for (int i = 0; i < array.length; i++) {
            appendArray[i] = array[i];
        }

        // Appending last element
        appendArray[array.length] = number;

        // returning appended array
        return appendArray;
    }
}