import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número até 20 ");
        int numero = teclado.nextInt();

        int[] vetor = new int[numero];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um número: ");
            vetor[i] = teclado.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            int vezes = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    vezes++;
                }
            }

            System.out.println("O número " + vetor[i] + " apareceu " + vezes + " vezes");
        }

        teclado.close();

    }
}
