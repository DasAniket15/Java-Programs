public class AbstractClass {
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class TestAbstraction {
    public static void main(String[] args) {
        // Normal calling of method in rectangle class
        Rectangle r = new Rectangle();
        r.draw();

        // Using runtime polymorphism
        Shape s = new Circle();
        s.draw();
    }
}
