import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        double sum = 0;
        double count = 1;
        double n;

        System.out.println("Enter N");
        n = scan.nextDouble();

        while( count <= n)
        {
            sum += (1.0 / count);
            count ++;
        }

        System.out.println("Sum is: " + sum);
    }
}