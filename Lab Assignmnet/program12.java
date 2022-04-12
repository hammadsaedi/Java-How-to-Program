// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 12 April 2022 8:40 am
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/**
 * PF - Lab Task: 12 April 2022
*/

// Import the Scanner class
import java.util.Scanner;

public class program12 {
    public static void main(String[] args){
        // Variable declarations
        int desired;
        // Array Declarations
        int[] 
        array1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19},  // with Initializing (Odd Numbers)
        array2 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18}, // with Initializing (Even Number)
        sum = new int[10], 
        difference = new int[10], 
        product = new int[10];

        // Scanner Object
        Scanner input = new Scanner(System.in); 

        // Displaying both array
        System.out.println("First Array:");
        print(array1);
        System.out.println("Second Array:");
        print(array2);

        // Calculating Sum
        sum = sum(array1, array2, sum);

        // Calculating Difference
        difference = difference(array1, array2, difference);

        // Calculating Product
        product = product(array1, array2, product);

        // Displaying Sum, Difference and Product Array
        System.out.println("Sum Array:");
        print(sum);
        System.out.println("Difference Array:");
        print(difference);
        System.out.println("Product Array:");
        print(product);

        // Search a particular element
        // Taking User input
        System.out.print("Enter the desired element: ");
        desired = input.nextInt();
        if (linearSearch(array1, desired)) {
            System.out.printf("%d is present in Array%n", desired);
        } else {
            System.out.printf("%d is not present in Array%n", desired);
        }

        // // Ascending Bubble Sort an Array
        ascendingBubbleSort(array1);
        // Displaying sorted array
        System.out.println("Ascending Bubble Sorted Array:");
        print(array1);

        // // Descending Bubble Sort an Array
        descendingBubbleSort(array2);
        // Displaying sorted array
        System.out.println("Descending Bubble Sorted Array:");
        print(array2);

        // Sum Version 2
        // Calculating Sum
        sum = sum2(array1, array2, sum);

        // displaying sum version 2
        System.out.println("Sum Version 2:");
        print(sum);

        // Closing Scanner
        input.close();
    }

    // Method to print an array
    public static void print(int[] array){
        // Variable Declaration
        int index;

        // Iterating through element of Array
        for (index = 0; index < array.length; index++){
            System.out.printf("%d ", array[index]);
        } System.out.println();
    }

    // Method to calculate sum of an array
    public static int[] sum(int[] array1, int[] array2, int[] sum){
        // Variable Declaration
        int index;

        // Iterating through element of Array
        for (index = 0; index < array1.length; index++){
            sum[index] = array1[index] + array2[index];
        } 

        // Return Summations of consecutive element of both array
        return sum;
    }

    // Method to calculate difference of two array
    public static int[] difference(int[] array1, int[] array2, int[] difference){
        // Variable Declaration
        int index;

        // Iterating through element of Array
        for (index = 0; index < array1.length; index++){
            difference[index] = array1[index] - array2[index];
        } 

        // Return Difference of consecutive element of both array
        return difference;
    }

    // Method to calculate product of two array
    public static int[] product(int[] array1, int[] array2, int[] product){
        // Variable Declaration
        int index;

        // Iterating through element of Array
        for (index = 0; index < array1.length; index++){
            product[index] = array1[index] * array2[index];
        } 

        // Return Product of consecutive element of both array
        return product;
    }

    // Method to search a desired valued element
    public static boolean linearSearch(int array[], int desired){
        // Variable Declaration
        int index;

        // Iterating through element of Array
        for (index = 0; index < array.length; index++){
            if (array[index] != desired){ // if desired valued element isn't spotted
                continue;
            } else { // if desired valued element is spotted
                return true;
            }
        } 

        // return false if desired valued element isn't spotted
        return false;
    }

    // Method to ascending bubble sort an array
    public static void ascendingBubbleSort(int[] array){
        int temporary, i, j;

        for (i = 0; i < array.length - 1; i++){
            for (j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
    }

    // Method to descending bubble sort an array
    public static void descendingBubbleSort(int[] array){
        int temporary, i, j;

        for (i = 0; i < array.length - 1; i++){
            for (j = i + 1; j < array.length; j++){
                if (array[i] < array[j]){
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
    }

    // Method to calculate sum of two arrays
    public static int[] sum2(int[] array1, int[] array2, int[] sum){
        // Variable Declaration
        int index, invertedIndex;

        invertedIndex = array2.length - 1;

        // Iterating through element of Array
        for (index = 0; index < array1.length; index++){
            sum[index] = array1[index] + array2[invertedIndex - index];            
        } 

        // Return Summations of consecutive element of both array
        return sum;
    }
}
