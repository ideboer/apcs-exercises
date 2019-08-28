import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in);
        Double cost, hours, annual_cost;

        System.out.println("Enter cost per kilowatt-hour: ");
        cost = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year: ");
        hours = scan.nextDouble();

        annual_cost = cost * hours / 100;

        System.out.println("Annual cost: " + annual_cost);
    }
}