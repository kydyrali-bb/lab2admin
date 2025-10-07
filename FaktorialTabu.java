import java.util.Scanner;

public class FaktorialTabu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Факториалын тапқыңыз келетін N санын енгізіңіз:");
        int N = scanner.nextInt();

        long faktorial = 1;

        if (N < 0) {
            System.out.println("Теріс санның факториалы анықталмаған.");
        } else {
            for (int i = 1; i <= N; i++) {
                faktorial *= i;
            }
            System.out.println(N + " санының факториалы: " + faktorial);
        }
        scanner.close();
    }
}