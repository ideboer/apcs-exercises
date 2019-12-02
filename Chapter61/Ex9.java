import java.util.Arrays;

class Ex9
{
  public static boolean myEquals( int[] a, int[] b )
  {
      boolean answer;

      if ((a == null && b != null) || (a != null && b == null)) {
          return false;
      }
      
      if (a.length != b.length ) {
          return false;
      }

      for( int i = 0; i < a.length; i++) {
          if (a[i] != b[i]) {
              return false;
          }
      }

      return true;
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };
    int[] arrayC = { 1 };
    int[] arrayD = { 1 };


    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayD, arrayC) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( myEquals( arrayD, arrayC ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}