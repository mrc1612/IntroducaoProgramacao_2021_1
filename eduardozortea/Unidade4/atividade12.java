package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2) {
            System.out.println("Os valores não formam um triângulo.");
        }
        else if( lado1 == lado2 && lado1 == lado3) {
            System.out.println("O triângulo é equilátero.");
        }
        else if ((lado1 == lado2) || (lado3 == lado2 ) || (lado1 == lado3)) {
            System.out.println("O triângulo é isósceles.");
        }
        else {
            System.out.println("O triângulo é escaleno.");
        }

        scanner.close();
    }
}
