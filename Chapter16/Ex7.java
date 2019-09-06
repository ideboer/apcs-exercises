import java.util.Scanner;

public class Ex7
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        double percentage, years, months, days, seconds, total_seconds, seconds_years, seconds_months = 0, seconds_days;
        double[] month_day_values;
        final double bill_2_5 = 2500000000.0;

        System.out.println("Years: ");
        years = scan.nextDouble();
        System.out.println("Months: ");
        months = scan.nextDouble();
        System.out.println("Days: ");
        days = scan.nextDouble();

        month_day_values = new double[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0 ; i < months; i++)
        {
            seconds_months += month_day_values[i] * 24 * 60 * 60;
        }

        seconds_years = years * 365 * 24 * 60 * 60;
        seconds_days = days * 24 * 60 * 60;

        total_seconds = seconds_months + seconds_years + seconds_days;

        System.out.println("You have lived: " + total_seconds);

        percentage = total_seconds / bill_2_5;

        System.out.println("You have lived " + percentage + "% of your expected lifespan");
    }
}