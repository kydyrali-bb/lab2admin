import java.util.Scanner;

public class DauystyAripterSany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Жол енгізіңіз:");
        String zhol = scanner.nextLine();

        int dauystySan = 0;
        String kishiZhol = zhol.toLowerCase();

        for (int i = 0; i < kishiZhol.length(); i++) {
            char arip = kishiZhol.charAt(i);
            if (arip == 'a' || arip == 'e' || arip == 'i' || arip == 'o' || arip == 'u') {
                dauystySan++;
            }
        }

        System.out.println("Жолдағы дауысты әріптердің саны: " + dauystySan);
        scanner.close();
    }
}