// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 7 April, 2022 10:55 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**   
 * 5.33 (Craps Game Modification) Modify the craps program of Fig. 5.8 to allow wagering. Initialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager. Check that wager
 * is less than or equal to bankBalance, and if it’s not, have the user reenter wager until a valid wager
 * is entered. Then, run one game of craps. If the player wins, increase bankBalance by wager and display the new bankBalance. If the player loses, decrease bankBalance by wager, display the new bankBalance, check whether bankBalance has become zero and, if so, display the message "Sorry. You
 * busted!" As the game progresses, display various messages to create some “chatter,” such as "Oh,
 * you're going for broke, huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time
 * to cash in your chips!". Implement the “chatter” as a separate method that randomly chooses the
 * string to display.
*/

// Import the Scanner class
import java.util.Scanner;
// Import the Secure Random class
import java.security.SecureRandom;

public class ex_5_33 {
    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST}; 

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // main method
    public static void main(String[] args) {
        // Variable declarations
        double distance, x1, x2, y1, y2;
        int bankBalance, wage, myPoint;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Distance between Points"); 

        // Bank Balance Initializations
        bankBalance = 1000;

        // Input Validations
        do {
            // Taking Wage Input
            System.out.print("Enter your Wage: ");
            wage = input.nextInt();

        } while (wage > 1000);
        

        // closing scanner object
        input.close();
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // Variable Declarations
        int die1, die2, sum;

        // Secure Random Object
        SecureRandom random = new SecureRandom();

        // pick random die values
        die1 = 1 + random.nextInt(6); // first die roll
        die2 = 1 + random.nextInt(6); // second die roll
        
        // sum of die values
        sum = die1 + die2;
       
        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        // returns sum of dices
        return sum;
    }

    
}