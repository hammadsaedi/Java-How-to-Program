// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 15 April 2022 7: 40 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.15 (Command-Line Arguments) Write a program that takes command-line arguments and
 * computes the average of their maximum and minimum. Make sure there are command-line arguments being passed before you attempt to compute anything.
*/

// Importing Arrays class
import java.util.Arrays;


public class ex_6_15 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int index;
        double maximum, minimum, average;
        double[] array; 

        // args is treated as array --> args[0] for first argument
        if (args.length > 0) { // Making sure there are arguments to compute average\
            // creating integer array (args is String Array)
            array = new double[args.length];

            // Coping Numeric Argument from command line arguments and storing them in separate double array
            for (index = 0; index < array.length; index++){
                try { // average method works on numeric arguments (integer), there can be a case, user pass non-numeric arguments. 
                    array[index] =  Double.parseDouble(args[index]);
                } catch (NumberFormatException e) { // Handle run time error if arguments are non-numeric
                    System.out.printf("Error: %s%nOnly numeric arguments can be used to compute average.%nIgnoring Non-numeric arguments and placing zero valued argument.%n%n",e);
                }
            }

            // Banner
            System.out.println("Command-Line Arguments");

            // Calculations
            maximum = maximum(array);
            minimum = minimum(array);
            average = average(maximum, minimum); // average of maximum and minimum

            // Displaying the result
        System.out.printf("Average of maximum and minimum numbers from command line arguments passed i.e. %s = %f",Arrays.toString(array),average);

        } else { // if no argument is passed
            System.out.println("Error: Please enter the entire command while running java program.");
        }        
    }

    // method to return maximum number from any array
    public static double maximum(double[] array){
        // Variable declarations
        double maximum;

        // Lets assume Zeroth number is maximum
        maximum = array[0];

        // Enhanced for-loop to access element of array 
        for (double element : array){ // Error if element is not declared within for block;
            if (element > maximum){ // Checking every element if its greater than other or not
                maximum = element;
            }
        }

        // Returning maximum number
        return maximum;
    }

    // method to return minimum number from any array
    public static double minimum(double[] array){
        // Variable declarations
        double minimum;

        // Lets assume Zeroth number is maximum
        minimum = array[0];

        // Enhanced for-loop to access element of array 
        for (double element : array){ // Error if element is not declared within for block;
            if (element > minimum){ // Checking every element if its greater than other or not
                minimum = element;
            }
        }

        // Returning minimum number
        return minimum;
    }

    // method to get Variable-Length Argument List and return their average
    public static double average(double... numbers){
        // Variable Declaration
        int index; 
        double average;

        // Average is initially zero
        average = 0;

        // Calculating Sum of All elements
        for (index = 0; index < numbers.length; index++){ // Iterating through every element of array (Variable-Length Argument List)
            average += numbers[index] / numbers.length;
        }

        // Returning average
        return average;
    }
}