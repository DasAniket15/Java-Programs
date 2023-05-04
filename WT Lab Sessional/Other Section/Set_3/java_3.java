import static java.lang.System.out;

class NotEligibleException extends Exception {
    public NotEligibleException() {
        super("Student is not eligible");
    }
}

class Result {
    private int total_papers;
    private int back_papers;

    public void SetData(int total_papers, int back_papers) {
        this.total_papers = total_papers;
        this.back_papers = back_papers;
    }

    public int getTotalPapers() {
        return total_papers;
    }

    public int getBackPapers() {
        return back_papers;
    }
}

class Student {
    private String name;
    private int roll_no;
    private Result result;

    public Student() {
        this.name = "";
        this.roll_no = 0;
        this.result = new Result();
    }

    public Student(String name, int roll_no, Result result) {
        this.name = name;
        this.roll_no = roll_no;
        this.result = result;
    }

    public void test_Eligible() throws NotEligibleException {
        int total_papers = result.getTotalPapers();
        int back_papers = result.getBackPapers();
        double percentage_back_papers = (double) back_papers / total_papers * 100;

        if (percentage_back_papers >= 20) {
            throw new NotEligibleException();
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + roll_no + ", Result: Total Papers = " + result.getTotalPapers()
                + ", Back Papers = " + result.getBackPapers();
    }
}

public class java_3 {
    public static void main(String[] args) {
        // Create a Result object and set its data
        Result result = new Result();
        result.SetData(6, 1);

        // Create a Student object with the Result object
        Student student = new Student("John Doe", 12345, result);

        // Test eligibility
        try {
            student.test_Eligible();
            out.println("Eligible");
        }

        catch (NotEligibleException e) {
            out.println("Not Eligible: " + e.getMessage());
        }

        // Print the description of the Student object
        out.println(student);
    }
}
