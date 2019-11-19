import  java.util.Scanner;

public class odiousNumbers
{
  
  // Calculate num factorial
  public static boolean odious( long N ) {

    int oneCount = 0;
    boolean done = false;

    while (!done) {
      if (N % 2 == 1) {
        oneCount ++;
      } 

      N /= 2;

      if (N == 0) {
        done = true;
      }
    }

    if (oneCount % 2 == 1) {
      return true;
    }
    return false;

  }

  
  public static void main (String[] args ) {
    Scanner scan = new Scanner( System.in );
    long N; 

    System.out.println( "To exit, enter a negative value" );
    System.out.print( "Enter N: " );
    N = scan.nextInt();

    while ( N >= 0 ) {
      if (odious(N)) {
        System.out.println("Odious");
      }
      else {
        System.out.println("Evil");
      }

      System.out.println( "Enter N: " );
      N = scan.nextInt();

      
    }
     
  }
}