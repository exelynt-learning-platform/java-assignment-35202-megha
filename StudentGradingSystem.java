import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Loop to enter details for 3 students
        for (int i = 1; i <= 3; i++) {

            // Variable to store student's name
            System.out.print("Enter student name: ");
            String name = scanner.next();

            // Variables to store marks of three subjects
            System.out.print("Enter marks for Subject 1: ");
            int marks1 = scanner.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            int marks2 = scanner.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            int marks3 = scanner.nextInt();

            // Calculate total marks using arithmetic operator
            int total = marks1 + marks2 + marks3;

            // Calculate average marks
            double average = total / 3.0;

            // Determine grade using conditional statements
            String grade;

            if (average >= 90) {
                grade = "A";
            } else if (average >= 75) {
                grade = "B";
            } else if (average >= 50) {
                grade = "C";
            } else {
                grade = "F";
            }

            // Display student result
            System.out.println("\n--- Student Result ---");
            System.out.println("Name: " + name);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
            System.out.println();
        }

        scanner.close();
    }
}