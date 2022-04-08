// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 5 April, 2022 5:50 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.27 (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
 * integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
 * common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
 * information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
 * into an application that reads two values from the user and displays the result.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_27 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int number1, number2, gcd;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Greatest Common Divisor"); 

        // Taking Number Input
        System.out.print("Enter First Number: ");
        number1 = input.nextInt(); 

        // Taking Number Input
        System.out.print("Enter Second Number: ");
        number2 = input.nextInt(); 

        // closing scanner object
        input.close();

        // checking recomendations
        gcd = gcd(number1, number2);

        // displaying result
        System.out.printf("Greatest Common Divisor: %d", gcd);
    }
    
    // Euclidean Algorithm
    public static int gcd(int number1, int number2) {
        if (number1 == 0) {
            return number2; // the algorithm stops when we find remainder 0.
        } else {
            return gcd(number2 % number1, number1); 
            // If we divide a smaller number from a larger (we reduce a larger number), GCD doesn’t change. So if we keep dividing repeatedly the larger of two, we end up with GCD.
        }
    }
}