// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 8:05 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 5.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
 * hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
 * hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
 * longer than 24 hours at a time. Write an application that calculates and displays the parking charges
 * for each customer who parked in the garage yesterday. You should enter the hours parked for each
 * customer. The program should display the charge for the current customer and should calculate and
 * display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer.
 */

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_8 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        float hours, charges, total;
        int customer;

        // Scanner Object
        Scanner input = new Scanner(System.in);          

        // Banner
        System.out.println("Parking Bill Calculator");

        // Initailization
        hours = 0;
        customer = 0;
        total = 0;

        // System Loop
        while (!(hours < 0)) {
            // customer number
            customer += 1;

            // Taking radius input
            System.out.printf("Enter number of hour car is parked by customer number %d. (negative Input to terminate): ",customer);
            hours = input.nextFloat();

            // Calculating Cahrges by calculateCharges method
            charges = calculateCharges(hours);

            // Negative Input for Loop Terminations or Zero Hours
            if (hours <= 0) {
                charges = 0;
            }

            // Displaying Charges for nth customer
            System.out.printf("Total Parking Charges for customer number %d: $%f%n%n", customer, charges);

            // Total of yesterday’s receipts
            total += charges;
        }

        // Closing Scanner Object
        input.close();

        // Displaying total of yesterday’s receipts
        System.out.print("Total of Yesterday Receipts = " + total);
    }

    // method to calculate charges
    public static float calculateCharges(float hours){
        // Variable declarations
        float charges;
        
        // Charges Calculations
        charges = 2; // Min Charges Up to 3 Hour

        // Charges in excess of three hours
        if (hours > 3) {
            charges += (hours - 3) * 0.5;
        }
        
        // Maximum Charges per 24 hours
        if (charges > 10) {
            charges = 10;
        }

        // retuning charges
        return charges;    
    }
}