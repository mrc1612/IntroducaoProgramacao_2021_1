package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiro = scanner.nextInt();
        int segundo = scanner.nextInt();
        int terceiro = scanner.nextInt();

        int maior; 
        int meio; 
        int menor;

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

        System.out.println("valores em ordem crescente");
        System.out.println("valores em ordem decrescente");
        System.out.println("valores em ordem decrescente");

        int choice = scanner.nextInt();

        switch (choice) {
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

        scanner.close();
    }
}
