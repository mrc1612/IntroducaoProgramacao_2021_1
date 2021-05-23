package atividadesVetor;

import java.util.Scanner;

public class Atvd2 {

	Scanner input = new Scanner(System.in);
	double[] vect = new double[12];
	double[] maior = new double[12];

	public static void main(String[] args) {

		Atvd2 atividade = new Atvd2();
		atividade.ler();
		System.out.println(atividade.media());
		atividade.calculo();
		for (double valor : atividade.maior) {
			if (valor != 0) {
				System.out.println(valor);
			}

		}

	}

	/**
	 * <h1>Lê os valores do vetor</h1>
	 * 
	 * <p>
	 * O metodo irá ler os doze valores do vetor
	 * </p>
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public void ler() {
		for (int i = 0; i < 12; i++) {
			double read = input.nextDouble();
			vect[i] = read;

		}
		input.close();
	}

	/**
	 * <h1>Calculo da Média</h1>
	 * 
	 * <p>
	 * O metodo irá pegar todos os valores do {@link Atvd2#vect} e realizar a média
	 * por 12
	 * </p>
	 * 
	 * @return double - Referente a média do {@link Atvd2#vect}
	 * @author Gabriel Krzizanowski
	 */
	public double media() {
		double media = 0;
		for (int i = 0; i < 12; i++) {
			media += vect[i];

		}
		return media / 12;
	}

	/**
	 * <h1>Guarda os valores maiores que a média</h1>
	 * 
	 * <p>
	 * O metodo irá receber a média e verificar quais dos valores do
	 * {@link Atvd2#vect} é maior que é média (os demais valores são ignorados)
	 * </p>
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public void calculo() {
		for (int i = 0; i < 12; i++) {
			if (vect[i] > media()) {
				maior[i] = vect[i];

			}
		}

	}

}
