import java.util.Scanner;

public class Ex4
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int voltage, resistance;
        float current;

        System.out.println("Input the voltage: ");
        voltage = scan.nextInt();
        System.out.println("Input the resistance: ");
        resistance = scan.nextInt();

        current = (float)voltage / resistance;

        System.out.println( "The current is : " + current);

    }
}