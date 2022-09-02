// Written by: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 11 April, 2022 9:00 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.5.6 Using the Elements of an Array as Counters (Fig. 6.7)
*/

package Assignmnets.NO_5.Examples;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7]; // array of frequency counters

        // roll die 60,000,000 times; use die value as frequency index
        for (int roll = 1; roll <= 60000000; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        // output each array element's value
        for (int face = 1; face < frequency.length; face++){  
            System.out.printf("%4d%10d%n",face, frequency[face]);
        }
    }
}