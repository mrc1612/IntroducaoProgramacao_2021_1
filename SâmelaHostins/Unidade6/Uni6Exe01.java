//Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. 
//Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.
import java.util.Scanner;
public class Uni6Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n = 10; // tamanho do vetor
        int v [] = new int [n]; // declaração
        int i; // posição

        //Entrada de dados
        for (i = 0; i<n; i++){

            System.out.println("Informe um número inteiro");
            v[i] = ler.nextInt();
        }
        //saida de dados
        for (i = n-1; i>=0; i--){
        System.out.print(v[i] + " ");
           
        }
        }
    }

