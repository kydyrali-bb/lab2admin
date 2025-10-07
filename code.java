import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сан енгызыныз: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " - бул жуп сан.");
        } else {
            System.out.println(number + " - бул так сан.");
        }

        scanner.close();
    }
}