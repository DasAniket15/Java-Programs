// Convert seconds to hours:minutes:seconds format

import java.util.Scanner;

public class TimeConversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of seconds:");
        int input_seconds = sc.nextInt();

        int seconds = input_seconds % 60;
        int hours = input_seconds / 60;
        int minutes = hours % 60;
        hours = hours / 60;

        System.out.printf("%s:%s:%s", hours, minutes, seconds);

        sc.close();
    }    
}
