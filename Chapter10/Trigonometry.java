public class Trigonometry
{
    public static void main( String[] args )
    {
        double sinx = Math.sin( 0.333 );
        double cosx = Math.cos( 0.333 );
        double sum = (Math.pow(sinx, 2)) + (Math.pow(cosx, 2));

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum);
    }
}