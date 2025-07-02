import java.util.Scanner;

public class beecrowd1551 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0;
        n = lerInt(n);

        for (int i = 0; i < n; i++) {
            //char[] frase = LER.nextLine().charAt();
            //fraseCompleta(frase);
        }
    }

    public static void fraseCompleta(char[] frase) {

        int qtdIgualdade = 0;

        char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };

        for (int i = 0; i < frase.length; i++) {
            if (frase[i] != alfabeto[i]) {
                qtdIgualdade++;
            }

        }

        if (qtdIgualdade == 25) {
            System.out.println("frase quase completa");
        } else if (qtdIgualdade >= 12) {
            System.out.println("frase quase completa");
        } else {
            System.out.println("frase mal elaborada");
        }

    }

    public static int lerInt(int valor) {
        return valor = LER.nextInt();
    }

}