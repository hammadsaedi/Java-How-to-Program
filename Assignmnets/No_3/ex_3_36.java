// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_36 {
    public static void main(String[] args) {
        // Variable Decalration
        int number1, number2;

        // Scanner Object
        Scanner input=new Scanner(System.in);

        // Taking Input
        // First Number
        System.out.print("Enter 1st number: ");
        number1 = input.nextInt();
        // Second Number
        System.out.print("Enter 2nd number: ");
        number2 = input.nextInt();

        // Condition Check
        if (number1 == number2) {
            System.out.println("0");
        } else if (number1 > number2) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
        
        // close input
        input.close();
   }    
} 
