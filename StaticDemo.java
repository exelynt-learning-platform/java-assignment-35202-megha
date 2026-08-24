class Student {

    // Private instance fields for encapsulation
    private String name;
    private int marks;

    // Static variable shared by all Student objects
    static String schoolName = "ABC Public School";

    // Setter method to set student name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get student name
    public String getName() {
        return name;
    }

    // Setter method to set student marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter method to get student marks
    public int getMarks() {
        return marks;
    }

    // Static method to display school name
    public static void displaySchoolName() {
        System.out.println("School Name: " + schoolName);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("School: " + schoolName);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        // Creating first Student object
        Student student1 = new Student();
        student1.setName("Megha");
        student1.setMarks(85);

        // Creating second Student object
        Student student2 = new Student();
        student2.setName("Rahul");
        student2.setMarks(90);

        // Displaying details of first student
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println();

        // Displaying details of second student
        System.out.println("Student 2 Details:");
        student2.displayDetails();

        System.out.println();

        // Calling static method without creating an object
        Student.displaySchoolName();

        System.out.println();

        // Changing the shared static variable
        Student.schoolName = "XYZ High School";

        // Both objects share the updated school name
        System.out.println("After changing school name:");

        student1.displayDetails();

        System.out.println();

        student2.displayDetails();
    }
}