import java.util.Scanner;
/**
 * Program to accept and display user input.
 */
        public class UserInputDemo
{
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                // Read user's name
                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                // Read user's age
                System.out.print("Enter your age: ");
                int age = sc.nextInt();

                // Read user's favorite number
                System.out.print("Enter your favorite number: ");
                int favoriteNumber = sc.nextInt();

                // Display personalized message
                System.out.println("Hello " + name );
                System.out.println("Your age is  " + age );
                System.out.println("Your favorite number is " + favoriteNumber );

                sc.close();
            }
        }