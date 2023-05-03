// Q1 - Convert temperature from Celsius to Fahrenheit and vice versa

import java.util.Scanner;
import static java.lang.System.out;

public class Q1_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (args.length != 2) {
            out.println("Usage: java Temperature [F/C] [temperature]");

            sc.close();
            return;
        }

        String scale = args[0];
        String tempStr = args[1];
        double temp;

        // String scale_2 = sc.next();
        // String tempStr_2 = sc.next();
        // double temp_2;

        try {
            temp = Double.parseDouble(tempStr);
        }

        catch (NumberFormatException e) {
            out.println("Error: temperature is not a legal floating point number.");

            sc.close();
            return;
        }

        if (scale.equalsIgnoreCase("F")) {
            double celsius = (temp - 32) * 5 / 9;
            out.printf("%.1f F = %.1f C\n", temp, celsius);
        }

        else if (scale.equalsIgnoreCase("C")) {
            double fahrenheit = temp * 9 / 5 + 32;
            out.printf("%.1f C = %.1f F\n", temp, fahrenheit);
        }

        else {
            out.println("Error: scale must be F or C.");
        }

        sc.close();
    }
}
