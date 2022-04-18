// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 4 April, 2022 8:50 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
 * 1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
 * 1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
 * Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
 * the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing power of your computer by testing numbers much larger than 1000. Display the results.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_24 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number;
        boolean isPerfect;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Perfect Numbers"); 

        // Taking Number Input
        // System.out.print("Enter any Integer: ");
        // number = input.nextInt(); 

        // closing scanner object
        input.close();

        for (number = 1; number <= 10000; number++){
            // Checking perfect number
            isPerfect = isPerfect(number);

            // displaying result
            if (isPerfect){ // true case
                System.out.printf("%d is Perfect.", number);
                // new line
                System.out.println();
                // Printing Prime Factors
                printFactor(number);
                // new line
                System.out.println("\n");
            }
        }
    }

    // method to check perfect or not
    public static boolean isPerfect(int number){
        // variable declaration
        boolean isPerfect;
        int perfectNumber, i;

        // Initialization
        perfectNumber = 0; // Initially it will be 0, will add prime factors to it and compare later on

        // Looping through all number and cheking if number is fully divisible by that
        for (i = 1; i < number; i++) {
            if (number % i == 0) { // prime facots
                perfectNumber += i; // Adding prime factors
            }
        }

        // Checking if it is perfect or not
        isPerfect = (number == perfectNumber)?true:false;

        // returning true if number is perfect
        return isPerfect;
    } 

    // method to return factors of number
    public static void printFactor(int number){
        // Variable Declarations
        int i;

        // Looping through all number and cheking if number is fully divisible by that
        for (i = 1; i < number; i++) {
            if (number % i == 0) { // prime facots
                System.out.printf("%d ",i); // printing prime factors
            }
        }
    } 
}