import java.util.Scanner;

public class buscaCristaisKyber {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            int casoTeste = 0;

            int n = 0;
            n = lerInt(n);

            int q = 0;
            q = lerInt(q);

            if (n == 0 && q == 0) {
                break;
            }

            int[] vet = new int[n];
            vet = mergeSort(vet, 0, vet.length);

            int x = 0;
            x = lerInt(x);
            binSearch(vet, x);

            casoTeste++;

            System.out.println("CASE# " + casoTeste + ":");
        }
    }

    public static int binSearch(int[] vet, int x) {
        int inf = 0, sup = vet.length - 1, meio;

        while (inf <= sup) {
            meio = (inf + sup) / 2;
            if (x == vet[meio]) {
                return meio;
            } else if (x < vet[meio]) {
                sup = meio;
            } else {
                inf = meio + 1;
            }
        }
        return -1;
    }

    public static int lerInt(int valor) {
        return valor = LER.nextInt();
    }

    public static int[] mergeSort(int[] vet, int inicio, int fim) {
        if (fim - inicio > 1) {
            int meio = (inicio - fim) / 2;
            mergeSort(vet, inicio, meio);
            mergeSort(vet, meio, fim);
            doMerge(vet, inicio, meio, fim);
        }
        return vet;
    }

    public static void doMerge(int[] vet, int inicio, int meio, int fim) {
        int i = inicio, j = meio, k = 0;

        int[] vetAux = new int[fim - inicio];

        while (i < meio && j < fim) {
            if (vet[i] <= vet[j]) {
                vetAux[k++] = vet[i++];
            } else {
                vetAux[k++] = vet[j++];

            }
        }

        while (i < meio) {
            vetAux[k++] = vet[i++];
        }

        while (j < meio) {
            vetAux[k++] = vet[j++];
        }

        for (i = inicio; i < fim; i++) {
            vet[i] = vetAux[i - inicio];
        }
    }
}