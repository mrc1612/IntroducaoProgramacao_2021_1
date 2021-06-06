package atividadesVetor;

import java.util.Scanner;

public class Atvd9 {

    Scanner input = new Scanner(System.in);
    int tamanho = 30;
    char[] vetorSexo = new char[tamanho];
    int[] vetorNota = new int[tamanho];
    int[] vetorIdade = new int[tamanho];
    int posicao = 0;

    public static void main(String[] args) {
        Atvd9 atividade = new Atvd9();
        for (int i = 0; i < atividade.tamanho; i++) {
            atividade.leituraDeValores();
        }
        System.out.println(atividade.notaMedia());
        System.out.println(atividade.mediaPelosHomens());
        System.out.println(atividade.notaDaMulherMaisNova());
        System.out.println(atividade.quantidadeDeMulheresComMaisDeCinquenta());
    }

    public void leituraDeValores() {
        if (posicao == tamanho) {
            return;
        }
        vetorSexo[posicao] = input.next().charAt(0);
        vetorNota[posicao] = input.nextInt();
        vetorIdade[posicao] = input.nextInt();
        System.out.println("-------------");
        posicao++;
    }

    public double notaMedia() {
        double media = 0;
        for (int i = 0; i < tamanho; i++) {
            media += vetorNota[i];

        }
        return media / tamanho;
    }

    public double mediaPelosHomens() {
        double mediaMasculina = 0;
        int counter = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetorSexo[i] == '2') {
                mediaMasculina += vetorNota[i];
                counter++;
            }
        }
        return mediaMasculina / counter;
    }

    public int notaDaMulherMaisNova() {
        int[] vetorIdadesFemininas = new int[tamanho];
        int idade = 999999999, nota = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetorSexo[i] == '1') {
                vetorIdadesFemininas[i] = vetorIdade[i];
            }
        }
        for (int i = 0; i < tamanho; i++) {
            if (vetorSexo[i] == '1') {
                for (int j = 0; j <= tamanho - 1; j++) {
                    if (vetorIdadesFemininas[j] == 0) {

                    } else if (vetorIdade[i] < vetorIdadesFemininas[j] && vetorIdade[i] < idade) {
                        idade = vetorIdade[i];
                        nota = vetorNota[i];
                    }
                }
            }

        }
        return nota;
    }

    public int quantidadeDeMulheresComMaisDeCinquenta() {
        int count = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetorSexo[i] == '1' && vetorIdade[i] > 50 && vetorNota[i] >= notaMedia()) {
                count++;
            }

        }
        return count;
    }
}
