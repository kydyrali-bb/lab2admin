import java.util.Scanner;
import java.util.Arrays;

public class MaksimumTabu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Массив элементтерін бос орын арқылы енгізіңіз (мысалы: 10 5 25 8):");

        String[] sanyp = scanner.nextLine().split(" ");
        int[] massiv = new int[sanyp.length];

        for (int i = 0; i < sanyp.length; i++) {
            massiv[i] = Integer.parseInt(sanyp[i]);
        }

        if (massiv.length == 0) {
            System.out.println("Массив бос.");
            scanner.close();
            return;
        }

        int maksimum = massiv[0];
        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] > maksimum) {
                maksimum = massiv[i];
            }
        }

        System.out.println("Массив: " + Arrays.toString(massiv));
        System.out.println("Массивтегі ең үлкен сан (максимум): " + maksimum);
        scanner.close();
    }
}