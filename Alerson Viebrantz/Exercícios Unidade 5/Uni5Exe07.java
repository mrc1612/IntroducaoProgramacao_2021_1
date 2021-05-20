import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int n;
        int maior = 0;
        int menor = 1000;

        System.out.println("Informe a quantidade de números que deseja informar:");
        n = teclado.nextInt();

        for (int i=1; i<= n; i++) {
            System.out.println("Informe os números: ");
            int n2= teclado.nextInt();
            
            if (n2 >= maior){
                maior = n2;
            }
            if (n2 <= menor)
                menor = n2;
        }

        System.out.println("O menor número informado é o " +menor);
        System.out.println("O menor número informado é o " +maior);

        teclado.close();
    }
}
