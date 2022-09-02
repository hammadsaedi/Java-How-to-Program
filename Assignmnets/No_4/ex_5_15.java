// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 1:09 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
 * a right triangle when the lengths of the other two sides are given. The method should take two arguments of type double and return the hypotenuse as a double. Incorporate this method into an
 * application that reads values for side1 and side2 and performs the calculation with the hypotenuse
 * method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
 * triangles in Fig. 5.11. [Note: Class Math also provides method hypot to perform this calculation.] 
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_15 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        double side1, side2, hypotenuse;

        // Scanner Object
        Scanner input = new Scanner(System.in);       
        
        // Banner
        System.out.println("Hypotenuse Calculator");

        // Taking Input
        System.out.print("Enter lenght of first side (Double Data Type): ");
        side1 = input.nextDouble();
        System.out.print("Enter lenght of second side (Double Data Type): ");
        side2 = input.nextDouble();

        // Closing Scanner Object
        input.close();

        // calculating hypotenuse
        hypotenuse = hypotenuse(side1,side2);
        
        // Displaying result
        System.out.printf("Hypotenuse: %f", hypotenuse);
    }

    // method to calculate hypotenuse
    public static double hypotenuse(double side1, double side2){
        // Variable declarations
        double hypotenuse;
        
        // calculating hypotenuse
        hypotenuse =  Math.hypot(side1,side2);

        // retuning hypotenuse
        return hypotenuse;    
    }
}