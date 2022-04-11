import javax.sound.midi.Soundbank;

// Written by: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 11 April, 2022 5:35 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 *6.5.2 Using an Array Initializer (Fig. 6.3)
*/

public class BarChart {
    // main method
    public static void main(String[] args) {
        // initializer list specifies the initial value for each element
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution:");

        // for each array element, output a bar of the chart
        for (int counter = 0 ; counter < array.length; counter++){
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (counter == 10){
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            // print bar of astrict
        }

        // column headings
        System.out.printf("%s%8s%n", "Index", "Value");  // % [flags] [width] [.precision] conversion-character

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++){  
            System.out.printf("%5d%8d%n",counter, array[counter]);
        }
    }
}