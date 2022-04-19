public class program19 {
    // class variable (instance variable)
    public static final int ROWS = 4, COLUMNS = 4; 
    public static int[][] A = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
    public static int[][] B = {{3,2,1,0},{7,6,5,4},{11,10,9,8},{15,14,13,12}};

    // main method
    public static void main(String[] args){
        // local variable
        int[][] sum = new int[ROWS][COLUMNS];
        int[][] diff = new int[ROWS][COLUMNS];
        int[][] product = new int[ROWS][COLUMNS];

        // addition of matrices
        sum = addition.matrixAddition(A, B);

        // difference of matrices
        diff = subtraction.matrixSubtraction(A, B);

        // product of matrices
        product = product(A, B);


        Print.print(A);

        // diagonal swapping
        A = diagonalSwapping(A);

        Print.print(A);

        // Print.print(product);
    }

    // method to return product of matrix
    public static int[][] product(int[][] A, int[][] B){
        // variable declaration
        int i, j, k;
        int[][] product;

        // array creation with appropriate size
        product = new int[ROWS][COLUMNS];

        
        for (i = 0; i < A.length; i++){ // row of matrix
            for (j = 0; j < B[i].length; j++){ // element within row (column)
                for (k = 0; k < A[i].length; k++){
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // return matrix after multiplication
        return product;
    } 

    public static int[][] diagonalSwapping(int[][] A){
        int i, temp;

        for (i = 0; i < A.length; i++){ // row of matrix
            temp = A[i][i];
            A[i][i] = A[i][A.length - i -1]; 
            A[i][A.length - i -1] = temp;
        }

        return A;
    }
}
