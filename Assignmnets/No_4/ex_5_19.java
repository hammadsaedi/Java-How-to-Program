// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 4:30 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.19 (Displaying a Square of Any Character) Modify the method created in Exercise 5.18 to
 * receive a second parameter of type char called fillCharacter. Form the square using the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
 * #####
 * #####
 * #####
 * #####
 * #####
 * Use the following statement (in which input is a Scanner object) to read a character from the user
 * at the keyboard:
 * // next() returns a String and charAt(0) gets the String's first character
 * char fill = input.next().charAt(0);
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_19 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int size;
        char character;

        // Scanner Object
        Scanner input = new Scanner(System.in);          

        // Banner
        System.out.println("A Square of Characters"); 

        // Taking size input
        System.out.printf("Enter Size (integer): ");
        size = input.nextInt();
        // Taking charcter input
        System.out.printf("Enter Character: ");
        character = input.next().charAt(0);

        // display a sqaure of asterisks
        squareOfAsterisks(size, character);

        // closing scanner object
        input.close();
    }

    // method to display a square of characters
    public static void squareOfAsterisks(int size, char character){
        // variable declaration
        int i, j;

        // Square of characters
        for (i = 1; i <= size; i++){ // Outer Loop
            for(j = 1;j <= size; j++){ // Inner Loop
                System.out.print(character); // Within Same Line
            }
            // New Line
            System.out.println();
        }
    }
}