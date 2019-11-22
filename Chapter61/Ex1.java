import java.io.* ;

class Ex1 {

  public static void main ( String[] args ) {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums

    int all = 0;
    int odd = 0;
    int even = 0;
    
    // compute the sums
    for ( int index=0; index < data.length; index++) {
        all += data[index];

        if (data[index] % 2 == 0) {
            even += data[index];
        }
        else if (data[index] % 2 == 1) {
            odd += data[index];
        }
    }
      
    // write out the three sums
    System.out.println( "all: " + all + " odd: " + odd + " even: " + even);

  }
}      