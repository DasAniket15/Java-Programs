public class RuntimePolymorphism {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        Bank b3 = new AXIS();

        System.out.println(b1.getRateOfInterest());
        System.out.println(b2.getRateOfInterest());
        System.out.println(b3.getRateOfInterest());
    }
}
