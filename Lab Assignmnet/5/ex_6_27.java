// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 17 April 2022 2:15 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.27 (Sieve of Eratosthenes) A prime number is any integer greater than 1 that’s evenly divisible
 * only by itself and 1. The Sieve of Eratosthenes is a method of finding prime numbers. It operates as
 * follows:
 * a) Create a primitive-type boolean array with all elements initialized to true. Array elements with prime indices will remain true. All other array elements will eventually be
 * set to false.
 * b) Starting with array index 2, determine whether a given element is true. If so, loop
 * through the remainder of the array and set to false every element whose index is a multiple of the index for the element with value true. Then continue the process with the
 * next element with value true. For array index 2, all elements beyond element 2 in the
 * array that have indices which are multiples of 2 (indices 4, 6, 8, 10, etc.) will be set to
 * false; for array index 3, all elements beyond element 3 in the array that have indices
 * which are multiples of 3 (indices 6, 9, 12, 15, etc.) will be set to false; and so on.
 * When this process completes, the array elements that are still true indicate that the index is a
 * prime number. These indices can be displayed. Write an application that uses an array of 1,000 elements to determine and display the prime numbers between 2 and 999. Ignore elements 0 and 1.
*/

// Importing Arrays class 
import java.util.Arrays;

public class ex_6_27 {
    // Main method
    public static void main(String args[]) {
        // variable declaration
        int n = 1000;
        boolean[] prime;
        int[] primeIndices;
        
        // Banner
        System.out.println("Sieve of Eratosthenes");

        // array of true valued element where index is prime
        prime = sieveOfEratosthenes(1000);
        
        // array of indices of prime array only where value is true
        primeIndices = trueIndices(prime);

        // Displaying Prime Numbers up to n
        System.out.printf("List of Prime Number Up to %d:%n%s", n, Arrays.toString(primeIndices));
	}

    // method to return true valued element where index is prime
	public static boolean[] sieveOfEratosthenes(int n) {
        // variable declarations
        int index;
        boolean[] prime;
		
        // a primitive-type boolean array
        prime = new boolean[n + 1]; // As Highest Index = Length - 1 (Here index represent number)

        // Initially, boolean array contains false valued elements
        // Looping through elements of prime numbers array
        for (index = 2; index < prime.length; index++){ // Ignoring index 0, 1 (These are not prime number)
            prime[index] = true; // initializing all element true value
        } 

        // Assigning indices which are multiple of true valued element's index a false value
        // Looping through elements of prime numbers array
        for (index = 2; index < prime.length; index++){ // ignoring index 0, 1 (These are not prime number)
			// If prime[index] is true, then it is prime number
			if(prime[index] == true) {
				// Looping through all multiples of index
				for(int i = index*index; i <= n; i += index)   
					prime[i] = false; // Assigning false value
			}
		}
		
        // return prime number Array
        return prime;
	}

    // method to return indices of passed array where value is true (stored in separate array)
    public static int[] trueIndices(boolean[] array) {
        // Variable declaration
        int index;
        int[] trueArray;

        // size of true array is not determined, so, we'll begin with zero 
        trueArray = new int[0]; // we'll append element at the end position of the array

        // Looping through all elements of array
        for (index = 2; index < array.length; index++){
            if (array[index] == true) { // if element value is true
                trueArray = append(trueArray, index); // appending index to true array
            }
        }

        // returning trueArray (contains indices of passed array where value is true)
        return trueArray;
    }

    // Method to append an element at the end position of the array
    public static int[] append(int[] array, int number) {
        // new array creation with size of n + 1 for last element to be appended
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
