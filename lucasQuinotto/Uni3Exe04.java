import java.util.Scanner;

public class Uni3Exe04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota01 = teclado.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota02 = teclado.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota03 = teclado.nextDouble();

        System.out.println("Média Ponderada: " + ((nota01 * 5) + (nota02 * 3) + (nota03 * 2)) / 10);


    }
}
