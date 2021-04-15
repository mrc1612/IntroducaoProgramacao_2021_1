package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");

        int choice = scanner.nextInt();

        switch (choice) {
        case 1:
            System.out.println(numero1 + numero2);
        break;

        case 2:
            System.out.println("Diferença é: " + (numero1 - numero2));
        break;

        case 3:
            System.out.println(numero1 * numero2);
        break;

        case 4:
        if (numero2 != 0) {
            System.out.println(numero1 / numero2);
        } else {
            System.out.println("O denominador não pode ser zero");
        }
        break;

        default:
        System.out.println("Erro");
            break;
        }

        scanner.close();
    }
}
