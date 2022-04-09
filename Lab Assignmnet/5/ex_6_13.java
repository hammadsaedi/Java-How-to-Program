// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 3:45 pm
// Book: Java How to Program, Late Objects, Global Edition
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * 6.13 Label the elements of a five-by-six two-dimensional array table to indicate the order in
 * which they’re set to zero by the following program segment:
 * for (int col = 0; col < 6; col++)
 * {
 *  for (int row = 0; row < 5; row++)
 *  {
 *  table[row][col] = 0;
 *  }
 * }
*/


public class ex_6_13 {
    // main method
    public static void main(String[] args) {
        // Variable declarations
        int[][] table;
        int columns, rows;

        // Arrays creations
        table = new int[5][6]; // 5-by-6 2-Dimensional Array 

        // Banner
        System.out.println("Order of Assignments");

        // Question Program Segment
        for (columns = 0; columns < 6; columns++) {
            for (rows = 0; rows < 5; rows++) {
                // Setting values to elements
                table[rows][columns] = 0;
                // Displaying Order of Assignments
                System.out.printf("table[%d][%d] = 0%n", rows, columns);
            }
        }
    }
}