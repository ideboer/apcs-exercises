import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        String item;
        int delivery;
        double item_price, total_price;
        double deliv_price = 0;

        System.out.println("Enter the item: ");
        item = scan.nextLine();

        System.out.println("Enter the price: ");
        item_price = scan.nextDouble();

        System.out.println("Express delivery? (0==no, 1==yes): ");
        delivery = scan.nextInt();

        if (item_price < 10.0)
        {
            deliv_price +=2;
        }

        if (delivery == 1)
        {
            deliv_price += 3;
        }

        total_price = deliv_price + item_price;

        System.out.println("Invoice: ");
        System.out.println("\t" + item + "\t" + item_price);
        System.out.println("\tDelivery" + "\t" + deliv_price);
        System.out.println("\ttotal" + "\t" + total_price);
        
        
    }
}