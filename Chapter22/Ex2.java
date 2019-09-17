import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int final_miles, gallons, mpg, init_miles = 0;

        System.out.println("Miles Per Gallon Program");

        while (true)
        {
            System.out.println("Initial miles:");
            init_miles = scan.nextInt();

            if (init_miles < 0)
            {
                break;
            }
            else
            {
                System.out.println("Final miles:");
                final_miles = scan.nextInt();
                System.out.println("Gallons:");
                gallons = scan.nextInt();
            }

            mpg = (final_miles - init_miles) / gallons;
            System.out.println("Miles per Gallon: " + mpg);

        }
        
        System.out.println("Bye");

    }
}