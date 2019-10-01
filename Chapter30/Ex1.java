import java.util.*;

public class Ex1
{
    public static void main( String[] args )
    {
        Random random= new Random();
        Scanner scan = new Scanner( System.in );
        int playerGuess, myNumber;
        boolean over = false;

        myNumber = random.nextInt( 11 );

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in 3 tries.");
        
        for (int count = 0; count < 3 && !over; count ++)
        {
            System.out.println("Enter a guess:");
            playerGuess = scan.nextInt();

            if (playerGuess == myNumber)
            {
                System.out.println("RIGHT!");
                System.out.println("You have won the game");
                over = true;
            }
            else
            {
                System.out.println("wrong");
            }
        }

        if (!over)
        {
            System.out.println("The correct number was " + myNumber);
            System.out.println("You have lost the game.");
        }

       
    }
}