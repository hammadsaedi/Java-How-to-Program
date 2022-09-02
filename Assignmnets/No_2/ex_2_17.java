// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 3:44 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
 * user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
 * shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
 * representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]
 */

package Assignmnets.No_2;

// Import the Scanner class
import java.util.Scanner;

public class ex_2_17 {
    public static void main(String[] args) {
         // Initialization of Variables
         int number1, number2, number3, sum, product, average, largest, smallest;

         // Scanner Object
         Scanner input = new Scanner(System.in);
 
         // For Taking User Input
         System.out.println("This applications computes and display sum, average, product, smallest and largest among three Integer Number and Its Square with 100 and dsiplays results.");
         // First Number
         System.out.print("Enter any Integer: ");
         number1 = input.nextInt();
         // Second Number
         System.out.print("Enter another Integer: ");
         number2 = input.nextInt();
         // Third Number
         System.out.print("Enter another Integer: ");
         number3 = input.nextInt();

         // Close Scanner Object
         input.close();
 
         // Calculations
        
         // Sum
         sum = number1 + number2 + number3;
        
         // Product
         product = number1 * number2 * number3;
        
         // Average
         average = sum / 3; // Data Type is Integer, So Average will be int typed
        
         // Largest
         if (number1 > number2 && number1 > number3){ // Number1 is greater than both ?
            largest = number1;
         } else if (number2 > number1 && number2 > number3){ // Number2 is greater than both ?
             largest = number2;
         } else { // Above two cases are False than Number3 is greater
             largest = number3;
         }

         // Smallest
         if (number1 < number2 && number1 < number3){ // Number1 is smallest than both ?
            smallest = number1;
         } else if (number2 < number1 && number2 < number3){ // Number2 is smallest than both ?
            smallest = number2;
         } else { // Above two cases are False than Number3 is smallest
            smallest = number3;
         }

         // Displaying Results
         System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%nLargest Number: %d%nSmallest Number: %d%n", sum, average, product, largest, smallest);
    }
}
