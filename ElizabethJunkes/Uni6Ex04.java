import java.util.Scanner;
public class Uni6Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v[] = new int [3]; 
        int vetor[] = new int [3]; 
        int vetSoma[] = new int [3];
        int i;
        for (i = 0; i < 3; i++) {
            System.out.print("Informe um valor para o vetor 1: ");
              v[i] = teclado.nextInt(); 
        }
        for (i = 0; i < 3; i++) {
            System.out.print("Informe um valor para o vetor 2: ");
              vetor[i] = teclado.nextInt(); 
        }
        for (i = 0; i < 3; i++) {
            vetSoma[i] = v[i] + vetor[i];
        }
        for (i = 0; i < 3; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
        for (i = 0; i < 3; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        for (i = 0; i < 3; i++) {
            System.out.print(vetSoma[i] + " ");
        }
    }
}