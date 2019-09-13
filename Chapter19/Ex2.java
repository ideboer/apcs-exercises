import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int n, loop_sum = 0;
        int formula_sum = 0;
        int count = 0;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        while (count <= n)
        {
            loop_sum += count;
            count += 1;
        }

        System.out.println("Loop Sum: " + loop_sum);

        formula_sum = ( n * ( n + 1 ) ) / 2;

        System.out.println("Formula Sum: " + formula_sum);

    }
}