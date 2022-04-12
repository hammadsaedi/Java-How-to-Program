// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 12 April 2022 9:20 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * Appendable Array
 * By default, Java Arrays have fixed size which is set during arrays creation.
 * In python, List have extendable size. Means, we can add or remove any element from any index at run time.
 * In this program, Java arrays are bestowed with appendable characteristic of Python List.
*/

// importing arrays utilities
import java.util.Arrays;

public class List {
    // Main method
    public static void main(String[] args){
        // Array declaration and initialization
        int[] array = {1,2,3,4,5}; // new int[5];

        // Displaying Array before Appending
        System.out.println(Arrays.toString(array)); // Converting arrays to String to print

        // Appending (n + 1)th element in array (Out of Index Appending)
        array = append(array, 6); // And Initializing new appended array to previous array reference variable

        // Displaying Array after Appending
        System.out.println(Arrays.toString(array));  // Converting arrays to String to print
    }

    // Method to append an element at the end of the array
    public static int[] append(int[] array, int number) {
        // Array creation with size of n + 1 for last element to be appended
        int[] appendArray = new int[array.length + 1];
    
        // Copying elements into new array
        for (int i = 0; i < array.length; i++) {
            appendArray[i] = array[i];
        }

        // Appending last element
        appendArray[array.length] = number;

        // returning appended array
        return appendArray;
    }
}