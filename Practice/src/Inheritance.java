public class Inheritance {
}

class Employee {
    String employee = "Aniket";
}

class Programmer extends Employee {
    float salary = 10000;
}

class Benefits extends Programmer {
    float bonus = 10000;

    public static void main(String[] args) {
        Benefits b = new Benefits();

        System.out.println("Programmer name: " + b.employee);
        System.out.println("Programmer salary: " + b.salary);
        System.out.println("Bonus of programmer: " + b.bonus);
    }
}
