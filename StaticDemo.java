class Student {

    // Instance fields: each object has its own name and marks
    String name;
    int marks;

    // Static variable: shared by all Student objects
    static String schoolName = "ABC Public School";

    // Static method to display the shared school name
    static void displaySchoolName() {
        System.out.println("School Name: " + schoolName);
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("School: " + schoolName);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        // Creating first Student object
        Student student1 = new Student();
        student1.name = "Megha";
        student1.marks = 85;

        // Creating second Student object
        Student student2 = new Student();
        student2.name = "Rahul";
        student2.marks = 90;

        // Displaying details of both objects
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();

        System.out.println();

        // Calling static method without creating an object
        Student.displaySchoolName();

        // Changing the static variable
        Student.schoolName = "XYZ High School";

        System.out.println();

        // Both objects share the updated static variable
        System.out.println("After changing school name:");
        student1.displayDetails();

        System.out.println();
        student2.displayDetails();
    }
}