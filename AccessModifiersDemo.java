class StudentAccess
{
    //private  fields : can be accesed only inside the student class
    private String name;
    private int age;
    //public field: can be accesed outside the class
    public String grade;
    //public method to set the private name field
    public void setName(String name) {
        this.name = name;
    }
    //public method to get the private name field
    public String getName()
    {
        return name;
    }
    //public method to set the private age field
    public void setAge(int age)
    {
        this.age=age;
    }
    //public method to get the private age field
    public int getAge()
    {
        return age;
    }

}
public class AccessModifiersDemo {
    public static void main(String args[])
    {

        // Creating a Student object
        StudentAccess student = new StudentAccess();

        // Updating private fields using public setter methods
        student.setName("Megha");
        student.setAge(21);

        // Public field can be accessed directly
        student.grade = "A";

        // Displaying private fields using public getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Displaying public field directly
        System.out.println("Student Grade: " + student.grade);
    }
}