package Searching;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70};
            System.out.print("Enter the element to search: ");
            int key = scanner.nextInt();
            int result = linearSearch(arr, key);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found.");
            }
        }
    }
}
