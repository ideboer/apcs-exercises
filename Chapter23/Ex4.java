import java.util.Scanner;

public class Ex4
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int x, count = 1;
        double sum = 0;
        double currentExponent = 1;
        double currentTerm = 1;
        double e = Math.exp(1);

        System.out.println("enter X: ");
        x = scan.nextInt();
        int factorialCount = x - 1;
        int currentFactorial = x;

        while (factorialCount >= 1)
        {
            currentFactorial = currentFactorial * factorialCount;
            factorialCount --;
        }

        while (currentTerm >= 1.0e-12)
        {
            currentExponent = Math.pow(x, count);

            currentTerm = (currentExponent / currentFactorial);
            sum += currentTerm;
            System.out.println(currentTerm);
            count ++;
        }

        System.out.println("my e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));
    }
}