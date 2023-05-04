import static java.lang.System.out;

class NoTriangleException extends Exception {
    public NoTriangleException(String message) {
        super(message);
    }
}

class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws NoTriangleException {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new NoTriangleException("The provided side lengths do not form a triangle.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double base, double height) throws NoTriangleException {
        if (base <= 0 || height <= 0) {
            throw new NoTriangleException("Invalid base or height for right angled triangle");
        }

        this.a = base;
        this.b = height;
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double findArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double findPerimeter() {
        return a + b + c;
    }
}

public class java_2 {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(3, 4, 5);
            out.println("Area of t1: " + t1.findArea());
            out.println("Perimeter of t1: " + t1.findPerimeter());
        }

        catch (NoTriangleException e) {
            out.println(e.getMessage());
        }

        try {
            Triangle t2 = new Triangle(6, 8);
            out.println("Area of t2: " + t2.findArea());
            out.println("Perimeter of t2: " + t2.findPerimeter());
        }

        catch (NoTriangleException e) {
            out.println(e.getMessage());
        }

        try {
            Triangle t3 = new Triangle(1, 2, 3);
            out.println("Area of t3: " + t3.findArea());
            out.println("Perimeter of t3: " + t3.findPerimeter());
        }

        catch (NoTriangleException e) {
            out.println(e.getMessage());
        }
    }
}
