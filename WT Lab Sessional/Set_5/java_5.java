package Set_5;

import static java.lang.System.out;

class Bit {
    private int x;

    public Bit(int x) {
        this.x = x;
    }

    public int GetX() {
        return x;
    }

    public void display() {
        out.print(x);
    }
}

class Four_Bit_Binary_No {
    private Bit B0, B1, B2, B3;

    public Four_Bit_Binary_No(int b0, int b1, int b2, int b3) {
        B0 = new Bit(b0);
        B1 = new Bit(b1);
        B2 = new Bit(b2);
        B3 = new Bit(b3);
    }

    public Four_Bit_Binary_No(Bit b0, Bit b1, Bit b2, Bit b3) {
        B0 = b0;
        B1 = b1;
        B2 = b2;
        B3 = b3;
    }

    public Four_Bit_Binary_No Find_1_Complement() {
        Bit b0 = new Bit(1 - B0.GetX());
        Bit b1 = new Bit(1 - B1.GetX());
        Bit b2 = new Bit(1 - B2.GetX());
        Bit b3 = new Bit(1 - B3.GetX());

        return new Four_Bit_Binary_No(b0, b1, b2, b3);
    }

    public void display() {
        B3.display();
        B2.display();
        B1.display();
        B0.display();
        out.println();
    }
}

public class java_5 {
    public static void main(String[] args) {
        Four_Bit_Binary_No binaryNo1 = new Four_Bit_Binary_No(1, 0, 1, 1);
        Four_Bit_Binary_No binaryNo2 = binaryNo1.Find_1_Complement();

        out.print("Binary No. 1: ");
        binaryNo1.display();
        out.print("Binary No. 1's 1's complement: ");
        binaryNo2.display();
    }
}
