import java.util.Scanner;

public class testeDaForca {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        while (LER.hasNextLine()) {

            int n = 0;
            n = lerInt(n);

            int k = 0;
            k = lerInt(k);

            int[] vet = new int[n];

            vet = lerVet(vet);
            System.out.println("vetor");
            imprimirVet(vet);

            vet = seletion(vet);
            System.out.println("vetor ordenado");
            imprimirVet(vet);

            int soma = 0;
            soma = somaMaiorPontuacao(vet, k);
            System.out.println("soma " + soma);

        }
    }

    public static int somaMaiorPontuacao(int[] vet, int k) {
        int soma = 0;

        for (int i = 0; i < k; i++) {
            soma += vet[i];
        }
        return soma;
    }

    public static int[] seletion(int[] vet) {

        for (int i = 0; i < vet.length; i++) {
            int p = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] > vet[p]) {
                    p = j;
                }
            }
            if (p != i) {
                swap(vet, i, p);
            }
        }

        return vet;
    }

    public static void swap(int[] vet, int i, int j) {
        int temp = vet[i];
        vet[i] = vet[j];
        vet[j] = temp;
    }

    public static int lerInt(int valor) {
        return valor = LER.nextInt();
    }

    public static int[] lerVet(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }

        return vet;
    }

    public static void imprimirVet(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
        }
        System.out.println();
    }
}
