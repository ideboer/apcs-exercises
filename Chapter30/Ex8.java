import java.util.*;

public class Ex8
{
    public static void main( String[] args )
    {
        Random random = new Random();
        Scanner scan = new Scanner( System.in );
        
        int rounds, firstWins = 0;
        int secondWins = 0;
        String firstPlayer, secondPlayer;
        double firstGuess, secondGuess, firstAway, secondAway;
        
        System.out.println("How many rounds? ");
        rounds = scan.nextInt();
        scan.nextLine();

        System.out.println("First player, sign in");
        firstPlayer = scan.nextLine();

        System.out.println("Second player, sign in");
        secondPlayer = scan.nextLine();

        for (int count = 0; count < rounds; count++)
        {
            double number = 99 * random.nextDouble() + 1;

            System.out.println("What is the square root of " + number + "?");

            if (count % 2 == 1)
            {
                System.out.println(firstPlayer + ", your guess: ");
                firstGuess = scan.nextDouble();

                System.out.println(secondPlayer + ", your guess: ");
                secondGuess = scan.nextDouble();
            }
            else
            {
                System.out.println(secondPlayer + ", your guess: ");
                secondGuess = scan.nextDouble();

                System.out.println(firstPlayer + ", your guess: ");
                firstGuess = scan.nextDouble();
            }

            double correctNum = Math.sqrt(number);

            firstAway = Math.abs(correctNum - firstGuess);
            secondAway = Math.abs(correctNum - secondGuess);

            System.out.println("The correct square root: " + correctNum);
            System.out.println(firstPlayer + " is " + firstAway + " away");
            System.out.println(secondPlayer + " is " + secondAway + " away");

            if (firstAway < secondAway)
            {
                firstWins += 1;
                System.out.println(firstPlayer + " wins!");
            }
            else if (secondAway < firstAway)
            {
                secondWins += 1;
                System.out.println(secondPlayer + " wins!");
            }
            else
            {
                System.out.println("Its a tie!");
            }
        }

        System.out.println("---- Final Score ----");
        System.out.println(firstPlayer + ":\t" + firstWins + "\t" + secondPlayer + ": \t" + secondWins);
        
    }
}