import java.util.Scanner;

public class Ex3
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Double X, answer;

        System.out.println("Enter a double: ");
        X = scan.nextDouble();

        answer = Math.log(X) / Math.log(2);

        System.out.println("Base 2 log of " + X + " is " + answer);
    }
}