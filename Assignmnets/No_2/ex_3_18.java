// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * (Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account. For each customer, the following facts are available:
 * a) account number
 * b) balance at the beginning of the month
 * c) total of all items charged by the customer this month
 * d) total of all credits applied to the customer’s account this month
 * e) allowed credit limit.
 * The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits), display the new balance and determine whether the new balance exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
*/

package Assignmnets.No_2;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_18 {

    public static void main(String[] args) {
        // Declaration of variables
        int accountNumber = 1, balance, totalCharges, totalCredit, creditLimit, newBalance;
        
        // Scanner Object
        Scanner input = new Scanner(System.in);

    

        while (accountNumber != 0) { // terminate loop if user inputs account number 0
            // Account Number
            System.out.print("Enter Account Number: ");
            accountNumber = input.nextInt();
            
            // Beginning Balance
            System.out.print("Enter balance at the beginning: ");
            balance = input.nextInt();

            // Total Charges
            System.out.print("Enter total of all items charged by the customer current month: ");
            totalCharges = input.nextInt();

            // Total Credit
            System.out.print("Enter total of all credits applied to the customer’s account this month: ");
            totalCredit = input.nextInt();
            
            // Credit Limit
            System.out.print("Enter allowed credit limit : ");
            creditLimit = input.nextInt();

            // New Balance Calculation and Displaying
            newBalance = balance + totalCharges - creditLimit;
            System.out.printf("The New Balance for for account number %d is %d%n", accountNumber, balance);

            if (newBalance <= creditLimit) {
                System.out.printf("Credit Limit for account number %d is not exceeded%n", accountNumber);
            } else {
                System.out.printf("Credit Limit for account number %d exceeded%n", accountNumber);
            }
        }
        
        // Close Scanner Object
        input.close();
    }
}
