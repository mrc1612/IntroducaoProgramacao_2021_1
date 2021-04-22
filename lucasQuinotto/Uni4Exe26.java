import java.util.Scanner;

import org.graalvm.compiler.asm.amd64.AMD64Address.Scale;

public class Uni4Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String letra;

        System.out.println("Informe uma letra:");
        System.out.println(" ‘T’: calcular a área de um triângulo (base e altura) ");
        System.out.println(" ‘R’: calcular a área de um retângulo (base e altura) ");
        System.out.println(" ‘C’: calcular a área de um círculo (raio) ");
        System.out.println(" ‘Q’: calcular a área de um quadrado (lados) ");
        letra = teclado.nextLine().toUpperCase();

        switch (letra) {

            case "T": 
            System.out.println("Base: ");
            int base = teclado.nextInt();

            System.out.println("Altura: ");
            int altura = teclado.nextInt();

            System.out.println("Área: " + ((base * altura) / 2));
            break;

            case "R": 
            System.out.println("Base: ");
            int bR = teclado.nextInt();

            System.out.println("Altura: ");
            int aR = teclado.nextInt();

            System.out.println("Área: " + (bR * aR));
            break;

            case "C": 
            System.out.println("Raio: ");
            int raio = teclado.nextInt();

            System.out.println("Área: " + (3.14 * (raio * raio)));
            break;

            case "Q": 
            System.out.println("Lado: ");
            int lado = teclado.nextInt();

            System.out.println("Área: " + (lado * 4));
            break;

            default: 
            System.out.println("Inválido.");
            break;

        }
        teclado.close();

    }
}
