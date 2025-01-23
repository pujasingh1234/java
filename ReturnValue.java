
class Calculator {
    // Method to add two numbers and return the result
    int add(int num1, int num2) {
        return num1 + num2; // Return the sum
    }

    // Method to multiply two numbers and return the result
    int multiply(int num1, int num2) {
        return num1 * num2; // Return the product
    }
}

public class ReturnValue {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calculator = new Calculator();

        // Call the add method and store the returned value
        int sum = calculator.add(10, 20);

        // Call the multiply method and store the returned value
        int product = calculator.multiply(5, 6);

        // Print the returned values
        System.out.println("Sum of 10 and 20: " + sum);
        System.out.println("Product of 5 and 6: " + product);
    }
}
