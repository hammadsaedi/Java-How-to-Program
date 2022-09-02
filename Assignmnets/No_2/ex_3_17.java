// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 5:30 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 3.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has 
 * kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
 * a Java application that will input the miles driven and gallons used (both as integers) for each trip.
 * The program should calculate and display the miles per gallon obtained for each trip and print the
 * combined miles per gallon obtained for all trips up to this point. All averaging calculations should
 * produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
 * from the user
*/

package Assignmnets.No_2;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_17 {

    public static void main(String[] args) {
        // Declaration of variables
        int trip, miles, galons;
        float mileage, totalMileage;
 
        // Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Banner
        System.out.println("Millage Calculator");

        
        // Initialization of necessary variables
        totalMileage = 0; // Initially, Total Mileage will be zero
        trip = 0;
        miles = 0;

        while (miles >= 0) { // Will Terminate Loop if user input negative number
            // Number of Trips
            trip += 1;

            // Miles
            System.out.print("Enter miles driven for the trip: ");
            miles = input.nextInt();
            
            if (miles >= 0) {
                // Galons
                System.out.print("Enter galon used for the trip: ");
                galons = input.nextInt();
                
                // Milage Calculation
                mileage = (float) miles / galons;
                
                // Displaying Milage
                System.out.printf("The miles driven per galon for trip %d is: %f%n", trip, mileage);
                
                // Total Millage Calculation
                totalMileage += mileage;
            }
        }

        // Displaying Average Milage
        System.out.printf("The Average Milage is: %f", (float) (totalMileage / trip));

        // Close Scanner Object
        input.close();
    }

}
