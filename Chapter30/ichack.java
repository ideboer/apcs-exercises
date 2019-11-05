import java.util.*;

public class ichack
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        Random random = new Random();
        
        String choices = "1234567890";
        boolean guess = false;
        String password = "";

        System.out.println("Enter your ic password: ");
        String realPassword = scan.nextLine();

        System.out.println("Here is your password: " + realPassword);
        int i;

        for (i = 0; !guess; i++)
        {
            for (int count = 0; count < 6; count ++)
            {
                password = password + choices.charAt( random.nextInt(choices.length() ) );
                if (password.equals("Dcsd" + realPassword))
                {
                    guess = true;
                }
            }
            password = "";
        }

        System.out.println("It took " + i + " tries to guess it.");

    }
}