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
}

public class Ex2 {  
  public static void main ( String[] args ) {
    int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    
    Weight june = new Weight( values );
    int avg = june.average();
    System.out.println("average = " + avg );
  }
}      