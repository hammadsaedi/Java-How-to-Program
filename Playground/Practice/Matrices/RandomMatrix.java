// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 18 April 2022 6:00 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * Random Valued Matrices
*/

// Secure Random Class
import java.security.SecureRandom;

public class RandomMatrix {
    // main method
    public static void main(String[] args){
        // variable declarations
        int rows, columns;
        int[][] matrix;

        // dimension of matrices 
        rows = 3;
        columns = 2;

        // initializing matrices with random number valued elements
        matrix = randomMatrix(rows, columns);

        // output
        System.out.println("A:"); Print.print(matrix); // displaying matrix by Print class (present in same directory)
    }

    // method to return random n-by-m matrix
    public static int[][] randomMatrix(int rows, int columns){
        // variable declaration
        int i, j;
        int[][] matrix;

        // SecureRandom Class' Object
        SecureRandom random = new SecureRandom();

        // 2D Array (Matrix) creation with appropriate size
        matrix = new int[rows][columns];

        // assigning matrix with random values
        for (i = 0; i < matrix.length; i++){ // iteration through rows
            for (j = 0; j < matrix[i].length; j++){ // iterations through column
                matrix[i][j] = random.nextInt(100); // assigning random number from 0 to 99 
            }
        }

        // returning random matrix
        return matrix;
    }
}