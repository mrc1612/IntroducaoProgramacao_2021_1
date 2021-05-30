package atividadesVetor;

import java.util.Scanner;

public class Atvd6 {

    static Scanner input = new Scanner(System.in);
    static int tamanho = 0;
    double[] vetorDeValores;

    public static void main(String[] args) {
        tamanho = input.nextInt();
        Atvd6 atividade = new Atvd6();
        atividade.lerEArmazenarDadosNoVetor();
        double valorPesquisado = input.nextDouble();
        boolean estaNoVetor = atividade.pesquisarValorNoVetor(valorPesquisado);
        System.out.println(estaNoVetor);
    }

    /**
     * <h1>Leitura de valores do vetor</h1>
     *
     * <p>O metodo a baixo irá realizar a leitura dos valores e armazenar no vetor</p>
     *
     * @author Gabriel Krzizanowski
     */
    public void lerEArmazenarDadosNoVetor() {
        vetorDeValores = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorDeValores[i] = input.nextDouble();

        }
    }
    /**
     * <h1>Realiza a pesquisa do valor</h1>
     *
     * <p>O metodo ira pegar o valor informaado pelo usuario e realizar a pesquisa no
     * metodo</p>
     *
     * @author Gabriel Krzizanowski
     */
    public boolean pesquisarValorNoVetor( double valorPesquisado) {
        for (int i = 0; i < tamanho; i++) {
            if (vetorDeValores[i] == valorPesquisado) {
                return true;
            }
        }
        return false;
    }
}
