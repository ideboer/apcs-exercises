import java.util.Scanner;

public class Ex3V2
{
    public static void main( String [] args )
    {
        Scanner scan = new Scanner( System.in );
        double X, total = 1;
        int N, count = 1;

        System.out.println("Enter X");
        X = scan.nextDouble();
        System.out.println("Enter N");
        N = scan.nextInt();

        if (N < 0)
        {
            System.out.println("N must be a positive integer");
        }
        else
        {
            while (count <= N)
            {
                total = total * X;
                count ++;
            }

            System.out.println(X + " raised to the power of " + N + " is: " + total);
        }

        
    }
}