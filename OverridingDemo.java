// Parent class
class Employee {

    // Method of parent class
    void displayDetails() {
        System.out.println("Employee: This is an employee.");
    }
}

// Child class inheriting Employee
class Manager extends Employee {

    // Method overriding:
    // Manager provides its own implementation of displayDetails()
    @Override
    void displayDetails() {

        // super is used to call the parent class method
        super.displayDetails();

        System.out.println("Manager: This is a manager.");
    }
}

// Main class
public class OverridingDemo {

    public static void main(String[] args) {

        // Create Employee object
        Employee employee = new Employee();

        // Call Employee's displayDetails()
        employee.displayDetails();

        System.out.println();

        // Create Manager object
        Manager manager = new Manager();

        // Call Manager's overridden displayDetails()
        manager.displayDetails();
    }
}
