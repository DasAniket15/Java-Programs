import static java.lang.System.out;

// Parent class
class Shape {
    public void draw() {
        out.println("\nDrawing Shape");
    }

    public void erase() {
        out.println("\nErasing Shape");
    }
}

// Derived class from shape for circle
class Circle_Q4 extends Shape {
    @Override
    public void draw() {
        out.println("\nDrawing Circle");
    }

    @Override
    public void erase() {
        out.println("\nErasing Circle");
    }
}

// Derived class from shape for triangle
class Triangle_Q4 extends Shape {
    @Override
    public void draw() {
        out.println("\nDrawing Triangle");
    }

    @Override
    public void erase() {
        out.println("\nErasing Triangle");
    }
}

// Derived class from shape for square
class Square_Q4 extends Shape {
    @Override
    public void draw() {
        out.println("\nDrawing Square");
    }

    @Override
    public void erase() {
        out.println("\nErasing Square");
    }
}

// Main class to test the implementation
public class Q4 {
    public static void main(String[] args) {
        // Create objects of the classes
        Circle_Q4 circle = new Circle_Q4();
        Triangle_Q4 triangle = new Triangle_Q4();
        Square_Q4 square = new Square_Q4();

        // Invoke draw and erase methods to check polymorphism
        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}
