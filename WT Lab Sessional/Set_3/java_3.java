package Set_3;

import static java.lang.System.out;

public class java_3 {
    private int message;

    public java_3() {
        this.message = 0;
    }

    public java_3(int message) {
        this.message = message;
    }

    public void Do_Encrypt() {
        int temp = message;
        int encrypted = 0;
        int place = 1;

        while (temp > 0) {
            int digit = temp % 10;
            encrypted += (9 - digit) * place;
            place *= 10;
            temp /= 10;
        }

        message = encrypted;
    }

    public void Do_Decrypt() {
        int temp = message;
        int decrypted = 0;
        int place = 1;

        while (temp > 0) {
            int digit = temp % 10;
            decrypted += (9 - digit) * place;
            place *= 10;
            temp /= 10;
        }

        message = decrypted;
    }

    public int getMessage() {
        return message;
    }

    public static void main(String[] args) {
        java_3 ed1 = new java_3(123456);
        out.println("Original message: " + ed1.getMessage());

        ed1.Do_Encrypt();
        out.println("Encrypted message: " + ed1.getMessage());

        ed1.Do_Decrypt();
        out.println("Decrypted message: " + ed1.getMessage());
    }
}
