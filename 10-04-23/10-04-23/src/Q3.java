import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input of string
        System.out.println("Enter string: ");
        String string = sc.nextLine();

        // Creating StringTokenizer with inputted string
        StringTokenizer st = new StringTokenizer(string);

        // Printing all tokens in StringTokenizer
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        sc.close();
    }
}
