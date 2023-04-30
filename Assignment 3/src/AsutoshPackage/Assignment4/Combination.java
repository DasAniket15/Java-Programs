package AsutoshPackage.Assignment4;

import AsutoshPackage.MyPack.Number;
import static java.lang.System.out;

public class Combination {
    public static void main(String[] args) {
        Number num1 = new Number(5);
        Number num2 = new Number(3);

        int n_r = num1.getValue() - num2.getValue();
        Number num3 = new Number(n_r);

        int combination = num1.find_factorial() / (num2.find_factorial() * num3.find_factorial());

        out.println("Combination of " + num1.getValue() + " and " + num2.getValue() + " is " + combination);
    }
}
