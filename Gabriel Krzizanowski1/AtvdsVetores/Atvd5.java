
package atividadesVetor;

import java.util.Scanner;

public class Atvd5 {

	Scanner input = new Scanner(System.in);
	String[] vetorDele = new String[5];
	String[] vetorDela = new String[5];

	public static void main(String[] args) {
		Atvd5 atividade = new Atvd5();
		atividade.ler();

		if (atividade.pontuacao() >= 15) {

			System.out.println("Casem");
		} else if (atividade.pontuacao() >= 10 && atividade.pontuacao() <= 14) {

			System.out.println("Vocês têm muita coisa em comum!");
		} else if (atividade.pontuacao() >= 5 && atividade.pontuacao() <= 9) {

			System.out.println("Talvez não dê certo");
		} else if (atividade.pontuacao() >= 0 && atividade.pontuacao() <= 4) {

			System.out.println("Vale um encontro.");
		} else if (atividade.pontuacao() >= -1 && atividade.pontuacao() <= -9) {

			System.out.println("Melhor não perder tempo");
		} else if (atividade.pontuacao() <= -10) {

			System.out.println("Vocês se odeiam!");
		}

	}
	/**
	 * <h1>Leitura de dois valores</h1>
	 * 
	 * <p>O metodo abaixo ira realizar a leitura de 10 valores, cinco valores pertencendo
	 * ao rapaz e cinco pertencendo a mulher. cada integerante tem um vetor.</p>
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public void ler() {
		for (int i = 0; i < 5; i++) {
			vetorDele[i] = input.next();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			vetorDela[i] = input.next();
		}
	}
	/**
	 * <h1>Analise da afinidade</h1>
	 * 
	 * <p>O metodo abaixo ira pegar os valores contidos nos dois vetores (Dele e Dela) e ira verificar qual 
	 * a pontuacao gerada por cada dado.</p>
	 * 
	 * @return String - Referente a afinidade
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public int pontuacao() {
		int pontuacao = 0;
		for (int i = 0; i < 5; i++) {
			if (vetorDele[i].equalsIgnoreCase(vetorDela[i])) {
				pontuacao += 3;
			} else if ((vetorDele[i].equalsIgnoreCase("IND")) && (!vetorDela[i].equalsIgnoreCase("IND"))
					|| (vetorDela[i].equalsIgnoreCase("IND")) && (!vetorDele[i].equalsIgnoreCase("IND"))) {
				pontuacao += 2;
			} else if (!vetorDele[i].equalsIgnoreCase(vetorDela[i])) {
				pontuacao -= 2;
			}
		}
		return pontuacao;
	}
}
