import java.util.Scanner;
import java.util.Random;

public class Ex5
{
    public static void main( String [] args )
    {
        Scanner scan = new Scanner( System.in );
        Random random = new Random();
        int random1, random2, answer, count = 1;
        int numCorrect = 0;
        
        while (count < 10)
        {
            random1 = random.nextInt(10);
            random2 = random.nextInt(10);

            System.out.println("What is " + random1 + " * " + random2 + "?");
            answer = scan.nextInt();

            if (answer == (random1 * random2))
            {
                System.out.println("Right!");
                numCorrect ++;
            }
            else
            {
                System.out.println("wrong. " + random1 + " * " + random2 + " is " + (random1 * random2));
            }

            System.out.println(" ");

            count ++;

        }
        System.out.println("You got " + numCorrect + " out of 10 correct.");

    }
}