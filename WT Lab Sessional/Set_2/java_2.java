package Set_2;

import static java.lang.System.out;

class Bit {
    int x;

    public Bit(int x) {
        this.x = x;
    }

    public int get() {
        return x;
    }
}

class Half_Adder {
    Bit a, b;

    public Half_Adder(Bit a, Bit b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a.get() ^ b.get(); // XOR operation
    }

    public int carry() {
        return a.get() & b.get(); // AND operation
    }
}

public class java_2 {
    public static void main(String[] args) {
        // Create two objects of Bit class for two bits
        Bit a = new Bit(0);
        Bit b = new Bit(1);

        // Add two bits together
        Half_Adder halfAdder = new Half_Adder(a, b);

        out.println("Sum: " + halfAdder.sum());
        out.println("Carry: " + halfAdder.carry());
    }
}
