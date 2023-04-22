import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

// Allows Scanner object to be used in every class
class IO {
    private static final Scanner sc = new Scanner(in);

    public static Scanner getScanner() {
        return sc;
    }

    public static void closeScanner() {
        sc.close();
    }
}

// Interface containing abstract methods
interface Currency {
    void moneyConversion(String currency_type, float value);

    String countryCurrency();
}

// Class which implements interface
class CurrencyConversion implements Currency {

    // Override method to convert Rupees to USD and vice versa based on user I/P
    @Override
    public void moneyConversion(String currency_type, float value) {
        float converted_value;

        if (currency_type.equalsIgnoreCase("rupee")) {
            converted_value = (float) (value * 0.012);
            out.printf("\nConverted to USD: %.2f", converted_value);
        }

        else if (currency_type.equalsIgnoreCase("dollar")) {
            converted_value = (float) (value * 82.04);
            out.printf("\nConverted to Rupees: %.2f", converted_value);
        }

        else
            out.println("You may have inputted incorrect values.");
    }

    // Override method to take input of which Country's currency is being used
    @Override
    public String countryCurrency() {
        String currency_type;

        out.println("\nEnter which Country's currency (India / USA): ");
        String country = IO.getScanner().next();

        if (country.equalsIgnoreCase("India"))
            currency_type = "rupee";

        else
            currency_type = "dollar";

        return currency_type;
    }
}

// Main class to test the implementation
public class Q1 {
    public static void main(String[] args) {
        // Creating class object
        CurrencyConversion obj = new CurrencyConversion();

        // Taking input of monetary amount
        out.println("\nEnter amount of money: ");
        float value = IO.getScanner().nextFloat();

        // Invoking countrycurrency to check which currency to convert
        String currency_type = obj.countryCurrency();

        // Invoking moneyconversion to convert value and return
        obj.moneyConversion(currency_type, value);

        IO.closeScanner();
    }
}
