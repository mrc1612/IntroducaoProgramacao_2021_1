import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = teclado.nextDouble();

        if (((numero * 2) % 2) == 0) {
            System.out.println("Número inteiro");
        } else {
            System.out.println("Número com casas decimais");
        }

        teclado.close();

    }
}
