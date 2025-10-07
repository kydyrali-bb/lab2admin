import java.util.Scanner;

public class MinimumTabu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Бырынші санды енгызыныз:");
        int san1 = scanner.nextInt();
        System.out.println("Екыншы санды енгызыныз:");
        int san2 = scanner.nextInt();

        int minimum;

        if (san1 < san2) {
            minimum = san1;
        } else {
            minimum = san2;
        }

        System.out.println("Екы санның минимумы: " + minimum);
        scanner.close();
    }
}