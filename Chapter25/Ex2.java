import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("enter number of guests: ");
        int n = scan.nextInt();
        double probability = 1;

        for (double count = 1; count < n; count ++)
        {
            probability *= ( (365 - count) / 365 );
        }

        System.out.println("probability that no guests share a birthday: " + probability);

        double probability2 = 1;
        int people = 0;

        for (double days = 365; probability2 > 0.50; days--)
        {
            probability2 *= (days / 365);
            people ++;
        }

        System.out.println(people + " guests are needed so there is a 50% chance that 2 share the same birthday.");
    }
}