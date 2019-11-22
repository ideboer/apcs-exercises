import java.io.* ;

class Ex3 {

  public static void main ( String[] args ) {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    
    int closest = 10000000;
    int currentNum;
    int indexOfClosest = 0;

    // find the element nearest to zero
    for ( int index = 0; index < data.length; index++ ) {
        if (data[index] < 0) {
            currentNum = data[index] * -1;
        }
        else {
            currentNum = data[index];
        }

        if (currentNum < closest) {
            closest = currentNum;
            indexOfClosest = index;
        }
    }
      
    // write out the element nearest to zero
    System.out.println( "closest: " + data[indexOfClosest]);

  }
}      