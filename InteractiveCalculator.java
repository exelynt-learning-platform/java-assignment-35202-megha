import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables of different data types
        int choice;
        double num1, num2, result = 0;
        char operation;
        boolean continueCalculation = true;
        String message = "Calculator Result";

        // Loop to perform multiple calculations
        while (continueCalculation) {

            // Take first number from user
            System.out.print("Enter first number: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            num1 = scanner.nextDouble();

            // Take second number from user
            System.out.print("Enter second number: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            num2 = scanner.nextDouble();

            // Display operation choices
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            // Use switch to perform the selected operation
            switch (choice) {

                case 1:
                    result = num1 + num2;
                    operation = '+';
                    System.out.println(message + ": " + num1 + " " + operation + " " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    operation = '-';
                    System.out.println(message + ": " + num1 + " " + operation + " " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    operation = '*';
                    System.out.println(message + ": " + num1 + " " + operation + " " + num2 + " = " + result);
                    break;

                case 4:
                    // Check division by zero
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        operation = '/';
                        System.out.println(message + ": " + num1 + " " + operation + " " + num2 + " = " + result);
                    }
                    break;

                case 5:
                    // Check modulus by zero
                    if (num2 == 0) {
                        System.out.println("Cannot find modulus with zero.");
                    } else {
                        result = num1 % num2;
                        operation = '%';
                        System.out.println(message + ": " + num1 + " " + operation + " " + num2 + " = " + result);
                    }
                    break;

                case 6:
                    // Change boolean value to stop the loop
                    continueCalculation = false;
                    System.out.println("Calculator exited.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 6.");
            }

            // Ask user whether they want another calculation
            if (continueCalculation) {
                System.out.println("\nDo you want to perform another calculation?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Enter your choice: ");

                if (scanner.hasNextInt()) {
                    int again = scanner.nextInt();

                    if (again == 2) {
                        continueCalculation = false;
                        System.out.println("Calculator exited.");
                    }
                } else {
                    System.out.println("Invalid input. Calculator will continue.");
                    scanner.next();
                }
            }
        }

        scanner.close();
    }
}