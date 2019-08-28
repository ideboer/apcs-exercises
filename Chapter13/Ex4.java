import java.util.Scanner;

public class Ex4
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        Double X, Y, arithmetic_mean, harmonic_mean;

        System.out.println("Enter X: ");
        X = scan.nextDouble();
        System.out.println("Enter Y: ");
        Y = scan.nextDouble();

        arithmetic_mean = (X + Y) / 2;
        harmonic_mean = 2 / ((1 / X) + (1 / Y));

        System.out.println("Arithemtic mean: " + arithmetic_mean);
        System.out.println("Harmonic mean: " + harmonic_mean);

    }
}