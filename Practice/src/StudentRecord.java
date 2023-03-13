public class StudentRecord {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }

    public static void main(String[] args) {
        StudentRecord s1Record = new StudentRecord();
        StudentRecord s2Record = new StudentRecord();

        s1Record.insertRecord(1111, "Aniket");
        s2Record.insertRecord(2222, "Ramshri");

        s1Record.displayInformation();
        s2Record.displayInformation();
    }
}
