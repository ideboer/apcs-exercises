import java.util.Scanner;

public class Ex4
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int weight;

        System.out.println("How much do you weigh: ");
        weight = scan.nextInt();
        
        if ( ( weight > 280 ) || ( weight < 220 ) )
        {
            System.out.println("Not allowed");
        }
        else
        {
            System.out.println("Allowed");
        }
    }
}