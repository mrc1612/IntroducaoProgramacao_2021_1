package atividadesVetor;

import java.util.Scanner;

public class Atvd7 {
    Scanner input = new Scanner(System.in);
    int tamanho = 0;
    int[] vetor;


    public static void main(String[] args) {
        Atvd7 atividade = new Atvd7();
        atividade.criarTamanhoDoVetor();
        atividade.leituraDosValores();
        atividade.retornarValoresResultantes();

        for (int i = 0; i < atividade.tamanho; i++) {
            System.out.println(atividade.vetor[i]);
        }
    }

    public void criarTamanhoDoVetor() {
        tamanho = input.nextInt();
        while (tamanho > 20) {
            tamanho = input.nextInt();
        }
        vetor = new int[tamanho];
    }

    public void leituraDosValores() {
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = input.nextInt();
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Valor repetido");
                    vetor[i] = input.nextInt();
                }
            }
        }
    }

    public void retornarValoresResultantes() {
        int aux = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
