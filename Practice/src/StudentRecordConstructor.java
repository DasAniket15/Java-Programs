public class StudentRecordConstructor {
    int id;
    String name;

    StudentRecordConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        StudentRecordConstructor s1 = new StudentRecordConstructor(1111, "Aniket");
        StudentRecordConstructor s2 = new StudentRecordConstructor(2222, "Ramshri");

        s1.display();
        s2.display();
    }
}
