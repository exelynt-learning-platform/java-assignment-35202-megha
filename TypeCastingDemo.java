/**
 * Program to demonstrate type casting in Java.
 */
public class TypeCastingDemo {

    public static void main(String[] args) {

        // Declare variables
        int number = 10;
        double decimal = 20.5;
        float value = 5.5f;
        char letter = 'A';

        // Implicit casting: int to double
        double intToDouble = number;

        // Explicit casting: double to int
        int doubleToInt = (int) decimal;

        // Explicit casting: float to int
        int floatToInt = (int) value;

        // Convert number to String
        String numberString = String.valueOf(number);

        // Convert String to number
        int stringToInt = Integer.parseInt("50");

        // Convert char to int
        int charToInt = (int) letter;

        // Print results
        System.out.println("Int to Double: " + intToDouble);
        System.out.println("Double to Int: " + doubleToInt);
        System.out.println("Float to Int: " + floatToInt);
        System.out.println("Number to String: " + numberString);
        System.out.println("String to Int: " + stringToInt);
        System.out.println("Char to Int: " + charToInt);
    }
}