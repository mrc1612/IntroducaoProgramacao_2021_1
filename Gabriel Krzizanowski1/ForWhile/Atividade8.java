package atividadeforwhile;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma, somatoria = 0;
		int y = 0;
		int somaNegativo = 0;

		System.out.println("Informe a quantidade de voltas: ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int x = sc.nextInt();

			if (x >= 0) {

				soma = x;

				somatoria += soma;

				y++;

			} else {

				if (x < somaNegativo) {

					somaNegativo = x;

				}

			}

		}

		System.out.println(somatoria / y);

		System.out.println(somaNegativo);

		sc.close();

	}

}
