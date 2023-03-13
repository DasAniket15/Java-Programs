public class StaticVar {
    static int count = 0; // Gets memory when instance is created

    StaticVar() {
        count++;
        System.out.println(count);
    }

    static int cube(int x) {
        return (x * x * x);
    }

    public static void main(String[] args) {
        StaticVar s1 = new StaticVar();
        StaticVar s2 = new StaticVar();
        StaticVar s3 = new StaticVar();

        System.out.println(cube(5));
    }
}
