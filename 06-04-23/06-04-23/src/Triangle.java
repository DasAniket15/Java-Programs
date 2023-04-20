public class Triangle
{
    // Variables for sides of triangle
    public double a, b, c;


    // Constructor Exception for Triangle Formation
    public Triangle(double a, double b, double c) throws NoTriangleFormException
    {
        if (((a + b) > c) &&  ((b + c) > a) && ((c + a) > b))
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        else
        {
            throw new NoTriangleFormException();
        }
    }


    // Method for calculating triangle area
    private double find_area()
    {
        double s = (a + b + c) / 2;
        return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    
    // Method for calculating triangle perimeter
    private double find_perimeter()
    {
        return (a + b + c);
    }
}


class NoTriangleFormException extends Exception
{
    public NoTriangleFormException()
    {
        super();
    }


    String soString()
    {
        return "No Triangle Formed.";
    }
}