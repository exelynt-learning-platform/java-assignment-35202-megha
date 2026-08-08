public class OperatorsDemo
{
    public static void main(String args[])
    {
        // Assignment operator assigns the value to the variable.
        int a=10,b=2;
        // Arithmetic operators used for  basic mathematical operations
        int add=a+b;//Addition
        int sub=a-b;//Subtraction
        int mul=a*b;//Multiplication
        int div=a/b;//Division
        int mod=a%b;//Modulos
        //Display the arithmetic operations results
        System.out.println("Assignment operator:"+a);
        System.out.println("Addition operation:"+add);
        System.out.println("subtraction operation:"+sub);
        System.out.println("multiplication operation:"+mul);
        System.out.println("Division operation:"+div);
        //Relational operators to compare values
         boolean Greater=a > b;// Greator
         boolean Smaller = a < b;//Smaller
        //Print relational operators result
        System.out.println("A is Greater"+Greater);
        System.out.println("A is Smaller"+Smaller);
        //Logical operators
        boolean  AND = (a>0) && (b>0);
        boolean OR = (a>0) || (b<0);
        //Result of logical operators
        System.out.println("Logical and"+AND);
        System.out.println("Logical or"+OR);
        // Bitwise Operation
        int bitwiseAnd = a & b; // Bitwise AND

        // Print bitwise result

        System.out.println("Bitwise AND (a & b): " + bitwiseAnd);



    }
}