import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro lado: ");
        int lado1 = teclado.nextInt();

        System.out.print("Informe o segundo lado: ");
        int lado2 = teclado.nextInt();

        System.out.print("Informe o terceiro lado: ");
        int lado3 = teclado.nextInt();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                System.out.println("Triângulo escaleno");
            } else {
                System.out.println("Triângulo isóscele");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

        teclado.close();

    }
}
