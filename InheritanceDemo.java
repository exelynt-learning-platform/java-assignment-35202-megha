// Practice Java Inheritance
// Demonstrates Single, Multilevel, and Hierarchical Inheritance

// Parent class
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Manager extends Employee
// This demonstrates Single Inheritance
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Display manager details
    void displayManagerDetails() {
        displayDetails();
        System.out.println("Department: " + department);
    }
}

// SeniorManager extends Manager
// This demonstrates Multilevel Inheritance
class SeniorManager extends Manager {

    SeniorManager(String name, double salary, String department) {
        super(name, salary, department);
    }

    // Display senior manager details
    void displaySeniorManagerDetails() {
        displayManagerDetails();
    }
}

// Intern extends Employee
// This demonstrates Hierarchical Inheritance
class Intern extends Employee {

    Intern(String name, double salary) {
        super(name, salary);
    }

    // Display intern details
    void displayInternDetails() {
        displayDetails();
    }
}

// Main class
public class InheritanceDemo {

    public static void main(String[] args) {

        // Manager object - Single Inheritance
        Manager manager = new Manager(
                "Rahul", 60000, "IT"
        );

        System.out.println("Manager Details:");
        manager.displayManagerDetails();

        System.out.println();

        // SeniorManager object - Multilevel Inheritance
        SeniorManager seniorManager = new SeniorManager(
                "Amit", 90000, "Development"
        );

        System.out.println("Senior Manager Details:");
        seniorManager.displaySeniorManagerDetails();

        System.out.println();

        // Intern object - Hierarchical Inheritance
        Intern intern = new Intern(
                "Megha", 15000
        );

        System.out.println("Intern Details:");
        intern.displayInternDetails();
    }
}