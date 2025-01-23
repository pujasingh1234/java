import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Declare and initialize the 2D array
        int[][] array = new int[rows][columns];

        // Populate the 2D array with user inputs
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("The 2D array elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line
        }

        // Close the scanner
        scanner.close();
    }
}
