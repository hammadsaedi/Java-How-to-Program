// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 7 April, 2022 9:48 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**   
 * 5.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
 * each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
 * the coin appears. Display the results. The program should call a separate method flip that takes no
 * arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
 * simulates coin tossing, each side of the coin should appear approximately half the time.]
*/

// Import the Scanner class
import java.util.Scanner;
// Import the Secure Random class
import java.security.SecureRandom;

public class ex_5_29 {
    // Coins Sides
    private static enum Coin {HEADS, TAILS};

    // main method
    public static void main(String[] args) {
        // Variable declarations
        byte count, choice, heads, tails;
        Coin side;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Coin Tossing"); 

        // Initializations
        count = 0;
        heads = 0;
        tails = 0;

        do {
            // Menu
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");

            // User Input
            System.out.print("Choice: ");
            choice = input.nextByte();
            
            // Toss the Coin
            if (choice == 1){
                // Flipping Coin
                side = flip();
                // Fliping Count
                count++;
                // Check Coin Side
                if (side == Coin.HEADS){
                    heads++;
                } else if (side == Coin.TAILS) {
                    tails++;
                }
                // Display Result
                System.out.printf("Flips: %d%nHead: %d%nTails: %d%n%n", count, heads, tails);
            } 
        } while (choice != 2); // terminate loop if user choose 2

        // Closing Scanner Object
        input.close();
    }

    // method to flip the coin
    public static Coin flip() {
        // variable declarations
        byte index;
        
        // Secure Random Object
        SecureRandom random = new SecureRandom();

        // random index
        index = (byte) random.nextInt(2);

        System.out.println(index);

        // returning Coin Side
        switch(index) {
            case 1:
                return Coin.HEADS;
            default:
                return Coin.TAILS;
        }
    }
}