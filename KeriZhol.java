import java.util.Scanner;

public class KeriZhol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Жол енгізіңіз:");
        String zhol = scanner.nextLine();

        String keriZhol = "";

        for (int i = zhol.length() - 1; i >= 0; i--) {
            keriZhol = keriZhol + zhol.charAt(i);
        }

        System.out.println("Кері шығарылған жол: " + keriZhol);

        scanner.close();
    }
}