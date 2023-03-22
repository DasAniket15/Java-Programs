// Find roots of quadratic equation

import java.util.Scanner;

public class QuadraticRoots
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coefficient values:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double root1, root2;

        double determinant = b * b - 4 * a * c;

        if (determinant > 0)
        {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        else if (determinant == 0)
        {
            root1 = root2 = -b / (2 * a);

            System.out.printf("root1 = root2 = %.2f;", root1);
        }

        else
        {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);

            System.out.printf("root1 = %.2f+%.2fi", real, imaginary);
            System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

        sc.close();
    }    
}
