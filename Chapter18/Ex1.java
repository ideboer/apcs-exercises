import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        double checking, savings, charge, num_of_checks;

        System.out.println("Enter balance in checking account: ");
        checking = scan.nextDouble();

        System.out.println("Enter balance in savings account: ");
        savings = scan.nextDouble();

        System.out.println("Enter number of checks: ");
        num_of_checks = scan.nextDouble();

        if ( ( checking > 1000 ) || ( savings > 1500 ) )
        {
            charge = 0;
        }
        else
        {
            charge = num_of_checks * 0.15;
        }

        System.out.println("service charge: " + charge );
        
    }
}

// I could have ordered the if statement differently, but this way made more sense to me