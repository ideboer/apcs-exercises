import java.util.Scanner;

public class Ex1
{
    public static void main( String[] args )
    {
       Scanner scan = new Scanner( System.in );
       int radius;

       System.out.println( "Input the radius: " );
       radius = scan.nextInt();

       System.out.println( "The radius is: " + radius );
       System.out.println( "The area is: " + (Math.PI * radius * radius) );
    }
}