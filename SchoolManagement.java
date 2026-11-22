
/*
 * Demonstration of OOP Concepts in Java
 * Abstract Class, Inheritance, Interface,
 * Polymorphism and Encapsulation
 */

// Interface
interface Payable {
    double calculateSalary();
}

// Abstract class
abstract class Person {

    // Private fields for encapsulation
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Abstract method
    abstract void displayRole();
}

// Student class inherits Person
class Student extends Person {

    Student(String name, int age) {
        super(name, age);
    }

    @Override
    void displayRole() {
        System.out.println("Student: " + getName() + ", Age: " + getAge());
    }
}

// Teacher class inherits Person and implements Payable
class Teacher extends Person implements Payable {

    private double salary;

    Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Implementing Payable interface
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Teacher: " + getName() + ", Age: " + getAge());
        System.out.println("Salary: " + calculateSalary());
    }
}

// Main class
public class SchoolManagement {

    public static void main(String[] args) {

        // Creating objects
        Student student = new Student("Megha", 22);
        Teacher teacher = new Teacher("Rahul", 35, 40000);

        // Polymorphism: Person reference points to Student
        Person person1 = student;
        person1.displayRole();

        // Polymorphism: Person reference points to Teacher
        Person person2 = teacher;
        person2.displayRole();
    }
}
