import static java.lang.System.out;

// Parent class
class Account {
    private int accNo;
    private double balance;

    // Parameterized constructor
    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Displays account number and balance
    public void display() {
        out.printf("\n\nAccount Number: %d", accNo);
        out.printf("\nBalance: %.2f", balance);
    }
}

// Derived class from account
class Person extends Account {
    private String name;
    private int aadharNo;

    // Parameterized constructor
    public Person(int accNo, double balance, String name, int aadharNo) {
        super(accNo, balance);
        this.name = name;
        this.aadharNo = aadharNo;
    }

    // Override display method to display name and Aadhar number
    @Override
    public void display() {
        super.display();
        out.printf("\nName: %s", name);
        out.printf("\nAadhar Number: %d", aadharNo);
    }
}

// Main class to test the implementation
public class Q5 {
    public static void main(String[] args) {
        // Create 5 objects of the classes
        Person p1 = new Person(1, 10000, "Aniket", 1234);
        Person p2 = new Person(2, 14000, "Manas", 5678);
        Person p3 = new Person(3, 15000, "Ayush", 8910);
        Person p4 = new Person(4, 12000, "Asutosh", 1112);
        Person p5 = new Person(5, 0, "Abhisek", 1314);

        // Invoke display method to show data of created objects
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}
