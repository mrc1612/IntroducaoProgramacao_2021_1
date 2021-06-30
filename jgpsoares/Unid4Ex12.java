import java.util.Scanner;

public class Unid4Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o comprimento do primeiro lado do triângulo: ");
        int lado1 = teclado.nextInt();
        System.out.print("Informe o comprimento do segundo lado do triângulo: ");
        int lado2 = teclado.nextInt();
        System.out.print("Informe o comprimento do terceiro lado do triângulo: ");
        int lado3 = teclado.nextInt();
        if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2) {
            System.out.println("Os valores não formam um triângulo.");
        }
        else if( lado1 == lado2 && lado1 == lado3) {
            System.out.println("O triângulo é equilátero.");
        }
        else if ((lado1 == lado2 && lado1 != lado3) || (lado3 == lado2 && lado3 != lado1) || (lado1 == lado3 && lado1 != lado2)) {
            System.out.println("O triângulo é isósceles.");
        }
        else {
            System.out.println("O triângulo é escaleno.");
        }
    }    
}