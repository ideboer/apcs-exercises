import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        int sum = 0;

        for ( int count = 1; count <= n; count ++)
        {
            if ( (count % 2) == 1 )
            {
                sum += count;
            }
        }

        System.out.println("sum of all odd integers: " + sum);
        System.out.println("n^2: " + (n * n) );
    }
}