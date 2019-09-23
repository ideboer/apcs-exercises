import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        double N, years = 0;
        double power = 1;

        for ( int t = 0; t < 25; t++)
        {
            power *= 0.83;
            N = 220 / (1 + 10 * power );
            System.out.println("N: " + N);

            if (years == 0 && N >= 80)
            {
                years = t;
            }
        }

        System.out.println("the sheep must be supervised for " + years + " years.");
    }
}