// Calculate area and perimeter of rectangle

import java.util.Scanner;

public class AreaPerimeterCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions of rectangle:");
        int rect_width = sc.nextInt();
        int rect_length = sc.nextInt();

        int rect_area = (rect_length * rect_width);
        int rect_perimeter = (2 * (rect_length + rect_width));

        System.out.printf("Rectangle area = %s\n", rect_area);
        System.out.printf("Rectangle perimeter = %s", rect_perimeter);

        sc.close();
    }
}
