class Weight {
  private int[] data;
  
  // Constructor
  public Weight(int[] init) {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < data.length; j++) {
      data[j] = init[j];
    }
  }
  
  //Print
  public String toString() {
 
    String str = "";

    for (int i = 0; i < data.length; i++) {
        str += "data[" + i + "]: " + data[i] + "\n";
    }

    return str;
  }

  public int average() {

      int average = 0;
      int count = 0;

      for (int i = 0; i < data.length; i++) {
          average += data[i];
          count++;
      }

      average /= count;

      return average;

  }

  public int subAverage( int start, int end ) {

      int average = 0;
      int count = 0;

      for (int i = start; i < end; i++) {
          average += data[i];
          count++;
      }

      average /= count;

      return average;

  }

  public int length() {
      return data.length;
  }
}

public class Ex3 {  
  public static void main ( String[] args ) {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100};
                    
    Weight june = new Weight( values );
    int avg = june.average();
    int firstHalf = june.subAverage(0, june.length() / 2);
    int secondHalf = june.subAverage(june.length() / 2, june.length());
    System.out.println("average = " + avg );
    System.out.println("average of first half = " + firstHalf );
    System.out.println("average of second half = " + secondHalf );
    System.out.println("difference (second half - first half) = " + (secondHalf - firstHalf) );
  }
}