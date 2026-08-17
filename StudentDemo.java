// Basic class and object creation
class Student
        {
            // Field of student class
            String name;
            int age;
                }
        public class StudentDemo
{
    // Main method
        public static void main(String args[])
{
    // Creating object of first student
    Student s1 =new Student();
    s1.name="Megha";
    s1.age=21;

    // Creating object of second student
    Student s2=new Student();
    s2.name="Om";
    s2.age=22;
    // printing details of both object
    System.out.println("Name of first student:" + s1.name);
    System.out.println("Age of first student:" + s1.age);
    System.out.println("Name of Second student:" + s2.name);
    System.out.println("Age of Second student:" + s2.age);

}
    }