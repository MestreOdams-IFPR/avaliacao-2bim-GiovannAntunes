import java.util.Scanner;

public class beecrowd {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        String frase = LER.nextLine();
        String fraseDancante = sentencaDancante(frase);
        System.out.println(fraseDancante);

    }

    public static String sentencaDancante(String frase) {
        String fraseDancante = new String();

        String[] fraseSplit = frase.split("");
        
        for (int i = 0; i < fraseSplit.length; i++) {
            fraseSplit[i].toLowerCase();

       
        }

        return fraseDancante;
    }

    public static int lerInt(int valor) {
        return valor = LER.nextInt();
    }

}