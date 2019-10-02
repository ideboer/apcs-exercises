import java.util.*;

public class Ex9
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        Random random = new Random();

        int playerPoints = 0;
        int compPoints = 0;
        int workingScore = 0;
        String answer = "y";
        int roll;

        while (playerPoints < 100 && compPoints < 100)
        {
            compPoints = 0;
            compPoints += (random.nextInt(6) + 1) + (random.nextInt(6) + 1) + (random.nextInt(6) + 1);

            System.out.println("roll? (y or n)");
            answer = scan.nextLine();
            
            while (answer.equals("y"))
            {
                roll = 0;
                roll = (random.nextInt(6) + 1);
                System.out.println("you rolled: " + roll);
                if (roll == 1)
                {
                    workingScore = 0;
                    answer = "n";
                }
                else
                {
                    workingScore += roll;
                    System.out.println("roll? (y or n)");
                    answer = scan.nextLine();
                }

            }

            playerPoints += workingScore;
            workingScore = 0;

            System.out.println("player points: " + playerPoints + " comp points" + compPoints);
        }

        if (playerPoints >= 100)
        {
            System.out.println("player wins!");
        }
        else
        {
            System.out.println("computer wins.");
        }
    }
}