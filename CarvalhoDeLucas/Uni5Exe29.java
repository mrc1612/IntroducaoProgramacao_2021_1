import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor para saque: R$");
        int valor = teclado.nextInt();

        int saque = 0;

        int cont1 = 0;
        int cont2 = 0;
        int cont5 = 0;
        int cont10 = 0;
        int cont20 = 0;

        while (saque < valor) {

            saque += 20;

            cont20++;

        }

        if (saque > valor) {
            saque -= 20;
            cont20--;
        }

        while (saque < valor) {

            saque += 10;

            cont10++;

        }

        if (saque > valor) {
            saque -= 10;
            cont10--;
        }

        while (saque < valor) {

            saque += 5;

            cont5++;

        }

        if (saque > valor) {
            saque -= 5;
            cont5--;
        }

        while (saque < valor) {

            saque += 2;

            cont2++;

        }

        if (saque > valor) {
            saque -= 2;
            cont2--;
        }

        while (saque < valor) {

            saque += 1;

            cont1++;

        }

        if (saque > valor) {
            saque -= 1;
            cont1--;
        }

        System.out.println("Vai precisar de " + cont20 + " notas de 20");
        System.out.println("Vai precisar de " + cont10 + " notas de 10");
        System.out.println("Vai precisar de " + cont5 + " notas de 5");
        System.out.println("Vai precisar de " + cont2 + " notas de 2");
        System.out.println("Vai precisar de " + cont1 + " notas de 1");

        teclado.close();

    }
}
