import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int dollars, cents, input;

        System.out.println( "Input the cents: " );
        input = scan.nextInt();

        dollars = input / 100;
        cents = input % 100;

        System.out.println( "That is " + dollars + " dollars and " + cents + " cents.");

    }
}