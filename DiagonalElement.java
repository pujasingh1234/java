
import java.util.Scanner;

public class DiagonalElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int size = scanner.nextInt();

        // Declare and initialize the 2D array
        int[][] matrix = new int[size][size];

        // Input elements for the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of diagonal elements
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += matrix[i][i]; // Primary diagonal
            secondaryDiagonalSum += matrix[i][size - 1 - i]; // Secondary diagonal
        }

        // Display the results
        System.out.println("The sum of the primary diagonal elements is: " + primaryDiagonalSum);
        System.out.println("The sum of the secondary diagonal elements is: " + secondaryDiagonalSum);

        // Close the scanner
        scanner.close();
    }
}
