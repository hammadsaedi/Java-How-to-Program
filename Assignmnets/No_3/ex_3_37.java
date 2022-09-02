// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 28 March, 2022 8:14 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

package Assignmnets.No_3;

// Import the Scanner class
import java.util.Scanner;

public class ex_3_37 {
    public static void main(String[] args) {
        // Variable Decalration
        int x1, x2, y1, y2;

        // Scanner Object
        Scanner input=new Scanner(System.in);

        // Taking input
        // First Point
        System.out.println("Coordinates of First Point:-");
        // x1
        System.out.print("x1 = ");
        x1 = input.nextInt(); //first coordinate
        // y1
        System.out.print("y1 = ");
        y1 = input.nextInt(); //second coordinate
        // Second Point
        System.out.println("Enter coordinates of second point:-");
        // x2
        System.out.print("x2 = ");
        x2 = input.nextInt(); //first coordinate
        // y2
        System.out.print("y2 = ");
        y2 = input.nextInt();//second coordinate

        // Condition for perpendicular
        if(x1==x2) {
            System.out.println("Points are on line perpendicular to x-axis.");
        } else if( y1==y2) {
            System.out.println("Points are on line perpendicular to y-axis.");
        } else{
            System.out.println("Line is not perpendicular to any axis.");
        }

        // close input
        input.close();
   }    
} 
