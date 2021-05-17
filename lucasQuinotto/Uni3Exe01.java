import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.print("Valor da base: ");
        double baseTerreno = teclado.nextDouble();

        System.out.print("Valor da altura: ");
        double alturaTerreno = teclado.nextDouble();

        System.out.println("\nÁrea do terreno: " + (baseTerreno * alturaTerreno));
    }
}
