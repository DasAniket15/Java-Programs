package Set_1;

import static java.lang.System.out;
import java.util.Arrays;

class Vector {
    private int[] vector;

    public Vector(int[] vector) {
        this.vector = vector;
    }

    public Vector(int size) {
        this.vector = new int[size];
    }

    public int getSize() {
        return this.vector.length;
    }

    public void setElement(int index, int value) {
        this.vector[index] = value;
    }

    public int getElement(int index) {
        return this.vector[index];
    }

    public void vector_add(Vector v) {
        if (this.vector.length != v.getSize()) {
            out.println("Error: Vectors must have same size to add them.");
            return;
        }

        for (int i = 0; i < this.vector.length; i++) {
            this.vector[i] += v.getElement(i);
        }
    }

    public String toString() {
        return Arrays.toString(this.vector);
    }
}

public class java_1 {
    public static void main(String[] args) {
        // Create objects of Vector class for two vector objects
        Vector v1 = new Vector(new int[] { 1, 2, 3 });
        Vector v2 = new Vector(3);

        v2.setElement(0, 4);
        v2.setElement(1, 5);
        v2.setElement(2, 6);

        out.println("v1: " + v1.toString());
        out.println("v2: " + v2.toString());

        v1.vector_add(v2);
        out.println("v1 + v2: " + v1.toString());
    }
}
