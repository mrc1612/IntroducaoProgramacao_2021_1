import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();

        int menor = 100000000;
        int maior = 0;

        for (int i = 0; i < numero; i++) {

            int n = numero + i;

            if (n > maior) {
                maior = n;
            }

            if (n < menor) {
                menor = n;
            }

        }


        System.out.println("Menor " + menor);
        System.out.println("Maior " + maior);

        teclado.close();

    }
}
