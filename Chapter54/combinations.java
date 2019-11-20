import java.util.Scanner;

public class combinations {
  
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

  public static long combinations( long factorialOfN, long factorialOfR, int N, int R) {

    return factorialOfN / (factorialOfR * factorial(N - R));
  }
  
  public static void main (String[] args ) {

    Scanner scan = new Scanner( System.in );

    int N, R;

    System.out.println( "Enter N:" );
    N = scan.nextInt();

    System.out.println( "Enter R:" );
    R = scan.nextInt();

    long factorialOfN = factorial( N );
    long factorialOfR = factorial( R );
    if (factorialOfN == -1 || factorialOfR == -1) {
        System.out.println("ERROR. Paramater must be between 0 and 20.");
    }
    else {
        System.out.println( "Combinations: " + combinations(factorialOfN, factorialOfR, N, R) );
    }

  }
}