// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 9 April, 2022 2:30 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.11 Write statements that perform the following one-dimensional-array operations:
 * a) Set elements of index 10–20, both inclusive, of integer array counts to zero.
 * b) Multiply each of the twenty elements of integer array bonus by 2.
 * c) Display the ten values of integer array bestScores, each on a new line.
*/

package Assignmnets.NO_5;

// Importing Secure Random Class
import java.security.SecureRandom;

public class ex_6_11 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int index, randomNumber;
        int[] assignment, bonus;
            
        // Arrays Creations
        assignment = new int[21]; // Highest Index = no. of element - 1
        bonus = new int[20]; // length = 20

        // Arrays Initialization
        int[] bestScores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // length = 15
        
        // Secure Random Object
        SecureRandom random = new SecureRandom();

        // Banner
        System.out.println("Operations on One-Dimension Arrays");
        
        // a) Set elements of index 10–20, both inclusive, of integer array counts to zero.
        // Setting 0 value to elements of index 10 - 20; Also by default integer array contains 0 valued element
        for (index = 10; index < assignment.length; index++){ // index = 10 because 10 - 20 element are under consideration 
            assignment[index] = 0;
            // System.out.println(index); // Loop Testing
        }


        // b) Multiply each of the twenty elements of integer array bonus by 2.
        // By default integer array contains 0 valued element. So, multiplication will not affect it.
        for (index = 0; index < bonus.length; index++) { // Assigning non zero values
            // Generating Random Number
            randomNumber = 1 + random.nextInt(20);
            // Random Number Assignments
            bonus[index] = randomNumber; 
        }
        // Multiplications
        for (index = 0; index < bonus.length; index++){
            bonus[index] *= 2; 
            // System.out.println(index); // Loop Testing
        }


        // c) Display the ten values of integer array bestScores, each on a new line.
        for (index = 0; index < 10; index++) { // First 10 Elements
            System.out.println(bestScores[index]); // println --> new line
        }


        // Displaying Remaining Arrays 
        // Assignment Array
        for (index = 0; index < assignment.length; index++){
            System.out.printf("%d ", assignment[index]); // Integer Formate Specifier as assignment is integer array
        } System.out.println(); // For Spacings
        // Bonus Array
        for (index = 0; index < bonus.length; index++){
            System.out.print(bonus[index] + " "); // Same Line
        } System.out.println(); // For Spacings
    }
}