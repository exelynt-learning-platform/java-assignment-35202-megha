
// Student class demonstrates methods with and without return types.
class Student
{
    // Fields of Student class
    String name;
    int marks;
    // Method with void return type to display student details
    void displayDetails()
{
    System.out.println("Name:"+name);
    System.out.println("Marks:"+marks);
}
    // Method with String return type to calculate the grade
    String calculateGrade() {
        if(marks>=90) {
            return "A";
        } else if (marks>=75) {
            return "B";
        } else if (marks>-50) {
            return "C";
        }else {
            return "F";

        }
    }
}
public class MethodsDemo
{
    public static void main(String args[]) {
        //creating the first student object
        Student s1 = new Student();
        s1.name="Megha";
        s1.marks=85;

        //creating the second student object
        Student s2 = new Student();
        s2.name="Om";
        s2.marks=85;

        // Calling methods for the first student
        System.out.println("Student 1 Details:");
        s1.displayDetails();
        System.out.println("Grade: " + s1.calculateGrade());

        System.out.println();

        // Calling methods for the second student
        System.out.println("Student 2 Details:");
        s2.displayDetails();
        System.out.println("Grade: " + s2.calculateGrade());
    }
}
