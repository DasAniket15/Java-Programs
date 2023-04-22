import static java.lang.System.out;

// Parent class
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Default constructor
    public TwoDShape() {
        this.width = 0.0;
        this.height = 0.0;
        this.name = "null";
    }

    // Parameterized constructor
    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    // Copy constructor
    public TwoDShape(TwoDShape shape) {
        this.width = shape.width;
        this.height = shape.height;
        this.name = shape.name;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Show dimensions
    public void showDimensions() {
        out.println("\nName: " + getName());
        out.println("Width: " + getWidth());
        out.println("Height: " + getHeight());
    }

    // Abstract method to calculate area
    abstract double area();
}

// Derived class Triangle
class Triangle extends TwoDShape {
    public Triangle() {
        super();
    }

    public Triangle(double width, double height, String name) {
        super(width, height, name);
    }

    public Triangle(Triangle triangle) {
        super(triangle);
    }

    // Override area method to calculate triangle area
    @Override
    public double area() {
        return 0.5 * getWidth() * getHeight();
    }
}

// Derived class Rectangle
class Rectangle extends TwoDShape {
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height, String name) {
        super(width, height, name);
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
    }

    // Override area method to calculate rectangle area
    @Override
    public double area() {
        return getWidth() * getHeight();
    }
}

// Main class to test the implementation
public class Q2 {
    public static void main(String[] args) {
        // Create objects of the classes
        Triangle triangle = new Triangle(10, 20, "Triangle");
        Rectangle rectangle = new Rectangle(10, 20, "Rectangle");

        // Show dimensions of objects
        triangle.showDimensions();
        rectangle.showDimensions();

        // Calculate and display areas
        out.println("\nTriangle Area: " + triangle.area());
        out.println("\nRectangle Area: " + rectangle.area());
    }
}
