package atividadesVetor;

import java.util.Scanner;

public class atvd1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor");

		int x = input.nextInt();

		int[] vect = new int[x];

		for (int i = 0; i < x; i++) {

			vect[i] = input.nextInt();

		}

		for (int i = 9; i >= 0; i--) {

			System.out.println(vect[i]);

		}

		input.close();

	}

}
