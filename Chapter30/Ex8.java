import java.util.*;

public class Ex8
{
    public static void main( String[] args )
    {
        int rounds;
        String firstPlayer, secondPlayer;
        double firstGuess, secondGuess, firstAway, secondAway;
        
        System.out.println("How many rounds? ");
        rounds = scan.nextInt();

        System.out.println("First player, sign in");
        firstPlayer = scan.nextLine();

        System.out.println("Second player, sign in");
        secondPlayer = scan.nextLine();

        for (count = 0; count < rounds; count++)
        {
            double number = 100 * random.nextDouble();

            System.out.println("What is the square root of " + number + "?");

            if (count % 2 == 1)
            {
                System.out.println(firstPlayer + ", your guess: ")
                firstGuess = scan.nextDouble();

                System.out.println(secondPlayer + ", your guess: ")
                secondGuess = scan.nextDouble();
            }
            else
            {
                System.out.println(secondPlayer + ", your guess: ")
                secondGuess = scan.nextDouble();

                System.out.println(firstPlayer + ", your guess: ")
                firstGuess = scan.nextDouble();
            }

            correctNum = Math.sqrt(number);

            firstAway = Math.abs(correct - firstGuess);
            secondAway = Math.abs(correct - secondGuess);

            if
        }
        
    }
}