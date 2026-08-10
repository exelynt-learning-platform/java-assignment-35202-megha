public class LoopsDemo
{
    public static void main(String[] args) {

        // For loop: Print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // While loop: Print numbers from 10 to 1
        System.out.println("Numbers from 10 to 1:");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        // Do-while loop: Print numbers divisible by 2 between 1 and 10
        System.out.println("Numbers divisible by 2:");
        int number = 1;
        do {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 10);

        // Enhanced for loop: Iterate over an array of Strings
        System.out.println("String array elements:");
        String[] names = {"Java", "Python", "C++", "JavaScript"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}