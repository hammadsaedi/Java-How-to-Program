// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3 April, 2022 7:25 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * 5.6 Declare method sphereVolume to calculate and return the volume of the sphere. Use the
 * following statement to calculate the volume:
 * double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
 * Write a Java application that prompts the user for the double radius of a sphere, calls sphereVolume
 * to calculate the volume and displays the result.
*/

// Import the Scanner class
import java.util.Scanner;

public class ex_5_6 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        double radius, volumn;

        // Scanner Object
        Scanner input = new Scanner(System.in);    

        // Banner
        System.out.println("Voulmn Calculator");
        
        // Taking radius input
        System.out.print("Enter radius in decimal point number (Double Data Type): ");
        radius = input.nextDouble();

        // Closing Scanner Object
        input.close();

        // Calling sphereVolume method for Volumn Calculation
        volumn = sphereVolume(radius);

        // Displaying the result
        System.out.print("Voulmn = " + volumn);
    }

    // method to calculate volumn
    public static double sphereVolume(double radius){
        // Calculating Volumn of sphere
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        // return volumn
        return volume;
    }
}