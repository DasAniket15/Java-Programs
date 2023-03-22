// Convert temperature from Celsius to Fahrenheit and Fahreinheit to Celsius

import java.util.Scanner;

public class TempConversion
{
    static void temp_conversion(double temp, String temp_specifier)
    {
        double converted_temp = 0;

        if (temp_specifier.equals("celsius"))
        {
            converted_temp = ((temp * (9 / 5)) + 32);
            System.out.printf("Converted temperature = %.2f Fahreinheit", converted_temp);
        }

        else if (temp_specifier.equals("fahreinheit"))
        {
            converted_temp = ((temp - 32) * (5 / 9));
            System.out.printf("Converted temperature = %.2f Celsius", converted_temp);
        }

        else
        {
            System.out.println("Something went wrong, please try again.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temperature:");
        double input_temp = sc.nextDouble();
        
        System.out.println("Specify if inputted temperature is in Celsius or Fahrenheit:");
        String temp_specifier = sc.next();

        temp_specifier = temp_specifier.toLowerCase();

        temp_conversion(input_temp, temp_specifier);

        sc.close();
    }    
}
