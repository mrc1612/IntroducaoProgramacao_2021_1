import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int[] valor = new int[12];

        for (int i = 0; i <= 11; i++) {

            System.out.print("Informe um número: ");
            valor[i] = teclado.nextInt();

        }

        double media = 0;

        for (int i = 0; i <= 11; i++) {

            media += valor[i];

        }

        media = media / 12;

        for (int i = 0; i <= 11; i++) {

            if (valor[i] > media) {
                System.out.println(valor[i]);
            }

        }

        teclado.close();

    }
    
}