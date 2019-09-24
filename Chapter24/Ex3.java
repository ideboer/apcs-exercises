import java.util.Scanner;

public class Ex3
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        int sum = 0;

        for ( int count = 1; count < n; count ++ )
        {
            if ( (n % count) == 0 )
            {
                sum += count;
            }
        }

        System.out.println("Sum: " + sum);

        if (sum == n)
        {
            System.out.println("N is a perfect number");
        }
        else
        {
            System.out.println("not a perfect number");
        }
    }
}