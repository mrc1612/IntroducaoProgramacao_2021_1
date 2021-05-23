package atividadesVetor;

import java.util.Scanner;

public class Atvd3 {

	Scanner input = new Scanner(System.in);
	double[] vect = new double[12];
	double read = 0;

	public static void main(String[] args) {
		Atvd3 atividade = new Atvd3();
		atividade.ler();
		atividade.calculo();
		atividade.retorna();

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
			read = input.nextDouble();
			vect[i] = read;
		}
	}

	/**
	 * <h1>Calculo dos valores impares e pares</h1>
	 * 
	 * <p>
	 * O metodo irá pegar os valores contidos em {@link Atvd3#vect} e realizar a
	 * separação dos valores pares atribuindo aos mesmo 0.2 porcento e os valores
	 * impares irão receber 0.5 porcento
	 * </p>
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public void calculo() {
		for (int i = 0; i < 12; i++) {
			if (vect[i] % 2 != 0) {
				vect[i] += vect[i] * 0.02;

			} else {
				vect[i] += vect[i] * 0.05;
			}

		}
	}
	/**
	 * <h1>Printa dos valores modificados</h1>
	 * 
	 * <p>Esse metodo irá pegar os valores do metodo a cima e printar
	 * os mesmos na tela</p>
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public void retorna() {
		for (int i = 0; i < 12; i++) {
			System.out.println(vect[i]);
		}
	}

}
