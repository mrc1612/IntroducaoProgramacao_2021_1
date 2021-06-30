import java.util.Scanner;

public class Uni6Exe08 {

    Scanner input = new Scanner(System.in);
    int tamanhoDoVetor;
    double[] vetor;

    public static void main(String[] args) {

        Uni6Exe08 atividade = new Uni6Exe08();
        atividade.leituraDoTamanhoDoVetor();
        atividade.recebeOsValoresDoVetor();
        atividade.contadorDeValoresRepetidos();

    }

    public void leituraDoTamanhoDoVetor() {
        tamanhoDoVetor = input.nextInt();
        while (tamanhoDoVetor > 20) {
            System.out.println("Tamanho inválido");
            tamanhoDoVetor = input.nextInt();
        }
        vetor = new double[tamanhoDoVetor];
    }
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