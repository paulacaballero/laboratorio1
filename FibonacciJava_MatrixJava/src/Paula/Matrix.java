package Paula;


public class Matrix 
{
    double[][] A = { { 4.00, 3.00, 5,8,3 }, { 2.00, 1.00,6,7,9 }, { 2.00, 1.00,6,7,9 },{ 2.00, 1.00,6,7,9 },{ 2.00, 1.00,6,7,9 } };
    double[][] B = { { -0.500, 1.500,34,5,7 }, { 1.000, -2.0000 ,8,6,5}, { 1.000, -2.0000 ,8,6,5}, { 1.000, -2.0000 ,8,6,5}, { 1.000, -2.0000 ,8,6,5}  };

    public static double[][] multiplicar(double[][] A, double[][] B) {

        int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;

        if (aColumns != bRows)
        {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        double[][] C = new double[aRows][bColumns];
        for (int i = 0; i < aRows; i++) 
        {
            for (int j = 0; j < bColumns; j++) 
            {
                C[i][j] = 0.00000;
            }
        }
        
        long startTime = System.nanoTime();
        for (int i = 0; i < aRows; i++) 
        { // aRow
            for (int j = 0; j < bColumns; j++)
            { // bColumn
                for (int k = 0; k < aColumns; k++) 
                { // aColumn
                    C[i][j] += A[i][k] * B[k][j];
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime);
                    System.out.println( duration );
                }
            }
        }
        
        return C;
    }

    public static void main(String[] args) {

        Matrix matrix = new Matrix();
        double[][] result = multiplicar(matrix.A, matrix.B);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
     
}
