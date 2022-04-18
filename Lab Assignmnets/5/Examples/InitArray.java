// Written by: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 11 April, 2022 5:15 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * Creating and Initializing an Array (Fig. 6.2)
*/

public class InitArray {
    // main method
    public static void main(String[] args) {
        // declare variable array and initialize it with an array object
        int[] array = new int[10]; // create the array object

        // column headings
        System.out.printf("%s%8s%n", "Index", "Value");  // % [flags] [width] [.precision] conversion-character

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++){  
            System.out.printf("%5d%8d%n",counter, array[counter]);
        }
    }
}