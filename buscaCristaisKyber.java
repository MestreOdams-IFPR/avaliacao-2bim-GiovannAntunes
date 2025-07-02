import java.util.Scanner;

public class buscaCristaisKyber {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            int n = 0;
            n = lerInt(n);

            int q = 0;
            q = lerInt(q);

            if (n == 0 && q == 0) {
                break;
            }

            int[] vet = new int[n];
            vet = seletion(vet);

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

    public static int[] seletion(int[] vet) {

        for (int i = 0; i < vet.length; i++) {
            int p = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[p]) {
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
}