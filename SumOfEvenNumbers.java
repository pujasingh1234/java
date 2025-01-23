import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[size];

        // Prompt user to enter elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of even numbers
        int sumOfEvenNumbers = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                sumOfEvenNumbers += num;
            }
        }

        // Display the result
        System.out.println("The sum of even numbers in the array is: " + sumOfEvenNumbers);

        // Close the scanner
        scanner.close();
    }
}
