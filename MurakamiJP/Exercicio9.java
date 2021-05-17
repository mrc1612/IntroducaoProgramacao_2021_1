import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio: ");
        double raio = teclado.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = teclado.nextDouble();

        System.out.println("O volume total será: " + (3.14 * Math.pow(raio, 2) * altura));
        
        teclado.close();
    }
}