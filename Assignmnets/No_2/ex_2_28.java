// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 26 March, 2022 11:45 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you
 * learned about integers and the type int. Java can also represent floating-point numbers that contain
 * decimal points, such as 3.14159. Write an application that inputs from the user the radius of a circle
 * as an integer and prints the circle’s diameter, circumference and area using the floating-point value
 * 3.14159 for π. Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined constant Math.PI for the value of π. This constant is more precise than the value 3.14159. Class Math
 * is defined in package java.lang. Classes in that package are imported automatically, so you do not
 * need to import class Math to use it.] Use the following formulas (r is the radius):
 * diameter = 2r circumference = 2πr area = πr2
 * Do not store the results of each calculation in a variable. Rather, specify each calculation as the value
 * that will be output in a System.out.printf statement. The values produced by the circumference
 * and area calculations are floating-point numbers. Such values can be output with the format specifier
 * %f in a System.out.printf statement. You’ll learn more about floating-point numbers in Chapter 3.
 */

package Assignmnets.No_2;

// Import the Scanner class
import java.util.Scanner;

public class ex_2_28 {
    public static void main(String[] args){
        // Initialization of Variables
        int radius;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // For Taking User Input
        System.out.println("This Application shows Diameter, Circumference and Area of circle.");
        // Integer Radius
        System.out.print("Enter Radius as Integer: ");
        radius = input.nextInt();  
        
        // Close Scanner Object
        input.close();
        
        // Displaying Diameter, Circumference and Area of circle
        System.out.printf("Diameter: %d%nCircumference: %f%nArea: %f" , 2*radius, 2*Math.PI*radius, Math.PI*Math.pow(radius,2));
    }
}