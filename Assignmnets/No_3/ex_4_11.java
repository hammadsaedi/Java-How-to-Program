// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_4_11  {
    public static void main(String[] args) {
        // Variable Decalration
        int num, largest = 0, smallest =  0, sum;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // Number of entries
        System.out.print("How much numbers u want to enter: ");
        int choice = input.nextInt();

        if (choice <= 0) {
            System.out.println("Sorry! Must enter greater than zero..");
            System.exit(0);
        } else {
            // Taking Input
            System.out.printf("Enter any integer:(1/%d) ", choice);
            num = input.nextInt();

            smallest = num; //assume first entered number as small one

            // Taking input for user-choice 
            for (int i = 2; i <= choice; i++) {
                // Taking Input
                System.out.printf("Enter any integer:(%d/%d) ", i, choice);
                num = input.nextInt();

                // Largest Number
                if (num > largest) {
                    largest = num;
                }
                //comparing each time entered number with smallest one
                if (num < smallest) {
                    smallest = num;
                }
            }
        }

        // Sum
        sum = largest + smallest;

        // Displaying Result
        System.out.println("Largest Number is " + largest);
        System.out.println("Smallest Number is " + smallest);
        System.out.println("Sum of two Extremes is " + sum);
        
        // close input
        input.close();
   }    
} 
