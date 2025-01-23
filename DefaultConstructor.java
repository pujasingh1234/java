
class Employee {
    // Instance variables
    String name;
    int age;
    String department;

    // Default (no-argument) constructor
    Employee() {
        // Assign default values
        name = "Unknown";
        age = 0;
        department = "Not Assigned";
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        // Create an object using the default constructor
        Employee employee1 = new Employee();

        // Display the details of the employee
        System.out.println("Details of Employee 1:");
        employee1.displayDetails();

        // Create another object using the default constructor
        Employee employee2 = new Employee();

        // Modify details of the second employee
        employee2.name = "Alice";
        employee2.age = 25;
        employee2.department = "Finance";

        // Display the updated details of the second employee
        System.out.println("\nDetails of Employee 2:");
        employee2.displayDetails();
    }
}
