/*Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas
 dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, 
 ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores,
  outro para somar e outro para escrever os vetores.*/
import java.util.Scanner;
public class Uni6Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int v[] = new int [3]; // declaração vetor 1
        int vet[] = new int [3]; // declaração vetor 2
        int vetSoma[] = new int [3]; // declaração vetor 3
        int i; // posição


        //Entrada de dados vetor 1
        for (i = 0; i<3; i++){
            System.out.println("Informe um número pro vetor 1");
              v[i] = ler.nextInt(); 
        }

        //Entrada de dados vetor 2
        for (i = 0; i<3; i++){
            System.out.println("Informe um número pro vetor 2");
              vet[i] = ler.nextInt(); 
        }

        //Soma vetor 3
        for (i = 0; i<3; i++){
            vetSoma[i] = v[i] + vet[i];
        }

        //saida de dados (escrevendo vetor 1)
        for (i = 0; i<3; i++){
            System.out.print(v[i] + " ");
        }

        System.out.print(" ");

        //saida de dados (escrevendo vetor 2)
        for (i = 0; i<3; i++){
            System.out.print(vet[i] + " ");
        }

        System.out.print(" ");

        //saida de dados (escrevendo vetor 2)
        for (i = 0; i<3; i++){
            System.out.print(vetSoma[i] + " ");
        }

    }
}
