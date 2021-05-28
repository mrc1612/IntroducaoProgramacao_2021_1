import java.util.Scanner;
public class Uni6Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double vetor[] = new double [12]; 
        int i; 
        double soma = 0;
        double media = 0;
        for (i = 0; i<12; i++) {
            System.out.print("Digite uum número: ");
            vetor[i] = teclado.nextDouble(); 
        }
        for (i = 0; i < 12; i++) {
            soma += vetor[i];
        }
        media = soma / 12;
        for (i = 0; i<12; i++) {
            if (vetor[i]> media) {
                System.out.println("Os números maiores do que a média são: " + vetor[i]);
            }
        }
    }
}