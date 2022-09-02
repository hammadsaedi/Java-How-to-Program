// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 4 April, 2022 10:55 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**  
 * 5.22 (Temperature Conversions) Implement the following integer methods:
 * a) Method Kelvin returns the Kelvin equivalent of a Celsius temperature, using the calculation
 * Kelvin = Celsius + 273.15;
 * b) Method Celsius returns the Celsius equivalent of a Kelvin temperature, using the calculation
 * Celsius = Kelvin - 273.15;
 * c) Use the methods from parts (a) and (b) to write an application that enables the user to
 * enter a Kelvin temperature and display the Celsius equivalent, or, to enter a Celsius
 * temperature and display the Kelvin equivalent. 
*/

package Assignmnets.No_4;

// Import the Scanner class
import java.util.Scanner;

public class ex_5_22 {
    // Scanner Object for all method of class ex_5_22
    static Scanner input = new Scanner(System.in); 

    // main method
    public static void main(String[] args) {
        // Variable declarations
        double celsius, kelvin;
        byte choice;

        // Banner
        System.out.println("Temperature Converter"); 

        // Choosing Temperature
        do {
            choice = choice();
        } while (!(choice >= 1 && choice <= 2));

        // converting temperature
        if (choice == 1){ // celcius to kelvin
            // Taking temp input
            System.out.print("Enter Temperature in Celcius: ");
            celsius = input.nextDouble();

            // Converting temp
            kelvin = Kelvin(celsius);

            // Displaying result
            System.out.printf("Temperature in Kelvin: %f", kelvin);

        } else if (choice == 2){ // kelvin to celcius
            // Taking temp input
            System.out.print("Enter Temperature in Kelvin: ");
            kelvin = input.nextDouble();

            // Converting temp
            celsius = Celsius(kelvin);

            // Displaying result
            System.out.printf("Temperature in Celsius: %f", kelvin);
        }
        // closing scanner object
        input.close();
    }

    // method to take user choice
    public static byte choice(){
        // variable declaration
        byte choice;

        // Choosing Temperature
        System.out.printf("Choose any Option. (1/2)%n1. Celcius to Kelvin%n2. Kelvin to Celcius%n");
        choice = input.nextByte();

        // retuning user choice
        return choice;
    }

    // method to convert celsius to kelvin
    public static double Kelvin(double celsius) {
        // variable declaration
        double kelvin;

        // Temperature Conversion
        kelvin = celsius + 273.15;

        // retrun kelvin
        return kelvin;
    }

    // method to convert kelvin to celsius
    public static double Celsius(double kelvin) {
        // variable declaration
        double celsius;

        // Temperature Conversion
        celsius = kelvin - 273.15;

        // retrun celsius
        return celsius;
    }  
}