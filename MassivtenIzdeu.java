import java.util.Scanner;
import java.util.Arrays;

public class MassivtenIzdeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Массив элементтерін бос орын арқылы енгізіңіз (мысалы: 10 20 30 40 50):");

        String[] sanyp = scanner.nextLine().split(" ");
        int[] massiv = new int[sanyp.length];

        for (int i = 0; i < sanyp.length; i++) {
            massiv[i] = Integer.parseInt(sanyp[i]);
        }

        System.out.println("Ізделетін X санын енгізіңіз:");
        int X = scanner.nextInt();

        boolean tabyldy = false;

        for (int element : massiv) {
            if (element == X) {
                tabyldy = true;
                break;
            }
        }

        System.out.println("Массив: " + Arrays.toString(massiv));
        if (tabyldy) {
            System.out.println("Енгізілген " + X + " саны массивтің ішінде **бар**.");
        } else {
            System.out.println("Енгізілген " + X + " саны массивтің ішінде **жоқ**.");
        }
        scanner.close();
    }
}