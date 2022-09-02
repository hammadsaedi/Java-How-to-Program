// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 6 April, 2022 4:20 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**   
 * 5.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
 * program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
 * The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
 * guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
 * low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
 * user for the next guess. When the user enters the correct answer, display Congratulations. You
 * guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
 * Searching, Sorting and Big O.]
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

// Import the Secure Random class
import java.security.SecureRandom;

public class ex_5_31 {
    // random nnumber
    static short randomNumber;
    static byte guesses;

    // main method
    public static void main(String[] args) {
        // Variable declarations
        short guessedNumber;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Guess the Number"); 

        // Fetching random number
        randomNumber();

        // Initailizing Guess
        guesses = 0;

        do {
            // random number (test code)
            System.out.println(randomNumber);

            // Taking User Guess
            System.out.print("Guess a number between 1 and 1000 (0 to exit the game): ");
            guessedNumber = input.nextShort();

            // Counting Guesses
            guesses++;

            // Input validations
            if (guessedNumber >= 1 && guessedNumber <= 1000) {
                // comparing number and displaying result
                compareNumber(randomNumber, guessedNumber); 
                // comapre while user guess is 0; 
                // If User Guess is right, Random Number will be changed after printing congratulations (to continue game)
            } else {
                System.out.println("Guess is out of range 1 - 1000\n\n");
            } 

        } while (guessedNumber != 0); // 0 guess will terminate loop

        // closing scanner object
        input.close();
    }

    // method to return random number in range 1 to 1000
    public static void randomNumber() {
        // Secure Random Object
        SecureRandom random = new SecureRandom();

        // Generating Random Number
        randomNumber = (short) (1 + random.nextInt(1001)); // random.nextInt returns Integer, Type Casted to short
        // It will assign random number to short randomNumber with scope of over all class    
    }

    // method to compare guess and random number
    public static void compareNumber(short randomNumber, short guessedNumber) {

        // Displaying results depending upon user inputs
        if (guessedNumber > randomNumber ) {
            System.out.println("Too high. Try again");
        } else if (guessedNumber < randomNumber) {
            System.out.println("Too low. Try again.");
        } else {
            // Displaying winning messeges
            wiiningMessege();
            // Fetching random number for new game
            randomNumber();
            // Assigning 0 to Guesses fro new game 
            guesses = 0; 
        }
    }

    // method to print wiining messege
    public static void wiiningMessege() {
        // Displaying Messege
        System.out.printf( "You guessed the number in %d tries\n", guesses);
        // Guesses Comment
        if (guesses < 10){
            System.out.println("Either you know the secret or you got lucky!\n" );
        } else if (guesses == 10){
            System.out.println( "Ahah! You know the secret!\n" );
        } else if (guesses > 10) {
            System.out.println( "You should be able to do better!\n" );
        }


    }
}