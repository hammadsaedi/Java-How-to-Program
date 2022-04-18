// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 17 April 2022 12:15 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.20 (Archery Game) A group of four friends visit a sports club and they decide to practice
 * archery. Each player gets 3 chances and in every chance they can score between 0 to 10 points.
 * The player with the maximum score after adding the scores obtained in all 3 chances wins.
 * Write an application that simulates this game and prints the scores of all four players in a tabular format and also prints which player won.
 * Each line in the table should contain the following:
 * 1) The player number
 * 2) Their first chance score
 * 3) Their second chance score
 * 4) Their third chance score
 * 5) Their score after all three chances
 * Use multidimensional arrays to store the scores of players in each chance.
 * Use the Secure Random number generation mechanism learnt in the previous chapter to generate scores between 0 and 10 for each player chance.
*/

// Importing Secure Random class
import java.security.SecureRandom;

public class ex_6_20 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int score, index, tries;
        int[][] scores;

        // array to store score of player 
        scores = new int[5][4]; // Players score is stored in index 1 - 4; Nested Array stores score of each try
        
        // Banner
        System.out.printf("%50s%n","Archery Game");

        // Game Play
        for (index = 1; index < scores.length; index++) {  // Iterating through player
            // For Each Player; Looping through Number of tries
            for (tries = 1; tries < scores[index].length; tries++) {
                // Playing Game
                score = archery();
                // Storing Score in Array
                scores[index][tries] = score;
            }
        }

        // Displaying result
        result(scores);
        
    }

    // method to return score in game by secure random class
    public static int archery(){
        // variable declaration
        int score;

        // SecureRandom Object
        SecureRandom random = new SecureRandom();

        // Fetching Random score by SecureRandom Class
        score = random.nextInt(11); // Chance 0 - 10

        // returning score
        return score;
    }

    // method to display result
    public static void result(int[][] scores){
        // variable declaration
        int index, tries, score, sum = 0, winner = 0;
        int[] sums = new int[5];

        // Header
        System.out.printf("%-25s%-25s%-25s%-25s%-25s%n", "Player Number", "First Chance Score", "Second Chance Score","Third Chance Score", "Total Score");
        
        // Displaying Results in tabular format
        for (index = 1; index < scores.length; index++) {  // Iterating through player
            // Player Number
            System.out.printf("%-20d\t", index);
            // For Each Player; Looping through Scores in each try
            for (tries = 1; tries < scores[index].length; tries++) {
                // Scores in each try
                score = scores[index][tries];
                // Calculating sum of score in each try
                sum += score;
                // Displaying Score in each try
                System.out.printf("%20d\t", score);
            }
            // Storing Sum in Array
            sums[index] = sum;
            // Displaying sum of score in each try
            System.out.printf("%15d%n", sum);
        }
        
        // Looping through each sum of scores
        for (index = 1; index < sums.length; index++){
            // Winner Check
            if (winner < sums[index]) {
                winner = index;
            }
        }

        // Displaying Winner
        System.out.printf("%nPlayer %d won", winner);
    }
}