import static java.lang.System.out;

public class Q3 {
    public static void main(String[] args) {
        String string = "I am proud to be a KIIT Student";

        // Implementation of replace() with target sequences
        out.println("Implementation of replace() with target sequences: ");
        String replacedString = string.replace("am", "am not");
        out.println(replacedString + "\n");

        // Implementation of trim()
        out.println("Implementation of trim(): ");
        String trimmedString = string.trim();
        out.println(trimmedString + "\n");

        // Implementation of split()
        out.println("Implementation of split(): ");
        String[] arrOfSplitString = string.split(" ");
        for (String i : arrOfSplitString)
            out.println(i);

        // Implementation of charat()
        out.println("\nImplementation of charat(): ");
        char charAtIndex = string.charAt(0);
        out.println(charAtIndex + "\n");

        // Implementation of substring()
        out.println("Implementation of substring(): ");
        String substring = string.substring(0, 10);
        out.println(substring);
    }
}
