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
	 * <h1>L� os valores do vetor</h1>
	 * 
	 * <p>
	 * O metodo ir� ler os doze valores do vetor
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
	 * <h1>Calculo da M�dia</h1>
	 * 
	 * <p>
	 * O metodo ir� pegar todos os valores do {@link Atvd2#vect} e realizar a m�dia
	 * por 12
	 * </p>
	 * 
	 * @return double - Referente a m�dia do {@link Atvd2#vect}
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
	 * <h1>Guarda os valores maiores que a m�dia</h1>
	 * 
	 * <p>
	 * O metodo ir� receber a m�dia e verificar quais dos valores do
	 * {@link Atvd2#vect} � maior que � m�dia (os demais valores s�o ignorados)
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
