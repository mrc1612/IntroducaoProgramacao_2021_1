import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       int lado1, lado2, lado3;

        System.out.println("Informe o lado 1 do triângulo");
        lado1 = teclado.nextInt();

        System.out.println("Informe o lado 2 do triângulo");
        lado2 = teclado.nextInt();

        System.out.println("Informe o lado 3 do triângulo");
        lado3 = teclado.nextInt();

        if (lado1 == lado2 && lado1 == lado3 ) {
            System.out.println("É um triângulo equilátero");
        } else if (lado1 == lado2 && lado1 != lado3) {
                System.out.println("O triângulo é isósceles");
        } else if (lado1 == lado3 && lado1 != lado2) {
                System.out.println("O triângulo é isósceles");  
        } else if (lado2 == lado3 && lado2 != lado1) {
                System.out.println("O triângulo é isósceles");   
        } else if (lado2 != lado3 && lado2 != lado1 && lado3 != lado1) {
                System.out.println("O triângulo é escaleno");
        } else {
            System.out.println("Não formam um triângulo");
        }
    }
}