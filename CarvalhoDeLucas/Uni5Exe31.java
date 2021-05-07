import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int num = teclado.nextInt();

        int divisor = 1;

        while (num != 1) {

            divisor++;

            if ((num % divisor) == 0) {
                System.out.println(num + " | " + divisor);
                num = num / divisor;
                divisor = 1;
            }

        }

        System.out.println(num + " | ");

        teclado.close();

    }
}
