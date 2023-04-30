// Q5

import java.util.Scanner;
import static java.lang.System.out;

// Abstract Bank class with ROI data member and abstract RateOfInterest() method
abstract class Bank {
    double ROI;

    abstract void RateOfInterest();
}

class HDFC extends Bank {
    HDFC(double ROI) {
        this.ROI = ROI;
    }

    @Override
    void RateOfInterest() {
        out.printf("\nHDFC Rate of Interest: %.2f%%", ROI);
    }
}

class SBI extends Bank {
    SBI(double ROI) {
        this.ROI = ROI;
    }

    @Override
    void RateOfInterest() {
        out.printf("\nSBI Rate of Interest: %.2f%%", ROI);
    }
}

class Kotak extends Bank {
    Kotak(double ROI) {
        this.ROI = ROI;
    }

    @Override
    void RateOfInterest() {
        out.printf("\nKotak Rate of Interest: %.2f%%", ROI);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.print("Enter HDFC Rate of Interest: ");
        double hdfcROI = sc.nextDouble();
        HDFC hdfc = new HDFC(hdfcROI);

        out.print("Enter SBI Rate of Interest: ");
        double sbiROI = sc.nextDouble();
        SBI sbi = new SBI(sbiROI);

        out.print("Enter Kotak Rate of Interest: ");
        double kotakROI = sc.nextDouble();
        Kotak kotak = new Kotak(kotakROI);

        // Demonstrating runtime polymorphism using Bank reference variable
        Bank bank;

        bank = hdfc;
        bank.RateOfInterest();

        bank = sbi;
        bank.RateOfInterest();

        bank = kotak;
        bank.RateOfInterest();

        sc.close();
    }
}
