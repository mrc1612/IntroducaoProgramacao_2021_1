import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor inteiro maior que zero: ");
        int numero = teclado.nextInt();

        int[] valor = new int[numero];

        for (int i = 0; i < numero; i++) {

            valor[i] = i + 1;

        }

        System.out.println("Informe um número: ");
        int numero2 = teclado.nextInt();

        boolean resultado = false;

        for (int i = 0; i < numero; i++) {

            if (valor[i] == numero2) {
                resultado = true;
            }

        }

        if (resultado) {
            System.out.println("Número está contido no vetor");
        } else {
            System.out.println("Número não está contido no vetor");
        }

        teclado.close();

    }
}
