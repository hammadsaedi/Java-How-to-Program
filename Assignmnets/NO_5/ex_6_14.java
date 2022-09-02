// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 15 April 2022 11:53 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.14 (Variable-Length Argument List) Write an application that calculates the average of a series
 * of integers that are passed to method average using a variable-length argument list. Test your method with several calls, each with a different number of arguments.
*/

package Assignmnets.NO_5;

// Importing Secure Random Class
import java.security.SecureRandom;

public class ex_6_14 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int[] array; // array to get and store random number of elements with random value
        int a, b, c, d, _e, f, g, h, i, j; // variable to store elements of array to pass them as argument
        
        // Banner
        System.out.println("Variable-Length Argument List");

        // to get random valued and random sized element's array
        array = randomArray();

        // Several average method calls, each with a different number of arguments
        try{            
            a = array[0]; // individual elements of elements of array (to pass them as argument) -- type of array[i] is int
            b = array[1];
            System.out.printf("Average of %d and %d = %f%n", a, b, average(a, b)); // Calculating average and Displaying result
            c = array[2];
            System.out.printf("Average of %d, %d and %d = %f%n", a, b, c, average(a, b, c));
            d = array[3];
            System.out.printf("Average of %d, %d, %d, and %d = %f%n", a, b, c, d, average(a, b, c, d));
            _e = array[4];
            System.out.printf("Average of %d, %d, %d, %d and %d = %f%n", a, b, c, d, _e, average(a, b, c, d, _e));
            f = array[5];
            System.out.printf("Average of %d, %d, %d, %d, %d and %d = %f%n", a, b, c, d, _e, f, average(a, b, c, d, _e, f));
            g = array[6];
            System.out.printf("Average of %d, %d, %d, %d, %d, %d and %d = %f%n", a, b, c, d, _e, f, g, average(a, b, c, d, _e, f, g));
            h = array[7];
            System.out.printf("Average of %d, %d, %d, %d, %d, %d, %d and %d = %f%n", a, b, c, d, _e, f, g, h, average(a, b, c, d, _e, f, g, h));
            i = array[8];
            System.out.printf("Average of %d, %d, %d, %d, %d, %d, %d, %d and %d = %f%n", a, b, c, d, _e, f, g, h, i, average(a, b, c, d, _e, f, g, h, i));
            j = array[9];
            System.out.printf("Average of %d, %d, %d, %d, %d, %d, %d, %d, %d and %d = %f%n", a, b, c, d, _e, f, g, h, i, j, average(a, b, c, d, _e, f, g, h, i, j));   
        } catch (ArrayIndexOutOfBoundsException e) { 
            // Array's length will vary from 2 to 10; 
            // there will be cases when array's elements will be lesser number of variable to store their individual values (10)
            // compiler will throw ArrayIndexOutOfBoundsException
            System.out.printf("Random Sized array's length for this season is %d; that why compiler is throwing %s.", array.length, e);
        }
    }

    // method to get Variable-Length Argument List and return their average
    public static double average(int... numbers){
        // Variable Declaration
        int index, sum; 
        double average;

        // Sum is initially zero
        sum = 0;

        // Calculating Sum of All elements
        for (index = 0; index < numbers.length; index++){ // Iterating through every element of array (Variable-Length Argument List)
            sum += numbers[index];
        }

        // Calculating Average of Variable-Length Argument List
        average = ((double) sum) / ((double) numbers.length); // Average should be Double sized

        // Returning average
        return average;
    }

    // method to generate radom sized and random valued array
    public static int[] randomArray(){
        // Variable declarations
        int size;

        // Secure random object creation (as its non-static)
        SecureRandom random = new SecureRandom();

        // Random size (2 - 10)
        size = 2 + random.nextInt(9); 


        int[] array = new int[size];

        /**
         for (int element : array){
            element = 1 + random.nextInt(10); // Random Number (0 - 9)
            System.out.println("E: " + element);
            System.out.println(Arrays.toString(array));
        } // Not Altering Array
        */
        
        // Iterating through every element of array
        for (int i = 0; i < array.length; i++){
            array[i] = 1 + random.nextInt(10); // Assigning Random Number (0 - 9)
        }

        // Returning Random Array
        return array;
    }
}