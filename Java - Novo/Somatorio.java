import java.util.Scanner;

public class Somatorio {

    public static long somatorio(int[] numeros) {
        long soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        return soma;
    }

    public static void main(String[] args) {
        try (Scanner prompt = new Scanner(System.in)) {
            System.out.print("Quantidade de números: ");
            int n = prompt.nextInt();

            int[] numeros = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = prompt.nextInt();
            }

            System.out.println("Soma = " + somatorio(numeros));
        }
    }
}
