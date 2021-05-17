import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha: ");
        System.out.println("‘T’: calcular a área de um triângulo de base b e altura h");
        System.out.println("‘Q’: calcular a área de um quadrado de lado l");
        System.out.println("‘R’: calcular a área de um retângulo de base b e altura h");
        System.out.println("‘C’: calcular a área de um círculo de raio r");
        String escolha = teclado.nextLine().toUpperCase();

        switch (escolha) {
        case "T":
            System.out.println("Base: ");
            int base = teclado.nextInt();

            System.out.println("Altura: ");
            int altura = teclado.nextInt();

            System.out.println("Área: " + ((base * altura) / 2));
            break;
        case "Q":
            System.out.println("Lado: ");
            int lado = teclado.nextInt();

            System.out.println("Área: " + (lado * lado));
            break;
        case "R":
            System.out.println("Base: ");
            int baseR = teclado.nextInt();

            System.out.println("Altura: ");
            int alturaR = teclado.nextInt();

            System.out.println("Área: " + (baseR * alturaR));
            break;
        case "C":
            System.out.println("Raio: ");
            int raio = teclado.nextInt();

            System.out.println("Área: " + (Math.PI * (raio * raio)));
            break;
        default:
            System.out.println("Erro");
            break;
        }
    }
}