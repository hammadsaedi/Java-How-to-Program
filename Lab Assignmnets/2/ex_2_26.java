// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 11:05 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.26 (Multiples) Write an application that reads two integers, determines whether the first number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the remainder operator.]
*/

// Test Input: n1 = 4 and n2 = 2


// Import the Scanner class
import java.util.Scanner;

public class ex_2_26 {
    public static void main(String[] args){
        // Initialization of Variables
        int number1, number2, tripledNumber1, doubledNumber2;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This Application determines whether the first number tripled is a multiple of the second number doubled.");
        // First Number
        System.out.print("Enter any Integer: ");
        number1 = input.nextInt();
        // Second Number
        System.out.print("Enter any Integer: ");
        number2 = input.nextInt();       
        
        // Close Scanner Object
        input.close();
        
        // Calculation
        tripledNumber1 = 3*number1;
        doubledNumber2 = 2*number2;

        // Divisiblity Check
        if (tripledNumber1 % doubledNumber2 == 0) {
            System.out.print("Yes, First number tripled is a multiple of the Second number doubled.");
        } else {
            System.out.print("No, First Number tripled is not a multiple of the Second Number doubled.");
        }
    }
}
