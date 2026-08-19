import java.util.Scanner;
// Student class created with fields like name ,age and grade.
class Student
{
    // Fields of the student class
    private String name;
    private int age;
    private String grade;
// Default constructor initializes the default values
    Student()
{
    name="Megha";
    age=21;
    grade = "A";
}
// Parameterized constructor initializes the fields with given values
Student(String name,int age,String grade)
{
    this.name=name;
    this.age=age;
    this.grade=grade;
}
//Method to print student details
    void displayDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Grade:"+grade);
        System.out.println();
    }
}
public class ConstructorDemo{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        // Creating the object for the default constructor
        Student student1=new Student();
        System.out.println("Default constructor");
        student1.displayDetails();
        // Taking user input for the parameterized constructor
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        // Creating objects using the parameterized constructor
        Student student2 = new Student(name, age, grade);
        Student student3 = new Student("Rahul", 22, "A");

        // Printing all object details
        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        System.out.println("Student 3 Details:");
        student3.displayDetails();

        scanner.close();
    }
}