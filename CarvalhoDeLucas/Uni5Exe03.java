import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double soma = 0;

        for (double i = 1; i <= 100; i++) {

            System.out.println(i);
            System.out.println(1/i);

            soma += 1.0 / i;

        }

        System.out.println("Soma: " + soma);

        teclado.close();

    }
}
