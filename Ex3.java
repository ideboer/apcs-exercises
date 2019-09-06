import java.util.Scanner;

public class Ex3
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int tank_capacity, gage_reading, mpg;

        System.out.println("Tank capacity: ");
        tank_capacity = scan.nextInt();
        System.out.println("Gage reading: ");
        gage_reading = scan.nextInt();
        System.out.println("Miles per gallon: ");
        mpg = scan.nextInt();

        if ( ( (tank_capacity * gage_reading / 100.0) * mpg ) < 200 )
        {
            System.out.println("Get Gas!");
        }
        else
        {
            System.out.println("Safe to proceed");
        }
    }
}
