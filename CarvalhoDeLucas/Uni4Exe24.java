import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int primeiro = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        int segundo = teclado.nextInt();

        System.out.print("Informe o terceiro número: ");
        int terceiro = teclado.nextInt();

        int maior, meio, menor;

        if (primeiro > segundo && primeiro > terceiro) {
            maior = primeiro;
        } else if (segundo > primeiro && segundo > terceiro) {
            maior = segundo;
        } else {
            maior = terceiro;
        }

        if (primeiro < segundo && primeiro < terceiro) {
            menor = primeiro;
        } else if (segundo < primeiro && segundo < terceiro) {
            menor = segundo;
        } else {
            menor = terceiro;
        }

        if (primeiro != maior && primeiro != menor) {
            meio = primeiro;
        } else if (segundo != maior && segundo != menor) {
            meio = segundo;
        } else {
            meio = terceiro;
        }

        System.out.println("Escolha uma opção:");
        System.out.println("1, os 3 valores em ordem crescente");
        System.out.println("2, os 3 valores em ordem decrescente");
        System.out.println("3, os 3 valores em ordem decrescente");
        int escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
            System.out.println(menor);
            System.out.println(meio);
            System.out.println(maior);
            break;
            case 2:
            System.out.println(maior);
            System.out.println(meio);
            System.out.println(menor);
            break;
            case 3:
            System.out.println(meio);
            System.out.println(maior);
            System.out.println(menor);
            break;
        }

        teclado.close();

    }    
}
