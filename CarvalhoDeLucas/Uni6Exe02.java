import java.util.Scanner;

public class Uni6Exe02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int[] valor = new int[12];

        for (int i = 0; i < valor.length; i++) {

            System.out.print("Informe um número: ");
            valor[i] = teclado.nextInt();

        }

        double media = 0;

        for (int i = 0; i < valor.length; i++) {

            media += valor[i];

        }

        media = media / valor.length;

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] > media) {
                System.out.println(valor[i]);
            }

        }

        teclado.close();

    }
    
}
