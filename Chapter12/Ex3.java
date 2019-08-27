import java.util.Scanner;

public class Ex3
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int dollars, quarters, dimes, nickels, cents, dollars_remainder, quarters_remainder, dimes_remainder, input;

        System.out.println("Input your cents: ");
        input = scan.nextInt();

        dollars = input / 100;
        dollars_remainder = input % 100;
        quarters = dollars_remainder / 25;
        quarters_remainder = dollars_remainder % 25;
        dimes = quarters_remainder / 10;
        dimes_remainder = quarters_remainder % 10;
        nickels = dimes_remainder / 5;
        cents = dimes_remainder % 5;

        System.out.println( "Your change is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + cents + " cents.");

    }
}