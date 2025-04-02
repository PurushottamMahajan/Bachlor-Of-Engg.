package Patterns;
import java.util.Arrays;
class PascleTriangle {

    public static void main(String args[])
    {
        generatePascalTriangle(5);
    }
    static void generatePascalTriangle(int numRows) {
        int[][] pascal = new int[numRows][];
        
        for (int i = 0; i < numRows; i++) {
            pascal[i] = new int[i + 1];  // Row i has i+1 elements
            pascal[i][0] = pascal[i][i] = 1;  // First and last elements are always 1

            // Compute the inner elements using the Pascal's Triangle formula
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int[] row : pascal) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}
