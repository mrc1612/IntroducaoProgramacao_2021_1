import java.util.Scanner;

/*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula: volume = Pi * raio2 * altura */

public class Uni3Exe09 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double raio, alt, vol, raio2;

        System.out.println("Digite o raio (em cm): ");
        raio = teclado.nextDouble();

        System.out.println("Digite a altura (em cm): ");
        alt = teclado.nextDouble();

        raio2 = (raio * raio);

        vol = (3.14 * raio2 * alt);

        System.out.println("O volume é: " + vol + " cm³");

        teclado.close();

    }
    
}
