// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 10 April, 2022 9:00 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.11 Write statements that perform the following one-dimensional-array operations:
 * a) Set elements of index 10–20, both inclusive, of integer array counts to zero.
 * b) Multiply each of the twenty elements of integer array bonus by 2.
 * c) Display the ten values of integer array bestScores, each on a new line.
*/

public class CopyArray {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int index;
        int[] array1, array2;

        // Banner
        System.out.println("Copying Arrays");

        // Array Creations and Initilizations of element
        array1 = new int[] {1, 2, 3, 4, 5}; // First Array with elemet ranging from 1 to 5
        array2 = new int[array1.length]; // Creations of second array with  same number of element as of first array 
        // By default array element contain 0 valued element

        // Before Copying 
        System.out.println("Arrays Elements before Copying: ");
        display(array1);
        display(array2);

        // Copying Elements of first array to second array
        for (index = 0; index < array2.length; index++){  // Iterating through elemnet of array2
            // assigning elemnet of array2 value of consective indexed element of array1
            array2[index] = array1[index];
        }

        // Before Copying 
        System.out.println("Arrays Elements after Copying: ");
        display(array1);
        display(array2);

    }


    // Method to   an array
    public static void display(int[] array){
        // Variable Declaration
        int index;

        // Iterating through elemnet of Array
        for (index = 0; index < array.length; index++){
            System.out.printf("%d ", array[index]);
        } System.out.println();
    }

}