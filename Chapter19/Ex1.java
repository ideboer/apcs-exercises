import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int count, end;

        System.out.println("Enter Start: ");
        count = scan.nextInt();

        System.out.println("Enter End: ");
        end = scan.nextInt();

        while (count <= end)
        {
            System.out.println(count);
            count += 1;
        }
    }
}