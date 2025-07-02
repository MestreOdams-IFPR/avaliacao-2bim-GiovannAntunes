import java.util.Scanner;

public class prova {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0;
        n = lerInt(n);

        n = tribonacciRec(n);
        System.out.println(n);

        int p = 0;
        p = lerInt(p);
        p = pellRec(p);
        System.out.println(p);
    }

    public static int tribonacciRec(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return (n * (n - 1)) + (n * (n - 2)) + (n * (n - 3)) * tribonacciRec(n - 1);
        }
    }

    public static int pellRec(int p) {

        if (p == 0) {
            return 0;
        } else if (p == 1) {
            return 1;
        } else {
            return (2 * p * (p - 1)) + (p * (p - 2)) * pellRec(p - 1);
        }
    }

    public static int lerInt(int valor) {
        return valor = LER.nextInt();
    }

}
