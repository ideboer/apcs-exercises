import java.util.*;

public class Ex5 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        String sentence;
        boolean panagram = true;
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        System.out.println("Enter a sentence");
        sentence = scan.nextLine();

        for (int i = 0; i < alphabet.length && panagram; i++) {

            int count = 0;

            for (int j = 0; j < sentence.length(); j++) {

                String current = sentence.valueOf(sentence.charAt(j));

                if (current.equals(alphabet[i]) || current.equals(alphabet[i].toUpperCase)) {

                    count++;

                }

            }

            if (count == 0) {

                panagram = false;

            }
        }

        if (panagram) {

            System.out.println("Is a panagram");

        }
        else {

            System.out.println("Is not a panagram");

        }

    }
}
