import java.util.Scanner;

public class Ex5
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int begin_index, end_index;
        String string;

        System.out.println("Input a string: ");
        string = scan.nextLine();
        System.out.println("Input the beginning index: ");
        begin_index = scan.nextInt();
        System.out.println("Input the end index: ");
        end_index = scan.nextInt();

        String newString = string.substring(begin_index, end_index);

        System.out.println("Original string: " + string);
        System.out.println("substring: " + newString);

        
    }
}