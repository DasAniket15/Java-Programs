public class InnerClass {
    int num;

    class NestedClass {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    void displayNested() {
        NestedClass inner = new NestedClass();
        inner.print();
    }
}

class MainClass {
    public static void main(String[] args) {
        InnerClass outer = new InnerClass();

        outer.displayNested();
    }
}
