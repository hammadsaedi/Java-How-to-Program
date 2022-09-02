// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 4:30 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.20 (Test for Leap Year) Write an application that prompts the user to enter an year and uses a
 * method called isLeapYear to check whether it is a leap year.
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_20 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        short year;
        boolean isLeapYear;

        // Scanner Object
        Scanner input = new Scanner(System.in);          

        // Banner
        System.out.println("Leap Year Checker"); 

        // taking year input
        System.out.printf("Enter year: ");
        year = input.nextShort();

        // closing scanner object
        input.close();

        // checking leap year
        isLeapYear = isLeapYear(year);

        // Displaying Output
        if (isLeapYear){
            System.out.printf("%d is a leap year.", year);
        } else {
            System.out.printf("%d is not a leap year.", year);
        }        
    }

    // method to display a square of characters
    public static boolean isLeapYear(short year){
        // Variable Declarations
        boolean isLeapYear;

        // Checking for Leap Year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0)) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        // retrun true if year is leap
        return isLeapYear;
    }
}