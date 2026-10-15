import java.util.Scanner;

public class EhPrimo {

    public static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner prompt = new Scanner(System.in)) {
            System.out.print("Qual número você deseja testar se é primo? ");
            int n = prompt.nextInt();

            if (ehPrimo(n)) {
                System.out.println("O número " + n + " é primo");
            } else {
                System.out.println("O número " + n + " não é primo");
            }
        }
    }
}
