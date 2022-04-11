// Written by: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 11 April, 2022 8:50 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.5.5 Using Bar Charts to Display Array Data Graphically (Fig. 6.6)
*/

public class BarChart {
    // main method
    public static void main(String[] args) {
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
            for (int star = 0; star < array[counter]; star++){
                System.out.print("*"); 
            }

            System.out.println();
        }
    }
}