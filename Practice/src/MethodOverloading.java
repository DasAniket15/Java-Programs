class Area {
    static int area(int a, int b) {
        return (a * b);
    }

    static int area(int a) {
        return (a * a);
    }

    static double area(double r) {
        return (3.14 * r * r);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Area.area(1, 2));
        System.out.println(Area.area(2));
        System.out.println(Area.area(1.5));
    }
}
