import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int amount_purchase, price;

        System.out.println( "Enter amount of purchases: ");
        amount_purchase = scan.nextInt();

        if (amount_purchase > 1000)
        {
            price = amount_purchase * 9 / 10;
            System.out.println("Discounted price: " + price );
        }
        else
        {
            System.out.println("No discount. Price: " + amount_purchase);
        }
    }
}