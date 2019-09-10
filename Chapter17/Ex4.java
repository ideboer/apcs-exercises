import java.util.Scanner;

public class Ex4
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        String name;
        int strength, health, luck;

        System.out.println("Welcome to \033[3mYertle's Quest\033[0m");
        System.out.println("Enter the name of your character:");
        name = scan.nextLine();

        System.out.println("Enter strength (1-10): ");
        strength = scan.nextInt();

        System.out.println("Enter health (1-10): ");
        health = scan.nextInt();

        System.out.println("Enter luck (1-10): ");
        luck = scan.nextInt();

        if ( ( strength + health + luck ) > 15 )
        {
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println("You have given your character too many points! Default values have been assigned: ");
            System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck );

        }
        else
        {
            System.out.println("Your character looks good!");
            System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck );
        }

    }
}