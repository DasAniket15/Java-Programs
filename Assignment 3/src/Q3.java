// Q3

import java.io.*;
import static java.lang.System.out;

public class Q3 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            int ch;

            while ((ch = reader.read()) != -1) {
                if (isSpecialCharacter((char) ch)) {
                    writer.write(ch);
                }
            }

            reader.close();
            writer.close();

            out.println("New file contents:");
            FileReader reader2 = new FileReader(outputFile);
            while ((ch = reader2.read()) != -1) {
                out.print((char) ch);
            }

            reader2.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isSpecialCharacter(char ch) {
        String specialCharsRegex = "[^a-zA-z0-9]";

        if (specialCharsRegex.contains(Character.toString(ch))) {
            return true;
        }

        return false;
    }
}
