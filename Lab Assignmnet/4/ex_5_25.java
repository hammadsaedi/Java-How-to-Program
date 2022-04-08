// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 4 April, 2022 9:20 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.\
 * a) Write a method that determines whether a number is prime.
 * b) Use this method in an application that determines and displays all the prime numbers
 * less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
 * you’ve found all the primes?
 * c) Initially, you might think that n/2 is the upper limit for which you must test to see
 * whether a number n is prime, but you need only go as high as the square root of n. Rewrite the program, and run it both ways. 
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_25 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number;
        boolean isPrime;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Prime Numbers"); 

        // Taking Number Input
        // System.out.print("Enter any Integer: ");
        // number = input.nextInt(); 

        // closing scanner object
        input.close();

        // Checking for 10000 numbers
        for (number = 1; number <= 100; number++) {
            // Checking prime number
            isPrime = isPrime(number);

            // displaying result
            if (isPrime == true){ // true case
                System.out.printf("%d is Prime Number.%n", number);
            }
        }
    }

    // method to check prime or not
    public static boolean isPrime(int number){
        // variable declaration
        boolean isPrime;
        int i;

        // Variable Initialization
        isPrime = true;

        // Looping through all numbers to check if it has factor other than 1 or itself
        for (i = 2; i <= number/2; i++){
            if (number % i == 0) { // factors
                isPrime = false;
                break; // close looping
            }
        }

        // returning true if number is prime
        return isPrime;
    } 
}