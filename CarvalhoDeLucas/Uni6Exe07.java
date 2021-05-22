import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        boolean tem = false;

        while(true) {
            System.out.print("Informe um valor maior q 0 e até 20: "); 
            numero = teclado.nextInt();

            if (numero > 0 && numero <= 20) {
                break;
            } else {
                System.out.println("Número inválido");
            }
        }

        int[] vetor = new int[numero];

        for (int i = 0; i < numero; i++) {

            tem = false;
            System.out.println("Informe um número");
            int num = teclado.nextInt();

            for(int j = 0; j < (i + 1); j++) {
                if (vetor[j] == num) {
                    tem = true;
                } 
            }

            if (!tem) {
                vetor[i] = num;
            } else {
                System.out.println("Número já esta no vetor");
                i--;
            }
        }

        System.err.println("-----------------");

        for(int i=0;i<vetor.length;i++) {

            vetor[i]=-vetor[i];
        }
        
        Arrays.sort(vetor);
        
        for(int i=0;i<vetor.length;i++) {
        
            vetor[i]=-vetor[i]; 
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[ (vetor.length-1) - i]);
        }

        teclado.close();

    }
}
