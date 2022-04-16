// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 16 April 2022 8:15 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.17 (Dice Rolling) Write an application to simulate the rolling of two dice. The application
 * should use an object of class Random once to roll the first die and again to roll the second die. The
 * sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
 * the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
 * least frequent. Figure 6.18 shows the 36 possible combinations of the two dice. Your application
 * should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
 * each possible sum appears. Display the results in tabular format.
*/

// Importing Secure Random class
import java.security.SecureRandom;

public class ex_6_17 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int die1, die2, sum;
        int[] frequency;

        // array to store frequency of sum of two die 
        frequency = new int[13]; // From Index 0 - 12; Index == Sum of die (0, 1 index will be used)  

        // Banner
        System.out.println("Dice Rolling");

        // roll die 36,000,000 times; use die value as frequency index
        for (int roll = 1; roll <= 36000000; roll++) {
            // Rolling Die two times
            die1 = roll();
            die2 = roll();

            // Calculating sum of dies
            sum = sum(die1 + die2);

            // die value as frequency index  
            frequency[sum]++; // Increment
        }

        // Displaying the result in tabular format (the number of times each possible sum appears)
        System.out.printf("%s%10s%n", "Sum", "Frequency");
        // output each array element's value
        for (sum  = 2; sum < frequency.length; sum++){  
            System.out.printf("%4d%10d%n",sum, frequency[sum]);
        }
    }

    // method to return random face of die
    public static int roll(){
        // variable declaration
        int face;

        // SecureRandom Object
        SecureRandom random = new SecureRandom();

        // Fetching Random Face of die by SecureRandom Class
        face = 1 + random.nextInt(6);

        // returning face of die
        return face;
    }

    // method to return sum of dies
    public static int sum(int... faces){
        // variable declarations
        int sum = 0;

        // Iterating through face of dies (array)
        for (int face : faces) {
            sum += face; // summing value of face of die
        }

        // retuning sum of faces of die
        return sum;
    }
}