// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 18 April 2022 7:25 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * Displaying Matrices on console
*/

public class Print {
    // main method
    public static void main(String[] args){
        // variable declarations
        int rows, columns;
        int[][] matrix;

        // dimension of matrices (Should be same to perform subtraction operations)
        rows = 3;
        columns = 2;

        // initializing matrices with random number valued elements
        matrix = RandomMatrix.randomMatrix(rows, columns);

        // output
        System.out.println("A:"); print(matrix); // displaying first matrix
    }

    // method to print matrix
    public static void print(int[][] matrix){
        // variable declaration
        int i, j;

        // printing matrix
        for (i = 0; i < matrix.length; i++){ // iteration through rows
            System.out.printf("%s","| "); // for border
            for (j = 0; j < matrix[i].length; j++){ // iterations through column
                System.out.printf("%-5d",matrix[i][j]); // printing individual elements
            }
            System.out.printf("%s%n","| "); // for border
        }
    }
}