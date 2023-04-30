// TestCalculator file

package Q2.Test;

import static java.lang.System.out;

import Q2.Calculator.Calculation;

public class TestCalculator {
    public static void main(String[] args) {
        Calculation calculator = new Calculation();

        int a = 5, b = 3;

        out.printf("%d + %d = %d\n", a, b, calculator.add(a, b));
        out.printf("%d - %d = %d\n", a, b, calculator.sub(a, b));
        out.printf("%d * %d = %d\n", a, b, calculator.mul(a, b));
        out.printf("%d / %d = %.2f\n", a, b, calculator.div(a, b));
    }
}
