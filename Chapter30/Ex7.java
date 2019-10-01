import java.util.*;

public class Ex7
{
    public static void main( String[] args )
    {
        Random random = new Random();

        double X = 0.0;
        double Y = 0.0;

        int iterations = 100;

        for (int count = 0; count < iterations; count ++)
        {
            X += ( 2 * random.nextDouble() - 1);
            Y += ( 2 * random.nextDouble() - 1);
        }

        double distance = Math.sqrt( (X * X) + (Y * Y) );

        System.out.println("Coordinates are: (" + X + ", " + Y + "). ");
        System.out.println("Distance from the origin is: " + distance);
    }
}