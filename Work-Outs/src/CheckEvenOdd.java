// Check even or odd

import java.util.Scanner;

public class CheckEvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int val_num = sc.nextInt();
        
        if (val_num % 2 == 0)
        {
            System.out.println("Entered number is even.");
        }

        else
        {
            System.out.println("Entered number is odd.");
        }

        sc.close();
    }
}
