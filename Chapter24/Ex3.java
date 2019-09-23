import java.util.Scanner;

public class Ex3
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter N: ");
        int N = scan.nextInt();
        int sum = 0;

        for ( int count = 1; count <= N; count++ )
        {
            if ( (N % count) == 0 )
            {
                sum += count;
            }
        }

        System.out.println("Sum: " + sum);

        if (sum == N)
        {
            System.out.println("N is a perfect number");
        }
        else
        {
            System.out.println("not a perfect number")
        }
    }
}