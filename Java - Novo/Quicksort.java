import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort {

    public static List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(arr.size() / 2);

        List<Integer> menores = new ArrayList<>();
        List<Integer> iguais = new ArrayList<>();
        List<Integer> maiores = new ArrayList<>();

        for (int numero : arr) {
            if (numero < pivot) {
                menores.add(numero);
            } else if (numero > pivot) {
                maiores.add(numero);
            } else {
                iguais.add(numero);
            }
        }

        List<Integer> resultado = new ArrayList<>();
        resultado.addAll(quicksort(menores));
        resultado.addAll(iguais);
        resultado.addAll(quicksort(maiores));

        return resultado;
    }

    public static List<Integer> lerLista(String entrada) {
        List<Integer> lista = new ArrayList<>();

        for (String parte : entrada.split(",")) {
            try {
                lista.add(Integer.parseInt(parte.trim()));
            } catch (NumberFormatException e) {
                // ignora entradas inválidas (vazias ou com letras)
            }
        }

        return lista;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite os números separados por vírgula (ex: 5,3,8,1,9): ");
            String entrada = scanner.nextLine();

            List<Integer> array = lerLista(entrada);
            List<Integer> resultado = quicksort(array);

            System.out.println("Array original: " + array);
            System.out.println("Array ordenado: " + resultado);
        }
    }
}
