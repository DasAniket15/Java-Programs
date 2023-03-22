// Check if number is prime or not (recursive method)

import java.util.Scanner;

public class PrimeCheckRecursive
{
    static int i = 2;

    static boolean check_prime(int num)
    {
        if (num == 0 || num == 1)
        {
            return false;
        }

        if (num == i)
        {
            return true;
        }

        if (num % i == 0)
        {
            return false;
        }

        i++;
        
        return check_prime(num);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        if (check_prime(number))
        {
            System.out.printf("%s is prime.", number);
        }

        else
        {
            System.out.printf("%s is not prime.", number);
        }

        sc.close();
    }    
}
