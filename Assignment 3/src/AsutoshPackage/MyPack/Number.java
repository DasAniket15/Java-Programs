package AsutoshPackage.MyPack;

public class Number {
    int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int find_factorial() {
        int fact = 1;

        for (int i = 1; i <= value; i++) {
            fact *= i;
        }

        return fact;
    }
}
