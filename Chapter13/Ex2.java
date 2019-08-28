import java.util.Scanner;

public class Ex2
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        Double seconds, distance;
        Double gravity = 32.174;

        System.out.println("Enter the number of sceonds: ");
        seconds = scan.nextDouble();
        
        distance = (gravity * seconds * seconds) / 2;

        System.out.println("Distance: " + distance);
    }
}