public class Ex7 {

    public static void main(String[] args ) {

        double[] pH = {5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9};
        double average, distance, currentDistance;
        double averageBeforeDivision = 0;

        for (int count = 0; count < pH.length; count++) {
            System.out.println("data[" + count + "] = " + pH[count]);
        }
        
        for (int i = 0; i < pH.length; i++) {
            averageBeforeDivision += pH[i];
        }

        average = averageBeforeDivision / pH.length;

        System.out.println("average: " + average);

        double furthest = pH[0];

        for (int j = 1; j < pH.length; j++) {

            
            currentDistance = average - furthest;
            if (currentDistance < 0) {
                currentDistance = currentDistance / -1;
            }

            distance = average - pH[j];
            if (distance < 0) {
                distance = distance / -1;
            }

            if (currentDistance < distance) {
                furthest = pH[j];
            }
        }

        System.out.println("most distant value: " + furthest);

        average = (averageBeforeDivision - furthest) / (pH.length - 1);

        System.out.println("new average: " + average);


    }
}

// made several attempts to read in the text file. None worked.
// Since we didn't go over it in class, i decided to just create an array with the pH's instead