// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 18 April 2022 5:40 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * Subtraction of two Matrices
*/

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
        matrix1 = RandomMatrix.randomMatrix(rows, columns);
        matrix2 = RandomMatrix.randomMatrix(rows, columns);

        // subtraction  of matrices
        answer = matrixSubtraction (matrix1, matrix2);

        // output
        System.out.println("A:"); Print.print(matrix1); // displaying first matrix
        System.out.println("\nB:"); Print.print(matrix2); // displaying second matrix
        System.out.println("\nA + B:"); Print.print(answer); // displaying resultant matrix
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
}