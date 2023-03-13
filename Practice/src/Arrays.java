import java.util.Scanner;

public class Arrays {
    static int length;
    static int arr[];

    static void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");
        length = sc.nextInt();

        arr = new int[length];

        System.out.println("Enter integer elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    static void display() {
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s ", arr[i]);
        }
    }

    public static void main(String[] args) {
        input();
        display();
    }
}
