// Author: Hammad Saeedi (@hammadsaedi everywhere)
// Date and Time: 18 April 2022 6:00 pm
// java 17.0.2 2022-01-18 LTS
// Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
// Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)

/** 
 * Equal Matrices
*/

public class equal {
    // main method
    public static void main(String[] args){
        // variable declarations
        int rows, columns;
        int[][] matrix1, matrix2;
        boolean isEqual;

        // dimension of matrices 
        rows = 3;
        columns = 2;

        // initializing matrices with random number valued elements
        matrix1 = RandomMatrix.randomMatrix(rows, columns);
        matrix2 = RandomMatrix.randomMatrix(rows, columns);

        // checking equality
        isEqual = isEqual(matrix1, matrix2);

        // output
        System.out.println("A:"); Print.print(matrix1); // displaying first matrix
        System.out.println("\nB:"); Print.print(matrix2); // displaying second matrix
        System.out.println("\nA = B: " + isEqual); // displaying equality of matrices
    }

    // method to check equality of two matrices
    public static boolean isEqual(int[][] matrix1, int[][] matrix2){
        // variable declaration
        int i, j, rows1, rows2, columns1, columns2;
        boolean isEqual;

        // number of rows and columns of matrix should be equal for equal matrices
        rows1 = matrix1.length;
        columns1 = matrix1[0].length; // all columns should have same number of elements
        rows2 = matrix2.length;
        columns2 = matrix2[0].length; // all columns should have same number of elements

        // lets consider matrices are equal
        isEqual = true;
        
        // equality check
        if (rows1 == rows2 && columns1 == columns2){ // checking equality of rows and columns
            // checking equality of elements
            for (i = 0; i < matrix1.length; i++){ // iteration through rows
                for (j = 0; j < matrix1[i].length; j++){ // iterations through columns
                    if (matrix1[i][j] != matrix2[i][j]) { // if any individual corresponding elements are not equal
                        isEqual = false; 
                        break; // break the loop
                    }
                }
            }   
        } else { // is rows and columns are not equal
            isEqual = false;
        }

        // returning equality of two matrices 
        return isEqual;
    }
}