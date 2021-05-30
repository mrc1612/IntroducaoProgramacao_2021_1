package atividadesVetor;

import java.util.Scanner;

public class Atvd8 {

    Scanner input = new Scanner(System.in);
    int tamanhoDoVetor;
    double[] vetor;

    public static void main(String[] args) {

        Atvd8 atividade = new Atvd8();
        atividade.leituraDoTamanhoDoVetor();
        atividade.recebeOsValoresDoVetor();
        atividade.contadorDeValoresRepetidos();

    }

    /**
     * <h1>Tamanho do Vetor</h1>
     *
     * <p>O metodo abaixo ira receber o tamanho do vetor</p>
     */
    public void leituraDoTamanhoDoVetor() {
        tamanhoDoVetor = input.nextInt();
        while (tamanhoDoVetor > 20) {
            System.out.println("Tamanho inválido");
            tamanhoDoVetor = input.nextInt();
        }
        vetor = new double[tamanhoDoVetor];
    }

    /**
     * <h1>Valores do vetor</h1>
     *
     * <p>O metodo abaixo ira receber todos os valores
     * do tipo double do vetor</p>
     */
    public void recebeOsValoresDoVetor() {
        for (int i = 0; i < tamanhoDoVetor; i++) {
            vetor[i] = input.nextDouble();
        }
    }

    public void contadorDeValoresRepetidos() {
        int count = 1;
        for (int i = 0; i < tamanhoDoVetor; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[j] == vetor[i]) {
                    count++;
                    System.out.println("Valor: " + vetor[i] +
                            "\nVezes repetidos: " + count);
                    if (j + 1 == i) {
                        count = 1;
                    }
                }
            }
        }
    }
}
