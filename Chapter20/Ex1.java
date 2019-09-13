import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int num_of_int, count = 0;
        int sum = 0;

        System.out.println("How many integers will be added: ");
        num_of_int = scan.nextInt();

        while (count < num_of_int)
        {
            System.out.println("Enter an integer: ");
            sum += scan.nextInt();

            count ++;
        }

        System.out.println("the sum is " + sum);
    }
}