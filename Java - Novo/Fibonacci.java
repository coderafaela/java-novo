import java.util.Scanner;

public class Fibonacci {

    public static long[] fibonacci(int n) {
        long[] termos = new long[Math.max(n, 0)];
        long a = 0;
        long b = 1;

        for (int i = 0; i < termos.length; i++) {
            termos[i] = a;
            long c = a + b;
            a = b;
            b = c;
        }

        return termos;
    }

    public static void main(String[] args) {
        try (Scanner prompt = new Scanner(System.in)) {
            System.out.print("Número de termos: ");
            int n = prompt.nextInt();

            long[] termos = fibonacci(n);
            StringBuilder saida = new StringBuilder();

            for (int i = 0; i < termos.length; i++) {
                if (i > 0) {
                    saida.append(", ");
                }
                saida.append(termos[i]);
            }

            System.out.println(saida);
        }
    }
}
