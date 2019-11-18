import  java.util.Scanner;

public class odiousNumber
{
  
  // Calculate num factorial
  public static long binary( int N )
  {
     return 1L;
  }
  
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    long binary; 
    int N;

    System.out.println( "To exit, enter a negative value" );
    System.out.print( "Enter N: " );
    N = scan.nextInt();

    while ( N >= 0 )
    {
      binary = binary( N );
      System.out.println( "binary is " + binary );
      System.out.print( "Enter N: " );
      N = scan.nextInt();
    }
     
  }
}