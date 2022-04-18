// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 6 April, 2022 9:25 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**   
 * 5.32 (Distance Between Points) Write method distance to calculate the distance between two
 * points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
 * this method into an application that enables the user to enter the coordinates of the points.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_32 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        double distance, x1, x2, y1, y2;

        // Scanner Object
        Scanner input = new Scanner(System.in); 
        
        // Banner
        System.out.println("Distance between Points"); 

        // Taking User Inputs
        System.out.print("Enter Coordinate x1: ");
        x1 = input.nextDouble();
        System.out.print("Enter Coordinate y1: ");
        y1 = input.nextDouble();
        System.out.print("Enter Coordinate x2: ");
        x2 = input.nextDouble();
        System.out.print("Enter Coordinate y2: ");
        y2 = input.nextDouble();

        // Calculating Distance
        distance = distance(x1, y1, x2, y2);

        // displaying results
        System.out.print("Distance: " + distance);

        // closing scanner object
        input.close();
    }

    // method to return random number in range 1 to 1000
    public static double distance(double x1, double y1, double x2, double y2) {
        // variable declarations
        double distance;

        // Calculating Distance
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
 
        // retuning distance
        return distance;
    }
}