// Student Management System
// Demonstrates OOP concepts in Java

class Student {

    // Private instance variables
    private String name;
    private int age;
    private double marks;

    // Static variable shared by all students
    private static String schoolName = "ABC Public School";

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.marks = 0.0;
    }

    // Parameterized constructor
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
        System.out.println("School: " + schoolName);
    }

    // Method to calculate grade
    public char calculateGrade() {
        if (this.marks >= 90) {
            return 'A';
        } else if (this.marks >= 75) {
            return 'B';
        } else if (this.marks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Overloaded method with extra credit marks
    public char calculateGrade(double extraCredit) {
        double totalMarks = this.marks + extraCredit;

        if (totalMarks >= 90) {
            return 'A';
        } else if (totalMarks >= 75) {
            return 'B';
        } else if (totalMarks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Main method
    public static void main(String[] args) {

        // Creating three Student objects
        Student student1 = new Student("Megha", 21, 92);
        Student student2 = new Student("Priya", 20, 78);
        Student student3 = new Student("Sneha", 22, 65);

        // Display details and grades
        System.out.println("Student 1:");
        student1.displayDetails();
        System.out.println("Grade: " + student1.calculateGrade());
        System.out.println("Grade with Extra Credit: "
                + student1.calculateGrade(3));

        System.out.println();

        System.out.println("Student 2:");
        student2.displayDetails();
        System.out.println("Grade: " + student2.calculateGrade());
        System.out.println("Grade with Extra Credit: "
                + student2.calculateGrade(5));

        System.out.println();

        System.out.println("Student 3:");
        student3.displayDetails();
        System.out.println("Grade: " + student3.calculateGrade());
        System.out.println("Grade with Extra Credit: "
                + student3.calculateGrade(5));
    }
}