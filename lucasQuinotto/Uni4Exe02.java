import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        double numero;

        System.out.println("Infome o número:");
        numero = teclado.nextDouble();

        if (numero%2 == 0) {
            System.out.println("Seu número "+numero+" é par");
        } else {
            System.out.println("Seu número "+numero+" é ímpar");
        }

        teclado.close();
    }
}
