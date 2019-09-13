import java.util.Scanner;

public class Ex3
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        String first, second;
        int dots_num, i = 0;

        System.out.println("Enter first word: ");
        first = scan.nextLine();

        System.out.println("Enter second word: ");
        second = scan.nextLine();

        dots_num = 30 - (first.length() + second.length());

        System.out.print(first);

        while ( dots_num > i )
        {
            System.out.print(".");
            i += 1;
        }

        System.out.print(second);
    }
}