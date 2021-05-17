import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int canal = -1;
        int qunatidadePessoas = 0;

        double contTotal = 0;

        double cont4 = 0;
        double cont5 = 0;
        double cont9 = 0;
        double cont12 = 0;

        while (canal != 0) {

            System.out.print("Informe número de pessoas: ");
            qunatidadePessoas += teclado.nextInt();

            System.out.print("Informe canal: ");
            canal = teclado.nextInt();

            if (canal == 4) {
                cont4++;
            } else if (canal == 5) {
                cont5++;
            } else if (canal == 9) {
                cont9++;
            } else if (canal == 12) {
                cont12++;
            }

            contTotal++;

        }

        double canal4 = (cont4 / contTotal) * 100;
        double canal5 = (cont5 / contTotal) * 100;
        double canal9 = (cont9 / contTotal) * 100;
        double canal12 = (cont12 / contTotal) * 100;

        System.out.println("Total pessoas assistindo: " + qunatidadePessoas);

        System.out.println("Total aparelhos: " + contTotal);

        System.out.println("Porcentagem de aldiência canal 4: " + canal4 + "%");
        System.out.println("Porcentagem de aldiência canal 4: " + canal5 + "%");
        System.out.println("Porcentagem de aldiência canal 4: " + canal9 + "%");
        System.out.println("Porcentagem de aldiência canal 4: " + canal12 + "%");

        teclado.close();

    }
}
