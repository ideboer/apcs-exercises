import java.util.*;

public class Ex5
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        Random random = new Random();
        
        String choices = "abcdefghijklmnopqrstuvwxyz";
        choices = choices + choices.toUpperCase();
        choices = choices + "`~1!2@3#4$5%6^7&8*9(0)-_=+[{]}<,>.?/";
        boolean guess = false;
        String password = "";

        System.out.println("Enter a secret password: ");
        String realPassword = scan.nextLine();

        System.out.println("Here is your password: " + realPassword);
        int i;

        for (i = 0; !guess; i++)
        {
            for (int count = 0; count < 3; count ++)
            {
                password = password + choices.charAt( random.nextInt(choices.length() ) );
                if (password.equals(realPassword))
                {
                    guess = true;
                }
            }
            password = "";
        }

        System.out.println("It took " + i + " tries to guess it.");

    }
}