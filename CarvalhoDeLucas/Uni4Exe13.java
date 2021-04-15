import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int cont = 0;

        System.out.print("Informe a primeira carta: ");
        int carta1 = teclado.nextInt();

        System.out.print("Informe a segunda carta: ");
        int carta2 = teclado.nextInt();

        System.out.print("Informe a terceira carta: ");
        int carta3 = teclado.nextInt();

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            cont++;
        }

        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            cont++;
        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            cont++;
        }

        if (cont == 1) {
            System.out.println("TRUCO");
        } else if (cont == 2) {
            System.out.println("SEIS");
        } else if (cont == 3) {
            System.out.println("NOVE");
        }

        teclado.close();

    }
}
