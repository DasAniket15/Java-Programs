public class Q1 {
    public static void main(String[] args) {
        String string = "StringExample";

        System.out.println("Inputted string: " + string);

        // Find length of string
        int stringLength = string.length();
        System.out.println("String length: " + string);

        // Display content of string character by character
        for (int i = 0; i < stringLength; i++) {
            System.out.println(string.charAt(i) + " ");
        }

        // Convert to uppercase or vice versa
        for (int i = 0; i < stringLength; i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                Character.toUpperCase(string.charAt(i));
            }

            else {
                Character.toLowerCase(string.charAt(i));
            }
        }

        // Displaying newly-cased string
        for (int i = 0; i < stringLength; i++) {
            System.out.println(string.charAt(i) + " ");
        }
    }
}
