import java.util.Scanner;

public class Unid4Ex2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double numero = teclado.nextDouble();
        if (numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        }
        else {
            System.out.println("O número digitado é ímpar.");
        }
        teclado.close();
    }
}