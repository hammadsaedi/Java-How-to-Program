// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 18 April 2022 5:40 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * Subtraction of two Matrices
*/

// Secure Random Class
import java.security.SecureRandom;

public class subtraction {
    // main method
    public static void main(String[] args){
        // variable declarations
        int rows, columns;
        int[][] matrix1, matrix2, answer;

        // dimension of matrices (Should be same to perform subtraction operations)
        rows = 3;
        columns = 2;

        // initializing matrices with random number valued elements
        matrix1 = randomMatrix(rows, columns);
        matrix2 = randomMatrix(rows, columns);

        // subtraction  of matrices
        answer = matrixSubtraction (matrix1, matrix2);

        // output
        System.out.println("A:"); print(matrix1); // displaying first matrix
        System.out.println("\nB:"); print(matrix2); // displaying second matrix
        System.out.println("\nA + B:"); print(answer); // displaying resultant matrix
    }

    // method to return subtraction  of two matrices
    public static int[][] matrixSubtraction(int[][] matrix1, int[][] matrix2){
        // variable declaration
        int i, j, rows, columns;
        int[][] matrix;

        // rows and columns of matrix
        rows = matrix1.length;
        columns = matrix1[0].length; // all columns should have same number of elements

        // 2D Array (Matrix) creation with appropriate size
        matrix = new int[rows][columns];

        // subtraction  of matrix
        for (i = 0; i < matrix.length; i++){ // iteration through rows
            for (j = 0; j < matrix[i].length; j++){ // iterations through column
                matrix[i][j] = matrix1[i][j] - matrix2[i][j]; // subtraction  of consecutive element of matrix
            }
        }

        // returning matrix after subtraction 
        return matrix;
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