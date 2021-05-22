import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int[] valor = new int[10];

        for (int i = 0; i < valor.length; i++) {

            System.out.print("Informe um número: ");
            valor[i] = teclado.nextInt();

        }

        for (int i = 0; i < valor.length; i++) {

            System.out.println(valor[9 - i]);

        }

        teclado.close();

    }
}