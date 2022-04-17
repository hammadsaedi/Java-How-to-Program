// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 16 April 2022 10:00 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.19 (Airline Reservations System) A small airline has just purchased a computer for its new automated reservations system. 
 * You’ve been asked to develop the new system. You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
 * Your application should display the following alternatives: Please type 1 for First Class and
 * Please type 2 for Economy. If the user types 1, your application should assign a seat in the first class section (seats 1–5). If the user types 2, your application should assign a seat in the economy
 * section (seats 6–10). Your application should then display a boarding pass indicating the person’s
 * seat number and whether it’s in the first-class or economy section of the plane.
 * Use a one-dimensional boolean array to represent the seating chart of the plane. Initialize all
 * the elements of the array to false to indicate that all the seats are empty. As each seat is assigned,
 * set the corresponding element of the array to true to indicate that the seat is no longer available.
 * Your application should never assign a seat that has already been assigned. When the economy
 * section is full, your application should ask the person if it’s acceptable to be placed in the first-class
 * section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
 * "Next flight leaves in 3 hours."
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_6_19 {
    // array to represent the seating chart of the plane
    private static boolean[] seats;
    // Passenger Counter Variable
    private static int passenger = 0;

    // main method
    public static void main(String[] args) {
        // Variable declarations
        int choice, status; 

        // Scanner Object
        Scanner input = new Scanner(System.in);   

        // sitting capacity is 10 seats (Not considering 0 Index)
        seats = new boolean[11]; 

        // initially, all elements of boolean type arrays after creations are false (No need to re-initialize them false)
        
        // Banner
        System.out.println("Airline Reservations System");

        do {
            // Seat Reservation
            System.out.println("Please type 1 for First Class.");
            System.out.println("Please type 2 for Economy.");

            // Taking Input
            choice = input.nextInt();

            if (choice == 1){
                // First Class Booking
                status = firstClassBooking();
                if (status == 1){ // First Class seat booked 
                    // continue;
                } else if (status == 0){ // First Class Seat not booked
                    System.out.println("Sorry, First Class is full. Would you like to try Economy Class Section.\nPress 1 for yes.\nPress 0 for No.");
                    // Taking Input
                    choice = input.nextInt();
                    if (choice == 1){
                        // Economy Class Booking
                        status = economyClassBooking();
                        if (status == 1) { // Economy Class Seat Booked
                            // continue;
                        } else if (status == 0) { // No Seat is Booked 
                            System.out.println("Sorry, Economy Class is also full. Next flight is after 3 hour.");
                        }
                    } else { // Decided to not to try economy class
                        System.out.println("Next flight is after 3 hour.");
                    }
                }
                
            } else if (choice == 2) {
                // Economy Class Booking
                status = economyClassBooking();
                if (status == 1){ // Economy Class seat booked 
                    // continue;
                } else if (status == 0){ // Economy Class Seat not booked
                    System.out.println("Sorry, Economy Class is full. Would you like to try First Class Section.\nPress 1 for yes.\nPress 0 for No.");
                    // Taking Input
                    choice = input.nextInt();
                    if (choice == 1){
                        // First Class Booking
                        status = firstClassBooking();
                        if (status == 1) { // Economy Class Seat Booked
                            // continue;
                        } else if (status == 0) { // No Seat is Booked
                            System.out.println("Sorry, Economy Class is also full. Next flight is after 3 hour.");
                        }
                    } else { // Decided to not to try first class
                        System.out.println("Next flight is after 3 hour.");
                    }
                }
            }

            // asking for continue
            System.out.println("Please type 1 to Choice Flight."); 
            System.out.println("Please type 0 to Exit."); 
            // Taking Input
            choice = input.nextInt();
        } while (choice != 0); // Terminate Loop in case user type 0

        input.close();
    }

    // First Class Booking
    public static int firstClassBooking() {
        // variable declarations
        int index;

        // Iterating through first class seats 
        for (index = 1; index <= 5; index++) {
                if (seats[index] == false) { // Elements whose value is false
                    // Booking Seat
                    seats[index] = true;
                    // Printing Pass
                    printPass(index);
                    // return 1 in case of successful booking
                    return 1;
                }
        } // Loop iterates through 1 - 5; if control is not returns means 1 - 5 seats are booked

        // return 1 in case of no seat available in first class
        return 0;
    }

    // Economy Class Booking
    public static int economyClassBooking() {
        // variable declarations
        int index;

        // Iterating through economy class seats 
        for (index = 6; index <= 10; index++) {
                if (seats[index] == false) { // Elements whose value is false
                    // Booking Seat
                    seats[index] = true;
                    // Printing Pass
                    printPass(index);
                    // return 1 in case of successful booking
                    return 1;
                }
        } // Loop iterates through 1 - 5; if control is not returns means 1 - 5 seats are booked

        // return 1 in case of no seat available in economy class
        return 0;

    }

    // Economy Class Booking
    public static void printPass(int seat) {
        // Passenger Counter
        passenger++;

        // Displaying Booking Pass
        if (seat >= 1 && seat <= 5){ // first class seat from 1 to 5
            System.out.printf("First Class Seat Booking%nPassenger ID: %d%nSeat No: %d%n%n",passenger, seat);
        } else if (seat >= 6 && seat <= 10){ // economy class seat from 1 to 5
            System.out.printf("Economy Class Seat Booking%nPassenger ID: %d%nSeat No: %d%n%n",passenger, seat);
        }
    }
}