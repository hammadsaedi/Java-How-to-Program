// Written by: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 11 April, 2022 5:25 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.5.3 Calculating the Values to Store in an Array (Fig. 6.4)
*/

package Assignmnets.NO_5.Examples;

public class InitArray3 {
    // main method
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH]; // create array

        // calculate value for each array element
        for (int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }
        
        // column headings
        System.out.printf("%s%8s%n", "Index", "Value");  // % [flags] [width] [.precision] conversion-character

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++){  
            System.out.printf("%5d%8d%n",counter, array[counter]);
        }
    }
}