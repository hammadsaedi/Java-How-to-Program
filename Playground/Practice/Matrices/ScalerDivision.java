// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 18 April 2022 11:48 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * Division of Matrix with Scaler Quantity (constant)
*/

public class ScalerDivision {
    // main method
    public static void main(String[] args){
        // variable declarations
        int rows, columns, number;
        int[][] matrix;

        // dimension of matrices
        rows = 3;
        columns = 2;

        // scaler number
        number = 2;
        
        // initializing matrices with random number valued elements
        matrix = RandomMatrix.randomMatrix(rows, columns);

        // displaying matrix random valued elements
        System.out.println("A:"); Print.print(matrix); 

        // scaler division
        matrix = scalerDivision(number, matrix);

        // displaying matrix after scaler division
        System.out.println("\n" + "A / " + number + ":"); Print.print(matrix); 
    }

    // method to return matrix after scaler division
    public static int[][] scalerDivision(int scaler, int[][] matrix){
        // variable declaration
        int i, j;

        // scaler division of matrix
        for (i = 0; i < matrix.length; i++){ // iteration through rows
            for (j = 0; j < matrix[i].length; j++){ // iterations through column
                matrix[i][j] /= scaler; // scaler division with each element of matrix
            }
        }

        // returning matrix after division
        return matrix;
    }
}