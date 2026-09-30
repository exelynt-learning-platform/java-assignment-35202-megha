
class Employee {

    // Compile-time polymorphism: method overloading
    void displayInfo() {
        System.out.println("Employee information");
    }

    void displayInfo(String name) {
        System.out.println("Employee name: " + name);
    }

    // Method for runtime polymorphism
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    // Runtime polymorphism: method overriding
    @Override
    void work() {
        System.out.println("Manager is working");
    }
}

class Intern extends Employee {

    // Runtime polymorphism: method overriding
    @Override
    void work() {
        System.out.println("Intern is working");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        // Compile-time polymorphism
        Employee e = new Employee();
        e.displayInfo();
        e.displayInfo("Megha");

        // Runtime polymorphism
        Employee m = new Manager();
        Employee i = new Intern();

        m.work();
        i.work();
    }
}
