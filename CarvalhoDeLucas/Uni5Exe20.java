import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a massa: ");
        double massaInicial = teclado.nextInt();

        double massaFinal = massaInicial;

        int tempo = 0;

        while (massaFinal > 0.5) {

            massaFinal = massaFinal * 0.5;

            tempo += 50;

        }

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massaFinal);
        System.out.println("Tempo: " + tempo + " segundos");

        teclado.close();

    }
}
