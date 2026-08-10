import java.util.Scanner;
public class ConditionalDemo
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= scanner.nextInt();
        if(number>0)
        {
            System.out.println("Number is positive");
        }
        else if(number<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
        System.out.println("Enter the number between the 1 to 7:");
        int day=scanner.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
        scanner.close();

    }
}