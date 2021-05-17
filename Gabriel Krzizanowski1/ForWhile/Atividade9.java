package atividadeforwhile;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int y = 0;

		String juncao = "";

		System.out.println("Informe a quantidade de voltas: ");

		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			String name = input.next();

			int age = input.nextInt();

			if (age == 18) {

				juncao += " / " + name;

			} else if (age >= 20) {

				y++;

			}

		}

		System.out.println("Alunos que tem 18 anos: " + juncao);

		System.out.println("Quantidade de alunos com idade acima de 20: " + y);

		input.close();

	}

}
