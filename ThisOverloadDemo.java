//class student created
class student
{
    //fields of class student
    String name;
    int marks;
    //Default constructor using this keyword
    student()
    {
        this.name="Raj";
        this.marks=40;
    }
    // Parameterizes constructor using this keyword
    student(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    //first version of displayDetails prints anme and marks
    void displayDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Marks:" +marks);
    }
    //second version of displayDetails prints name, marks and grade
    void displayDetails(String grade)
    {
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
        System.out.println("Grade:"+grade);

    }
}
public class ThisOverloadDemo {
    public static void main(String args[])
    {
        //Creating object using default constructor
        student s=new student();
        //creating object using parameterized constructor
        student s1=new student("Megha",85);
        //calling first displayDetails
        System.out.println("Student one details");
        s.displayDetails();
        System.out.println();
        //calling second displayDetails
        System.out.println("Student two details");
        s1.displayDetails("A");
    }
}