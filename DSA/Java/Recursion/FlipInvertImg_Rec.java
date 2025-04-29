package Recursion;
import java.util.Arrays;

public class FlipInvertImg_Rec {
    public static void main(String[] args) {
        int img[][]=new int[][]{{1,1,0},{1,0,1},{0,1,0}};
        
        System.out.println("Normal Image :"); 
        for (int[] row : img) {
            System.out.println(Arrays.toString(row));
        }
        
        System.out.println("Flip Invert Image :"); 
        flipAndInvertImage(img );
    }
    static void flipAndInvertImage(int[][] image) {

    // For example, flipping [1,1,0] horizontally results in [0,1,1].
    // To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
    // For example, inverting [0,1,1] results in [1,0,0].
        for(int[] row : image) {
            
            // reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
            
        }
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }
}
