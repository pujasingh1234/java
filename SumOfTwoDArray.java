import java.util.Scanner;

public class SumOfTwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the arrays
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Declare and initialize two 2D arrays and a result array
        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];
        int[][] sumArray = new int[rows][columns];

        // Input elements for the first array
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second array
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the two arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Display the resulting sum array
        System.out.println("The sum of the two arrays is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line
        }

        // Close the scanner
        scanner.close();
    }
}
