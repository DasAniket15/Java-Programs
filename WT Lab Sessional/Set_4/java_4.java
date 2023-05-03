package Set_4;

import static java.lang.System.out;

interface Area {
    double find_area();
}

interface Volume {
    double find_volume();
}

class Square implements Area {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double find_area() {
        return side * side;
    }
}

class Cube implements Volume {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    public double find_volume() {
        return side * side * side;
    }
}

public class java_4 {
    public static void main(String[] args) {
        // Create objects of Square and Cube classes
        Square square = new Square(5);
        Cube cube = new Cube(3);

        // Calculate area and volume of objects using polymorphism
        Area shape1 = square;
        Volume shape2 = cube;
        double area = shape1.find_area();
        double volume = shape2.find_volume();

        // Display the area and volume of objects
        out.printf("Area of square: %.2f", area);
        out.printf("\nVolume of cube: %.2f", volume);
    }
}
