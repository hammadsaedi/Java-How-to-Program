// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_32 {
    public static void main(String[] args) {
        // Variable Decalration
        int binary = 0, decimal = 0, place = 0, bin;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter binary number for conversion: ");
        binary = input.nextInt();

        // Storing before operation
        bin = binary;

        // Conversion by Loop
        while(bin != 0) {
            int lastDigit = bin % 10; // right most digit
            decimal += lastDigit * Math.pow(2, place); // raise rightmost digit to 2^place and add to decimal
            bin /= 10; // slice rightmost digit from original
            place++; // shift 2's place to the left
        }

        // Displaying result
        System.out.printf("%d Input Binary = %d Decimal", binary, decimal);
       
            
        // Close Scanner
        input.close();
    }
    
}       

