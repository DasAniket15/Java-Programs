public class ScopeVariables {
    static int x = 11;
    private int y = 33;

    public void method1(int x) {
        ScopeVariables s = new ScopeVariables();
        this.x = 22;
        ScopeVariables e = new ScopeVariables();
        y = 44;

        System.out.println("ScopeVariables.x:" + ScopeVariables.x);
        System.out.println("s.x:" + s.x);
        System.out.println("x:" + x);
        System.out.println("s.y:" + s.y);
        System.out.println("y:" + y);
        System.out.println("e.x:" + e.x);
    }

    public static void main(String[] args) {
        ScopeVariables s = new ScopeVariables();
        s.method1(5);
    }
}
