import java.util.Scanner;

public class QosyndyTabu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N санын енгызыныз (оy сан):");
        int N = scanner.nextInt();

        int qosyndy = 0;

        for (int i = 1; i <= N; i++) {
            qosyndy += i;
        }

        System.out.println("1-ден " + N + "-ге дейнг сандардын косындысы: " + qosyndy);
        scanner.close();
    }
}