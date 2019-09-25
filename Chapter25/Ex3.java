import java.util.Scanner;

public class Ex3
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter an upper limit: ");
        double upperLimit = scan.nextDouble();
        boolean perfectSquare = false;
        boolean triangle = false;

        for (int number = 1; number <= upperLimit; number++)
        {
            for (int i = 1; i * i <= number; i++)
            {
                if ( (number % i) == 0 && (number / i ) == i)
                {
                    perfectSquare = true;
                }
            }

            int originalNumber = number;

            for (int count = 1; count <= originalNumber; count++)
            {
                originalNumber -= count;
                if ( originalNumber == 0 )
                {
                    triangle = true;
                }
            }

            if (perfectSquare && triangle)
            {
                System.out.println(number);
            }

            perfectSquare = false;
            triangle = false;
        }
    }
}