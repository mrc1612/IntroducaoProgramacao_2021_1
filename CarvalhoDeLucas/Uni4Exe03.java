import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num1 = teclado.nextInt();

        System.out.print("Informe outro número: ");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("Número " + num1 + " maior que " + num2);
        } else {
            System.out.println("Número " + num2 + " maior que " + num1);
        }

        teclado.close();
    }
}
