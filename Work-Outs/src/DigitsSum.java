// Calculate sum of digits of an integer (recursive method using conditional operator)

import java.util.Scanner;

public class DigitsSum
{
    static int digits_sum(int number)
    {
        return number == 0 ? 0 : number % 10 + digits_sum(number / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer:");
        int integer = sc.nextInt();

        System.out.printf("Sum of digits: %s", digits_sum(integer));
        
        sc.close();
    }
}
