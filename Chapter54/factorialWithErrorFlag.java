import java.util.Scanner;

public class factorialWithErrorFlag {
  
  public static long factorial( int N ) {

    long fct = 1;
    
    if (N > 20 || N < 0) {
        fct = -1;
        return fct;
    }

    for ( int j=1; j<=N; j++ )
      fct *= j;
    return fct;
  }
  
  public static void main (String[] args ) {

    Scanner scan = new Scanner( System.in );

    int N;

    System.out.println( "Enter an integer:" );
    N = scan.nextInt();

    long answer = factorial( N );
    if (answer == -1) {
        System.out.println("ERROR. Paramater must be between 0 and 20.");
    }
    else {
        System.out.println( "factorial of " + N + ": " + answer );
    }

  }
}

