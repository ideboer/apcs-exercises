import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;
        int bolts, nuts, washers, price;

        System.out.println("Number of bolts: ");
        bolts = scan.nextInt();
        System.out.println("Number of nuts: ");
        nuts = scan.nextInt();
        System.out.println("Number of washers: ");
        washers = scan.nextInt();

        price = (bolts * boltPrice) + (nuts * nutPrice) + (washers * washerPrice);

        if ( (bolts > nuts) && ( (2 * washers) < bolts) )
        {
            System.out.println("Check the order: too few nuts");
            System.out.println("Check the order: too few washers");
        }
        else if (bolts > nuts)
        {
            System.out.println("Check the order: too few nuts");
        }
        else if ( (2 * washers) < bolts )
        {
            System.out.println("Check the order: too few washers");
        }
        else
        {
            System.out.println("Order is OK");
        }

        System.out.println("Total cost: " + price);


    }
}