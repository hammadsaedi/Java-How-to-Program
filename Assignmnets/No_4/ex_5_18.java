// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 2:27 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
 * square (the same number of rows and columns) of asterisks whose side is specified in integer parameter side. For example, if side is 4, the method should display
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_18 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int size;

        // Scanner Object
        Scanner input = new Scanner(System.in);          

        // Banner
        System.out.println("A Square of Asterisks"); 

        // Taking size input
        System.out.printf("Enter Size (integer): ");
        size = input.nextInt();

        // display a sqaure of asterisks
        squareOfAsterisks(size);

        // Closing Scanner Object
        input.close();
    }

    // method to display a square of asterisks
    public static void squareOfAsterisks(int size){
        // Variable Declaration
        int i, j;

        // Square of asterisks
        for (i = 1; i <= size; i++){ // Outer Loop
            for(j = 1;j <= size; j++){ // Inner Loop
                System.out.print("*"); // Within Same Line
            }
            // New Line
            System.out.println();
        }
    }
}