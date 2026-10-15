import java.util.Scanner;

public class MDC {

    public static int maxDiv(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }

    public static void main(String[] args) {
        try (Scanner prompt = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro: ");
            int a = prompt.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int b = prompt.nextInt();

            System.out.println("O Máximo divisor comum de " + a + " e " + b + " é: " + maxDiv(a, b));
        }
    }
}
