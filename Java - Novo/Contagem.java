import java.util.Scanner;

public class Contagem {

    public static int contarAprovacoes(int[] notas, int minimo) {
        int contagem = 0;

        for (int nota : notas) {
            if (nota >= minimo) {
                contagem++;
            }
        }

        return contagem;
    }

    public static void main(String[] args) {
        try (Scanner prompt = new Scanner(System.in)) {
            System.out.print("Número de notas: ");
            int n = prompt.nextInt();

            int[] notas = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nota do aluno " + (i + 1) + ": ");
                notas[i] = prompt.nextInt();
            }

            System.out.println("Número de aprovações: " + contarAprovacoes(notas, 50));
        }
    }
}
