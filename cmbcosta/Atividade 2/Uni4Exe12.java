import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lado 1");

        double lado = scanner.nextDouble();

        System.out.println("Lado 2");

        double lado1 = scanner.nextDouble();

        System.out.println("Lado 3");

        double lado2 = scanner.nextDouble();
        
        if (lado > lado1 + lado2 || lado1 > lado + lado2 || lado2 > lado + lado1) {
            System.out.println("Os valores não formam um triângulo.");
        }
        else if( lado == lado1 && lado == lado2) {
            System.out.println("O triângulo é equilátero.");
        }
        else if ((lado == lado1) || (lado2 == lado1 ) || (lado == lado2)) {
            System.out.println("O triângulo é isósceles.");
        }
        else {
            System.out.println("O triângulo é escaleno.");
        }


        scanner.close();
    }
}