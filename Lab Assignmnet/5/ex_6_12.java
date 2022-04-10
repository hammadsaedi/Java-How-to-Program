// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: time
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem: 
 * Write an application that inputs ten numbers, each between 10 and 100, both inclusive.
 * Save each number that was read in an array that was initialized to a value of –1 for all elements.
 * Assume a value of –1 indicates an array element is empty. You are then to process the array, and
 * remove duplicate elements from the array containing the numbers you input. Display the contents
 * of the array to demonstrate that the duplicate input values were actually removed. [Note: do not
 * display the array elements where the value is –1.]
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_6_12 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int index, number;
        int[] numbers;

        // Scanner Object
        Scanner input = new Scanner(System.in);   

        // Creating Numbers Arrays
        numbers = new int[10];

        // Banner
        System.out.println("");

        // Empty Array
        // By default integer array contains 0 valued elements. But, we need Empty array.
        for (index = 0; index < numbers.length; index++){
            // Assuming a value of –1 indicates an array element is empty
            numbers[index] = -1; 
        }

        // Taking user input
        for (index = 0; index < numbers.length;){
            System.out.print("Enter number: ");
            number = input.nextInt();

            // Input Validations
            if (number >= 10 && number <= 100) {
                // Saving number in array
                numbers[index] = number;
                // Increment after valid input
                index++;
            } else { // In case of wrong input
                System.out.println("Number must be between 10 and 100.");
            }
        } 

        // Closing Scanner Object
        input.close();

        // Removing duplicate elements
        for (index = 0; index < numbers.length; index++) { // Iterating throughout array for comparing every number with each element of that array
            // nth Element of array number[index]
            number = numbers[index];

            // Comparing nth element (number) of array number[index] with each element of array number[index] (itself)
            for (int uniqueI = 0; uniqueI < numbers.length; uniqueI++) {
                if (uniqueI != index) { // To compare element of different index. (Same indexed elements are ultimately same) 
                    if (number == numbers[uniqueI]) { // if duplication is present 
                        numbers[uniqueI] = -1; // Assuming a value of –1 indicates an array element is empty
                    } 
                }
            }
        }

        // Displaying all Elements of array number[index] except empty valued
        System.out.println("Unique Elements: ");
        for (index= 0; index < numbers.length; index++){
            // nth Element of array number[index]
            number = numbers[index];

            // Assuming a value of –1 indicates an array element is empty
            if (number != -1){
                System.out.printf("%d ",numbers[index]); // Integer Formate Specifier as assignment is integer array
            }   
        }
    }
}