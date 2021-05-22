import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] valor1 = new int[10];
        int[] valor2 = new int[10];
        int[] valor3 = new int[10];

        for (int i = 0; i < valor1.length; i++) {

            System.out.print("Informe um número: ");
            valor1[i] = teclado.nextInt();

            System.out.print("Informe um outro número: ");
            valor2[i] = teclado.nextInt();

        }

        for (int i = 0; i < valor1.length; i++) {

            valor3[i] = valor1[i] + valor2[i];

        }

        for (int i = 0; i < valor1.length; i++) {

            System.out.println(valor1[i]);
            System.out.println(valor2[i]);
            System.out.println(valor3[i]);

        }

        teclado.close();

    }
}
