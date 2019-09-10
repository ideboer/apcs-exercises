import java.util.Scanner;

public class Ex5
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int pounds, price, amount_over = 0;

        price = 20;

        System.out.println("Enter weight of the load of trash: ");
        pounds = scan.nextInt();

        if (pounds > 200)
        {
            amount_over = (pounds - 200) / 100;

            if ( ( (pounds - 200) % 100 ) > 0 )
            {
                amount_over += 1;
            }
        }

        price += (amount_over * 8) ;

        System.out.println("Charge: " + price);
    }
}