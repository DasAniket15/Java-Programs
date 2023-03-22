// Convert decimal to binary format (recursive method)

import java.util.Scanner;

public class DecimalBinaryConversion
{
    static int decToBinConversion(int decimal)
    {
        if (decimal == 0)
        {
            return 0;
        }

        else
        {
            return (decimal % 2 + 10 * decToBinConversion(decimal / 2));
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int binary_num = sc.nextInt();

        System.out.printf("Binary format: %s", decToBinConversion(binary_num));

        sc.close();
    }    
}
