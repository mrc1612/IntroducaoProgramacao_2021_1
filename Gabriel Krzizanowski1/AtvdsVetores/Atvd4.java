package atividadesVetor;

import java.util.Scanner;

public class Atvd4 {

	Scanner input = new Scanner(System.in);
	int[] vetor1 = new int[10];
	int[] vetor2 = new int[10];
	int[] vetor3 = new int[10];

	public static void main(String[] args) {

		Atvd4 atividade = new Atvd4();
		
		atividade.ler();
		atividade.calculo();
		atividade.printar();
	}
/**
 * <h1>Realiza leitura dos 20 valores</h1>
 * 
 * <p>O metodo irá realizar a leitura de vinte valores
 * informados pelo usuario</p>
 * 
 * @author Gabriel Krzizanowski
 */
	public void ler() {
		for (int i = 0; i < 10; i++) {
			vetor1[i] = input.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			vetor2[i] = input.nextInt();
		}
	}
	/**
	 * <h1>Calculo de vetores</h1>
	 * 
	 * <p>O metodo ira pegar os valores do vetor1 e vetor 2, quando estiver na posicao 1 de ambos
	 * ele ira somar a posicao ate completar as 10 posicoes</p>
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public void calculo() {
		for(int i = 0; i <10; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
	}
	/**
	 * <h1>Printar valores</h1>
	 * 
	 * <p>O metodo ira printar o calculo realizado no metodo anterior</p>
	 * 
	 * @author Gabriel Krzizanowski
	 */
	public void printar() {
		for(int i = 0; i <10; i++) {
			System.out.println(vetor3[i]);
		}
	}
}
