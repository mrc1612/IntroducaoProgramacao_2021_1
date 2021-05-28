import java.util.Scanner;
public class Uni6Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vetor[] = new double [12]; 
        int i; 
        double valorPorcentagem;
        double valorDescontado;
        for (i = 0; i < 12; i++){
            System.out.print("Informe um número: ");
            vetor[i] = teclado.nextDouble(); 
        }
        for (i = 0; i < 12; i++) {
          if(vetor[i] % 2 != 0) {
              valorPorcentagem = vetor[i] * 0.05;
              valorDescontado = vetor[i] + valorPorcentagem;
              System.out.print(" " + valorDescontado);
            }
        }
        for (i = 0; i<12; i++) {
            if(vetor[i] % 2 == 0) {
                valorPorcentagem = vetor[i] * 0.02;
                valorDescontado = vetor[i] + valorPorcentagem;
                System.out.print(" " + valorDescontado);
              }
        }
    }
}