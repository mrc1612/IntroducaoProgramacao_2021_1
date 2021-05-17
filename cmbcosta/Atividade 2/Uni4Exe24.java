import java.util.Scanner;

public class Uni4Exe24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os três valores:");
        System.out.println("Valor 1:");
		int valor = scanner.nextInt();
        System.out.println("Valor 2:");
		int valor1 = scanner.nextInt();
        System.out.println("Valor 3:");
		int valor2 = scanner.nextInt();

		int menor, meio, maior;
		if (valor <= valor1 && valor <= valor2) {
			menor = valor;
			if (valor1 <= valor2) {
				meio = valor1;
				maior = valor2;
			} else {
				meio = valor2;
				maior = valor1;
			}
		} else if (valor1 <= valor && valor1 <= valor2) {
			menor = valor1;
			if (valor <= valor2) {
				meio = valor;
				maior = valor2;
			} else {
				meio = valor2;
				maior = valor;
			}
		} else {
			menor = valor2;
			if (valor <= valor1) {
				meio = valor;
				maior = valor1;
			} else {
				meio = valor1;
				maior = valor;
			}
		}

		System.out.println("Menu:");
		System.out.println("1: Ordem crescente");
		System.out.println("2: Ordem decrescente");
		System.out.println("3: Maior ao meio");
		int opcao = scanner.nextInt();

		switch (opcao) {
			case 1:
				System.out.println("Valor menor: " + menor);
				System.out.println("Valor medio: " + meio);
				System.out.println("Valor maior: " + maior);
				break;
			case 2:
				System.out.println("Valor maior: " + maior);
				System.out.println("Valor medio: " + meio);
				System.out.println("Valor menor: " + menor);
				break;
			case 3:
				System.out.println("Valor medio: " + meio);
				System.out.println("Valor alto: " + maior);
				System.out.println("Valor menor: " + menor);
				break;
			default:
				System.out.println("Valor inválido");
				break;
		}
		scanner.close();
	}
}