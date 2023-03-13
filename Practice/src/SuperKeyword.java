public class SuperKeyword {
}

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle created");
    }

    int speed = 50;
}

class Bike extends Vehicle {
    Bike() {
        super();
        System.out.println("Bike created");
    }

    int speed = 100;

    void display() {
        System.out.println(speed);
    }

    void displaySuper() {
        System.out.println(super.speed);
    }

    public static void main(String[] args) {
        Bike b = new Bike();

        b.display();
        b.displaySuper();
    }
}
