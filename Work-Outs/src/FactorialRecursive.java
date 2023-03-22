// Calculate factorial of an integer (recursive method)

import java.util.Scanner;

public class FactorialRecursive
{
    static int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }

        else
        {
            return (n * factorial(n-1));
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        int factorial = factorial(number);

        System.out.printf("Factorial of %s = %s", number, factorial);

        sc.close();
    }
}
