import java.util.Scanner;
import java.util.Arrays;

public class MassivQosyndysy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Массив элементтерін бос орын арқылы енгізіңіз (мысалы: 1 2 3 4 5):");

        String[] sanyp = scanner.nextLine().split(" ");
        int[] massiv = new int[sanyp.length];

        for (int i = 0; i < sanyp.length; i++) {
            massiv[i] = Integer.parseInt(sanyp[i]);
        }

        int qosyndy = 0;

        // Массивтің әрбір элементін қосамыз
        for (int element : massiv) { // enhanced for loop (жетілдірілген for циклі)
            qosyndy += element;
        }

        System.out.println("Массив: " + Arrays.toString(massiv));
        System.out.println("Массив элементтерінің қосындысы: " + qosyndy);
        scanner.close();
    }
}